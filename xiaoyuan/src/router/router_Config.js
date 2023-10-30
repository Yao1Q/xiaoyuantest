import VueRouter from 'vue-router'
import Index from '../views/HomeView.vue'
import AboutView from '../views/AboutView.vue'

export default new VueRouter({
    routes:[
        {
            path : "/",
            name: 'home',
            component: Index
        },
        {
            path : "/about",
            name: 'about',
            component: AboutView
        }
    ]
})