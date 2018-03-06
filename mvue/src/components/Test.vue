<template>
  <div class="hello">
    <span :class="{'a':'A','b':'B','c':'C','d':'D'}[msg]">this is test</span>
    <father value1="hahah" :value2 = "value2"></father>
  </div>
</template>

<script>
import fatherVue from './ChildComponent.vue'
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'a',
      value2:"ddddd"
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
