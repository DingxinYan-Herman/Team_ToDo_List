<template>
    <div class="sidebar">
        <p class="sidebar-title"><strong>Team Todo List</strong></p>
        <div class="sidebar-function">
            <p class="sidebar-function-title"><strong>Function</strong></p>
            <button @click="addProject">New Project</button>
            <button @click="delProject">Delete Project</button>
            <button>Change Project Name</button>
            <button>Add a Group</button>
            <button>Invite Others</button>
            <button>Forecasts Section</button>
        </div>
        <div class="sidebar-project">
            <p class="sidebar-project-title"><strong>Project</strong></p>
            <div class="sidebar-project-list">
                <p class="sidebar-project-item" v-for="project in projects" :key="project.id">{{ project.name }}</p>
            </div>
        </div>
        <div class="sidebar-user">
            <div class="sidebar-user-avatar">D</div>
            <div class="sidebar-user-info">
                <p class="sidebar-user-name">Dingxin Yan</p>
                <p class="sidebar-user-email">dingxin@example.com</p>
            </div>
        </div>
    </div>
</template>

<script setup>
    import { ref } from 'vue'

    const projects = ref([])

    function addProject(){
        const newProject = {
            id: Date.now(),
            name: "New project"
        }
        projects.value.push(newProject)
    }

    function delProject(){
        projects.value.pop();
    }
</script>

<style scoped lang="scss">
    @import '../../style.scss';

    .sidebar {
        width: clamp(200px, 18dvw, 280px);
        height: 100dvh;
        overflow: hidden;
        border-right: 1px solid $color-text-primary;
        display: flex;
        flex-direction: column;
    }

    .sidebar-title {
        margin-top:5%;
        margin-left:5%;
        font-size: $font-size-title;
    }

    .sidebar-function {
        display: flex;
        flex-direction: column;
        margin-top: 4%;
        flex-shrink: 0;
    
        .sidebar-function-title {
            margin-top:5%;
            margin-left:5%;
            font-size: $font-size-lg;
        }

        button {
            width: 80%;
            margin-top: 2%;
            margin-left: 10%;
            background-color: $color-bg-page;
            color: $color-text-primary;
        }
    }

    .sidebar-project {
        display: flex;
        flex-direction: column;
        margin-top: 4%;
        flex: 1;
        min-height: 0;

        .sidebar-project-title {
            margin-top:5%;
            margin-left:5%;
            font-size: $font-size-lg;
            flex-shrink: 0;
        }
        
        .sidebar-project-list {
            margin-top: 5%;
            margin-left: 10%;
            overflow-y: auto;
            min-height: 0;
            scrollbar-color: #050505 transparent;
            scrollbar-width: thin;
        }

        .sidebar-project-list::-webkit-scrollbar {
            width: 8px;
        }

        .sidebar-project-list::-webkit-scrollbar-track {
            background: transparent;
        }

        .sidebar-project-list::-webkit-scrollbar-thumb {
            background-color: #050505;
            border-radius: 999px;
        }

        .sidebar-project-item {
            margin-top: 5%;
            margin-left: 5%;
        }
    }

    .sidebar-user {
        display: flex;
        align-items: center;
        gap: 4%;
        flex-shrink: 0;
        margin: 4% 5%;
        padding: 4%;
        border-top: 1px solid rgba(238, 238, 238, 0.24);

        .sidebar-user-avatar {
            display: flex;
            align-items: center;
            justify-content: center;
            width: 36px;
            height: 36px;
            flex-shrink: 0;
            border-radius: 50%;
            background-color: $color-text-primary;
            color: $color-bg-page;
            font-size: $font-size-md;
            font-weight: 700;
        }

        .sidebar-user-info {
            min-width: 0;
        }

        .sidebar-user-name {
            font-size: $font-size-sm;
            font-weight: 700;
        }

        .sidebar-user-email {
            margin-top: 2%;
            font-size: $font-size-xs;
            opacity: 0.72;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }
    }

</style>
