
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import MyPage from "./components/MyPage"
import OrderManager from "./components/OrderManager"

import ReservationManager from "./components/ReservationManager"
import CancellationManager from "./components/CancellationManager"

import PaymentManager from "./components/PaymentManager"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/myPages',
                name: 'MyPage',
                component: MyPage
            },
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },

            {
                path: '/reservations',
                name: 'ReservationManager',
                component: ReservationManager
            },
            {
                path: '/cancellations',
                name: 'CancellationManager',
                component: CancellationManager
            },

            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },



    ]
})
