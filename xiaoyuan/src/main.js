import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import 'element-ui/lib/theme-chalk/index.css';
import ElementUI from 'element-ui';

import { Button,Container,Aside,Header,Main,Radio,RadioGroup,RadioButton,Menu,Submenu,MenuItem,MenuItemGroup,Row,Col,Avatar,Dropdown,DropdownMenu,DropdownItem,Card,Table,TableColumn,Calendar,Divider } from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import VueRouter from 'vue-router'
import RouterConfig from './router/router_Config'


Vue.use(VueRouter);
Vue.use(Button);
Vue.use(Radio);
Vue.use(Container);
Vue.use(Aside);
Vue.use(Header);
Vue.use(Main);
Vue.use(RadioGroup);
Vue.use(RadioButton);
Vue.use(Menu);
Vue.use(Submenu);
Vue.use(MenuItem);
Vue.use(MenuItemGroup);
Vue.use(Row);
Vue.use(Col);
Vue.use(Avatar);
Vue.use(Dropdown);
Vue.use(DropdownMenu);
Vue.use(DropdownItem);
Vue.use(Card);
Vue.use(Table);
Vue.use(TableColumn);
Vue.use(Calendar);
Vue.use(Divider);

Vue.config.productionTip = false
Vue.use(ElementUI);
new Vue({
  el: '#app',
  router: RouterConfig,
  store,
  render: h => h(App)
}).$mount('#app')
