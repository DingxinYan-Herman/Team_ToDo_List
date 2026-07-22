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

<style>
    .node-border {
        box-sizing: border-box;
        min-width: 260px;
        max-width: 360px;
        margin: 16px;
        padding: 16px 18px;
        border: 1px solid #d8dee8;
        border-radius: 8px;
        background: #ffffff;
        box-shadow: 0 10px 28px rgba(15, 23, 42, 0.08);
        color: #182230;
        transition:
            transform 160ms ease,
            border-color 160ms ease,
            box-shadow 160ms ease;
    }

    .node-border:hover {
        transform: translateY(-2px);
        border-color: #9aa8bc;
        box-shadow: 0 16px 36px rgba(15, 23, 42, 0.12);
    }

    .node-title,
    .node-infor {
        display: flex;
        align-items: center;
        justify-content: space-between;
        gap: 16px;
    }

    .node-title {
        margin-bottom: 12px;
    }

    .node-infor {
        margin-top: 12px;
        color: #667085;
        font-size: 13px;
        line-height: 1.4;
    }

    hr {
        height: 1px;
        margin: 0;
        border: 0;
        background: #edf1f7;
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
        color: #101828;
        font-size: 22px;
        font-weight: 700;
        line-height: 1.2;
    }

    .node-title-status {
        flex: 0 0 auto;
        padding: 4px 10px;
        border-radius: 999px;
        color: #ffffff;
        font-size: 12px;
        font-weight: 700;
        line-height: 1.2;
        text-transform: uppercase;
    }

    .status-finished {
        background: green;
        color: white;
    }

    .status-unfinished {
        background: red;
        color: white;
    }

    .node-infor-author {
        font-weight: 600;
    }
</style>
