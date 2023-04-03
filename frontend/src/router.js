
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UploadManager from "./components/listers/UploadCards"
import UploadDetail from "./components/listers/UploadDetail"

import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import NoticeManager from "./components/listers/NoticeCards"
import NoticeDetail from "./components/listers/NoticeDetail"

import ProcessManager from "./components/listers/ProcessCards"
import ProcessDetail from "./components/listers/ProcessDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/uploads',
                name: 'UploadManager',
                component: UploadManager
            },
            {
                path: '/uploads/:id',
                name: 'UploadDetail',
                component: UploadDetail
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/notices',
                name: 'NoticeManager',
                component: NoticeManager
            },
            {
                path: '/notices/:id',
                name: 'NoticeDetail',
                component: NoticeDetail
            },

            {
                path: '/processes',
                name: 'ProcessManager',
                component: ProcessManager
            },
            {
                path: '/processes/:id',
                name: 'ProcessDetail',
                component: ProcessDetail
            },




    ]
})
