<template>
<div>
<!--  头像以及个人简介-->
  <el-row>
<!--    圆形头像-->
    <el-col :span="2">
      <img src="../../assets/img/kd.jpg" style="width: 100px;height: 100px;border-radius: 50%">
    </el-col>
    <el-col :span="4">
      <h1>kdmvp-lin</h1>
      <p>我是谁，我从哪里来，我要到哪里去？</p>
    </el-col>
  </el-row>
</div>
</template>

<script>
export default {
  name: 'MyIntroduction'
}
</script>

<style scoped>

</style>
