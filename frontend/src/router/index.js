import { createRouter, createWebHistory } from 'vue-router'

import tree from '../components/tree.vue'

const routes = [
    {
        path:'/',
        redirect: '/tree'
    },
    {
        path: '/tree',
        name: 'tree',
        component: tree
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router