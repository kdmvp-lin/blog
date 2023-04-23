<template>
  <el-card class="box-card">
    <div slot="header" class="clearfix">
      <span style="font-weight: bold;font-size: 20px">系统公告</span>
      <!--<el-button style="float: right; padding: 3px 0" type="text">修改</el-button>-->
    </div>
    <div class="block">
      <el-timeline>
        <el-timeline-item v-for="(item,i) in NoticeList " :key="i" :index="item.id" :timestamp=item.created_time placement="top" style="text-align: left" >
        <el-card>
          <h4>{{item.content}}</h4>
          <p>{{item.nickname}} 提交于 {{ item.created_time }}</p>
        </el-card>
        </el-timeline-item>
      </el-timeline>
    </div>
  </el-card>
</template>

<script>
  export default {
    name: 'UpdateCard',
    data () {
      return {
        NoticeList: []
      }
    },
    mounted: function () {
      this.loadNotice()
    },
    methods: {
      loadNotice () {
        var _this = this
        this.$axios.get('/notice').then(resp => {
          if (resp && resp.status === 200) {
            _this.NoticeList = resp.data
            console.log(_this.NoticeList)
          }
        })
      }
    }
  }
</script>

<style scoped>
  .box-card {
    margin-top: 5px;
    width: 988px;
    height: 1050px;
    text-align: left;
  }
</style>
