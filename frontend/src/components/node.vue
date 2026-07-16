<template>
    <div class="node-border">
        <div class="node-title">
            <p class="node-title-name"> {{ node.name }} </p>
            <p class="node-title-status"> {{ node.finished }} </p>
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
</script>

<style>
    .node-border {
        border: black 1px solid;
        border-radius: 10px;
        width: fit-content;
        margin: 15px;
    }

    .node-title {
        align-items: flex-end;
    }

    .node-infor {
        justify-content: space-between;
    }

    hr {
        margin: 0px;
    }

    .node-title-name {
        font-size: 30px;
    }

    .node-infor,
    .node-title {
        display: flex;
        gap: 20px;
    }

    .node-title-name,
    .node-infor-author,
    .node-infor-time,
    .node-title-status {
        padding: 0px;
        margin: 5px;
    }


</style>