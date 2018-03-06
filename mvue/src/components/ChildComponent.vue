<template>
  <div>
    <h5>11</h5>
    <h5>{{value1}},{{value2}}</h5>
    <h5>{{value1 | matchFilter }}</h5>

  </div>

</template>

<script>
  export default {
    name: "father",
    data () {
      return {
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
