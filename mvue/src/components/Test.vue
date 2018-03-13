<template>
  <div class="hello">
    <button @click="get()">接收信息</button><br>
    <span  :class="{'a':'A','b':'B','c':'C','d':'D'}[msg]">this is test</span>
    <span ref="select">这是dom选着示例</span>
    <father ref = "componSelect" value1="hahah" :value2 = "value2"></father>

    <a href="#/Hello">A标签</a><br>
    <router-link to="/Hello"> routerlink to </router-link><br>
    <router-link :to="{name:'Hello',query:{id:1}}">routerlink :to query</router-link><br>
    <router-link :to="{name:'Child',params:{id:123}}">routerlink :to params </router-link><br>
    <el-button type="primary" @click="nextClick">router.push</el-button>
    <el-button type="primary" @click="nextPage">下一页</el-button>
    <br>
    <router-link :to="{name : 'childRouter1'}">子路由1</router-link> <router-link :to="{name : 'childRouter2'}">子路由2</router-link>
    <router-view></router-view>
  </div>
</template>

<script>
import fatherVue from './ChildComponent.vue'
import connector from '../Js/childComponJs.js'

export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'a',
      value2:"ddddd"
    }
  },
  methods:{
    get(){
      connector.$on("messageCon",(temp)=>{
        console.log(temp);
      });
    },
    nextClick(){
      this.$router.push({name:'Child',params:{id:123}});
    },
    nextPage(){
      this.$router.go(1);
    }
  },
  components: {
    'father': fatherVue
  },
  created(){
    console.log(this.$refs.select);
    console.log(this.$refs.componSelect);
  },
  mounted(){
    console.log(this.$refs.select);
    console.log(this.$refs.componSelect.$el);
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.A{
  color: red;
}
.B{
  color:black;
}
.C{
  color: green;
}
.D{
  color: yellow;
}
</style>
