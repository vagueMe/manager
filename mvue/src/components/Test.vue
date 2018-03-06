<template>
  <div class="hello">
    <button @click="get()">接收信息</button><br>
    <span :class="{'a':'A','b':'B','c':'C','d':'D'}[msg]">this is test</span>
    <father value1="hahah" :value2 = "value2"></father>
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
    }
  },
  components: {
    'father': fatherVue
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
