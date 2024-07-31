import { createRequire } from "module";
import { defineConfig, type DefaultTheme } from "vitepress";

const require = createRequire(import.meta.url);
const pkg = require("../../package.json");

// https://vitepress.dev/reference/site-config
export default defineConfig({
    lang: "en-US",
    title: "Blocks N Stuffs",
    lastUpdated: true,
    description: pkg.description,
    themeConfig: {
        // https://vitepress.dev/reference/default-theme-config
        nav: nav(),

        externalLinkIcon: true,

        lastUpdated: {
            text: "Last updated at",
        },

        search: {
            provider: "local",
        },

        outline: {
            level: "deep",
        },

        footer: {
            message: "⚡ Powered by <b>VitePress</b>",
        },

        sidebar: sidebar(),

        socialLinks: [
            {
                icon: "github",
                link: "https://github.com/haydenykh/BlocksNStuffs",
            },
            {
                icon: "discord",
                link: "https://discord.gg/t7CMXRWs7G",
            },
        ],

        editLink: {
            pattern: "https://github.com/haydenykh/BlocksNStuffs/tree/master/docs/:path",
            text: "Edit this page on GitHub",
        },
    },
});

function nav(): DefaultTheme.NavItem[] {
    return [
        { text: "Home", link: "/" },
        {
            text: "Getting Started",
            items: [
                {
                    text: "What is Blocks N Stuffs?",
                    link: "/getting-started/what-is-blocksnstuffs",
                },
                { text: "Installation", link: "/getting-started/installation" },
                { text: "Credits", link: "/getting-started/credits" },
                { text: "FAQ", link: "/getting-started/faq" },
            ],
        },
        {
            text: "Features",
            items: [
                { text: "Blocks", link: "/features/blocks" },
                { text: "Items", link: "/features/items" },
                { text: "Entities", link: "/features/entities" },
            ],
        },
        { text: "Current Version", items: [{ text: pkg.version, link: "" }] },
    ];
}

function sidebar() {
    return [
        {
            text: "Getting Started",
            items: [
                {
                    text: "What is Blocks N Stuffs?",
                    link: "/getting-started/what-is-blocksnstuffs",
                },
                {
                    text: "Installation",
                    link: "/getting-started/installation",
                },
                { text: "Credits", link: "/getting-started/credits" },
                { text: "FAQ", link: "/getting-started/faq" },
            ],
        },
        {
            text: "Features",
            items: [
                {
                    text: "Blocks",
                    base: "/features/blocks/",
                    collapsed: true,
                    items: [
                        {
                            text: "Terracotta Blocks",
                            link: "terracotta-blocks",
                        },
                        {
                            text: "Glazed Terracotta Blocks",
                            link: "glazed-terracotta-blocks",
                        },
                        {
                            text: "Wool Blocks",
                            link: "wool-blocks",
                        },
                    ],
                },
                {
                    text: "Items",
                    base: "/features/items/",
                    collapsed: true,
                    items: [{ text: "Placeholder", link: "placeholder" }],
                },
                {
                    text: "Entities",
                    link: "/features/entities",
                    collapsed: true,
                },
            ],
        },
        {
            text: "Others",
            base: "/others/",
            items: [
                { text: "To Do", link: "todo" },
                { text: "Version Formatting", link: "version-formatting" },
            ],
        },
    ];
}
