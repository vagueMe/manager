<template>
  <div>
    <h5>11</h5>
    <h5>{{value1}},{{value2}}</h5>
    <h5>{{value1 | matchFilter }}</h5>
    <button @click="send()">发送信息</button><br>
    <el-button type="primary" @click="nextPage">上一页</el-button>
  </div>

</template>

<script>
  import connector from '../Js/childComponJs.js'
  export default {
    name: "father",
    data () {
      return {
        number:1
      }
    },
    methods: {
      send(){
        connector.$emit("messageCon" ,Math.random()*10)
      },
      nextPage(){
        this.$router.go(-1);
      }
    },
    props: ['value1','value2'],
    filters: {
      matchFilter (param) {
        return "this is a filter";
      }
    },
    created(){
      console.log(this.$route.params);
    }
  }
</script>

<style scoped>

</style>
