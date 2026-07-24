import { createRouter, createWebHistory } from 'vue-router'

import home from '../components/page/home.vue'

const routes = [
    {
        path:'/',
        redirect: '/home'
    },
    {
        path: '/home',
        name: 'home',
        component: home
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router