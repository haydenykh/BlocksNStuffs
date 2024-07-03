package haydenykh.bns.common.util.context.advanced;

import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class PlaceBlockItemPlacementContext extends ItemPlacementContext {
    public PlaceBlockItemPlacementContext(World world, Hand hand, ItemStack stack, BlockHitResult hit) {
        super(world, null, hand, stack, hit);
        this.canReplaceExisting = world.getBlockState(hit.getBlockPos()).canReplace(this);
    }

    public static PlaceBlockItemPlacementContext of(World world, BlockPos pos, Direction direction, ItemStack stack) {
        return new PlaceBlockItemPlacementContext(world, Hand.MAIN_HAND, stack, new BlockHitResult(new Vec3d((double) pos.getX() + 0.5 + (double) direction.getOffsetX() * 0.5,
                (double) pos.getY() + 0.5 + (double) direction.getOffsetY() * 0.5,
                (double) pos.getZ() + 0.5 + (double) direction.getOffsetZ() * 0.5
        ),
                direction, pos, false
        )
        );
    }

    @Override
    public Direction getPlayerLookDirection() {
        return this.getHitResult().getSide();
    }

    @Override
    public Direction getVerticalPlayerLookDirection() {
        return this.getHitResult().getSide() == Direction.UP ? Direction.UP : Direction.DOWN;
    }

    @Override
    public Direction[] getPlacementDirections() {
        Direction side = this.getHitResult().getSide();
        Direction[] directions = new Direction[]{side, null, null, null, null, side.getOpposite()};
        int var3 = 0;

        for (Direction direction : Direction.values()) {
            if (direction != side && direction != side.getOpposite()) {
                ++var3;
                directions[var3] = side;
            }
        }

        return directions;
    }
}



