import Vue from 'vue'
import Router from 'vue-router'
import Test from '@/components/Test'
import Hello from '@/components/HelloWorld'
import Child from '@/components/ChildComponent'
import HeaderVue from '../components/header'
import ChildRouter1 from '../components/childRouter1'
import ChildRouter2 from '../components/childRouter2'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Test',
      components:{
        'Test': Test,
        'headerVue': HeaderVue
      },
      children:[
        {path: '/childRouter1', name: 'childRouter1', component: ChildRouter1 },
        {path: '/childRouter2', name: 'childRouter2', component: ChildRouter2 }
      ]
    },
    {
      path: '/Hello',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/Child/:id',
      name: 'Child',
      component: Child
    }
  ]
})
