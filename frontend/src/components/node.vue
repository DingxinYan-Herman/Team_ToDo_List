<template>
    <div class="node-border">
        <div class="node-title">
            <p class="node-title-name"> {{ nodeInfor.name }} </p>
            <p class="node-title-status"> {{ nodeInfor.finished }} </p>
        </div>
        <hr>
        <div class="node-infor">
            <p class="node-infor-time"> {{ nodeInfor.time }} </p>
            <p class="node-infor-author"> {{ nodeInfor.author }} </p>
        </div>
    </div>
</template>

<script setup>
    import { reactive } from 'vue'

    const nodeInfor = reactive({
        name: 'Task Name',
        author: 'Herman',
        time: '2026-07-14',
        finished: false
    })
</script>

<style>
    .node-border {
        border: black 1px solid;
        border-radius: 10px;
        width: fit-content;
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