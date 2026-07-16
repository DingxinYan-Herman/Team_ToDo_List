<template>
    <div class="tree-border">
        <button @click="addNode"> add node </button>
        <button @click="delNode"> delete node </button>

        <node v-for="node in nodeList" :key="node.name" :node="node"/>
    </div>
</template>

<script setup>
    import { ref } from 'vue'
    import node from './node.vue'

    const nodeList = ref([])

    function addNode() {
        const newNode = {
            name: 'New Task',
            author: 'Herman',
            time: new Date().toLocaleDateString(),
            finished: false
        }

        nodeList.value.push(newNode)
    }

    function delNode() {
        nodeList.value.pop()
    }
</script>

<style>
    .tree-border {
        border: black 1px solid;
        border-radius: 10px;
        padding: 10px;
    }
</style>