package haydenykh.bns.common.block.advanced;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.TransparentBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.ServerTask;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.apache.commons.compress.utils.Lists;

import java.util.List;

public class CopperSpleavesBlock extends TransparentBlock {
    public static final MapCodec<CopperSpleavesBlock> CODEC = createCodec(CopperSpleavesBlock::new);
    private final List<ServerTask> field_44454 = Lists.newArrayList();
    private int ticks;

    protected static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 1.0, 1.0, 15.0, 15.0, 15.0);
    public static Property<Boolean> FALLING = Properties.FALLING;

    public CopperSpleavesBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(FALLING, Boolean.valueOf(false)));
    }

    @Override
    protected MapCodec<? extends CopperSpleavesBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FALLING);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);
//        if (!(entity instanceof MoonCowEntity)) {
            if (!(Boolean) state.get(FALLING) && world instanceof ServerWorld) {
                ServerWorld serverWorld = (ServerWorld) world;
                world.setBlockState(pos, (BlockState) state.with(FALLING, true), 2);
                world.scheduleBlockTick(pos, this, 7);
                int i = world.random.nextInt(3) + 1;
                int j = world.random.nextInt(3) + i;
                serverWorld.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_COPPER_BREAK, SoundCategory.BLOCKS, 0.25F, 1.2F);
                method_51106(i, () -> {
                    serverWorld.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_COPPER_BREAK, SoundCategory.BLOCKS, 0.28F, 1.5F);
                });
                method_51106(j, () -> {
                    serverWorld.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_COPPER_BREAK, SoundCategory.BLOCKS, 0.39F, 1.8F);
                });
            }
//        }
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);
        world.breakBlock(pos, false);
    }

    private void method_51106(int i, Runnable runnable) {
        synchronized (this.field_44454) {
            this.field_44454.add(new ServerTask(this.ticks + i, runnable));
        }
    }
}

