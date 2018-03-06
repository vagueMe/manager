<template>
  <div>
    <h5>11</h5>
    <h5>{{value1}},{{value2}}</h5>
    <h5>{{value1 | matchFilter }}</h5>
    <button @click="send()">发送信息</button><br>
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
      }
    },
    props: ['value1','value2'],
    filters: {
      matchFilter:function (param) {
        return "this is a filter";
      }
    }
  }
</script>

<style scoped>

</style>
