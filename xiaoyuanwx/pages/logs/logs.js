// logs.js
const util = require('../../utils/util.js')

Page({
  data: {
    logs: []
  },
  aaaa(){
    wx.request({
      url: 'http://localhost:8081/gongchengjixie/page',
      method:'GET',
      success:function(res){
        console.log(res)
      }
    })
  },
  onLoad() {
    this.setData({
      logs: (wx.getStorageSync('logs') || []).map(log => {
        return {
          date: util.formatTime(new Date(log)),
          timeStamp: log
        }
      })
    })
  }
})
