<template>
    <div class="node-border">
        <div class="node-title">
            <p class="node-title-name"> {{ node.name }} </p>
            <p class="node-title-status" :class="node.finished ? 'status-finished' : 'status-unfinished'" @click="switchStatus"> {{ node.finished ? 'finished' : 'unfinished' }} </p>
        </div>
        <hr>
        <div class="node-infor">
            <p class="node-infor-time"> {{ node.time }} </p>
            <p class="node-infor-author"> {{ node.author }} </p>
        </div>
    </div>
</template>

<script setup>
    const props = defineProps({
        node: {
            type: Object,
            required: true
        }
    })

    function switchStatus() {
        props.node.finished = !props.node.finished
    }
</script>

<style scoped lang="scss">
    @import '../../style.scss';

    .node-border {
        min-width: 260px;
        max-width: 360px;
        margin: 12px;
        padding: 12px;
        border: 1px solid rgba(238, 238, 238, 0.14);
        border-radius: 8px;
        background: rgba(238, 238, 238, 0.04);
        color: $color-text-primary;
        transition:
            background-color 160ms ease,
            border-color 160ms ease;
    }

    .node-border:hover {
        border-color: rgba(238, 238, 238, 0.24);
        background: rgba(238, 238, 238, 0.1);
    }

    .node-title,
    .node-infor {
        display: flex;
        align-items: center;
        justify-content: space-between;
        gap: 16px;
    }

    .node-title {
        margin-bottom: 10px;
    }

    .node-infor {
        margin-top: 10px;
        color: rgba(238, 238, 238, 0.64);
        font-size: $font-size-xs;
        line-height: 1.4;
    }

    hr {
        height: 1px;
        margin: 0;
        border: 0;
        background: rgba(238, 238, 238, 0.12);
    }

    .node-title-name,
    .node-infor-author,
    .node-infor-time,
    .node-title-status {
        padding: 0;
        margin: 0;
    }

    .node-title-name {
        overflow-wrap: anywhere;
        color: $color-text-primary;
        font-size: $font-size-lg;
        font-weight: 700;
        line-height: 1.25;
    }

    .node-title-status {
        flex: 0 0 auto;
        padding: 5px 10px;
        border-radius: 999px;
        font-size: $font-size-xs;
        font-weight: 700;
        line-height: 1.2;
        cursor: pointer;
        transition:
            background-color 160ms ease,
            color 160ms ease;
    }

    .status-finished {
        background: rgba(34, 197, 94, 0.18);
        color: #86efac;
    }

    .status-unfinished {
        background: rgba(248, 113, 113, 0.16);
        color: #fca5a5;
    }

    .node-infor-author {
        font-weight: 600;
    }
</style>
