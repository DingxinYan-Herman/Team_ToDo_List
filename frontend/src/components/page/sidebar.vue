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
        padding: 12px;
        overflow: hidden;
        border-right: 1px solid rgba(238, 238, 238, 0.16);
        display: flex;
        flex-direction: column;
    }

    .sidebar-title {
        padding: 10px 8px 14px;
        font-size: $font-size-title;
        line-height: 1.2;
    }

    .sidebar-function {
        display: flex;
        flex-direction: column;
        gap: 4px;
        flex-shrink: 0;
    
        .sidebar-function-title {
            padding: 10px 8px 6px;
            font-size: $font-size-sm;
            color: rgba(238, 238, 238, 0.64);
            letter-spacing: 0;
        }

        button {
            width: 100%;
            min-height: 34px;
            padding: 8px 10px;
            border: 0;
            border-radius: 8px;
            background-color: transparent;
            color: $color-text-primary;
            text-align: left;
            cursor: pointer;
        }

        button:hover {
            background-color: rgba(238, 238, 238, 0.1);
        }
    }

    .sidebar-project {
        display: flex;
        flex-direction: column;
        margin-top: 10px;
        flex: 1;
        min-height: 0;

        .sidebar-project-title {
            padding: 10px 8px 6px;
            font-size: $font-size-sm;
            color: rgba(238, 238, 238, 0.64);
            flex-shrink: 0;
        }
        
        .sidebar-project-list {
            display: flex;
            flex-direction: column;
            gap: 4px;
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
            padding: 8px 10px;
            border-radius: 8px;
            font-size: $font-size-sm;
            line-height: 1.25;
            cursor: pointer;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }

        .sidebar-project-item:hover {
            background-color: rgba(238, 238, 238, 0.1);
        }
    }

    .sidebar-user {
        display: flex;
        align-items: center;
        gap: 10px;
        flex-shrink: 0;
        margin-top: 10px;
        padding: 10px;
        border-radius: 8px;
        border-top: 1px solid rgba(238, 238, 238, 0.12);
        cursor: pointer;

        &:hover {
            background-color: rgba(238, 238, 238, 0.1);
        }

        .sidebar-user-avatar {
            display: flex;
            align-items: center;
            justify-content: center;
            width: 34px;
            height: 34px;
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
            line-height: 1.25;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }

        .sidebar-user-email {
            margin-top: 2px;
            font-size: $font-size-xs;
            line-height: 1.2;
            opacity: 0.72;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }
    }

</style>
