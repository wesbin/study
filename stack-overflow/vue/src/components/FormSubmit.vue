<template>
  <form @submit.prevent="register">
    <div>
      <label>user name</label>
      <input name="usrName" v-model="usrName"/>
    </div>
    <div>
      <label>pass1</label>
      <input name="pass1" v-model="pass1"/>
    </div>
    <div>
      <label>pass2</label>
      <input name="pass2" v-model="pass2"/>
    </div>
    <div>
      <button type="submit">register</button>
    </div>
  </form>
</template>

<script>
export default {
  name: 'FormSubmit',
  data() {
    return {
      usrName: null,
      pass1: null,
      pass2: null,
    }
  },
  methods: {
    register: function (data) {
      console.log('data', data);
      console.log(this.usrName, this.pass1, this.pass1);
    }
  }
};
</script>

<style scoped>

</style>