// pages/discoveringcampus.js

const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    show: false
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    console.log(app.globalData,"app.globalData")
    wx.login({
      success:function(res){
        var code = res.code
        console.log(code,"hhahaha")
        wx.request({
          url: 'https://api.weixin.qq.com/sns/jscode2session', //接口地址
          method:'GET',
          data: {
            appid:'wx9eb38f569cda3bc5',
            js_code:code,
            grant_type:'authorization_code',
            secret:'9ecd9e64fca360699f0076a7ef9d7a3f',
            code:res.code
          },
          success: function (res) {
            wx.request({
              // url: 'https://5g8490g928.goho.co/gongchengjixie/NewsHighlights',
              url: 'http://localhost:8081/gongchengjixie/PostUser',
              method:'POST',
              header: {
                'content-type': 'application/x-www-form-urlencoded',
                // 'Content-Type': 'application/json'
              },
              data: {
                id:123,
                name:app.globalData.username,
                openid:res.data.openid,
                userimg:app.globalData.userimg
              },
              success:function(res){
                 console.log("成功了哈哈哈哈")
              }
            })
          },
          fail:function(err){

          }
        })
          
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  },

  publish(){
    console.log("进入")
    this.setData ({show:true});
    // console.log("进入sss".this.show)

    // wx.navigateTo({
    //   url: '../publishtext/publishtext'
    // })
  },
  showPopup() {
    this.setData({ show: true });
  },

  onClose() {
    this.setData({ show: false });
  },
  addtext(){
    console.log("发布文字")
    this.setData ({show:true});
    // console.log("进入sss".this.show)

    // wx.navigateTo({
    //   url: '../publishtext/publishtext'
    // })
  },
  addimg(){
    console.log("发布图片")
     wx.navigateTo({
      url: '../addimg/addimg'
    })
    // this.setData ({show:true});
    // wx.chooseImage({
    //   count: 1, // 可选择的图片数量
    //   sizeType: ['compressed'], // 压缩图片
    //   sourceType: ['album', 'camera'], // 来源：相册或相机
    //   success:  (res)=> {
    //     // 将选择的图片上传到服务器
    //     this.uploadImage(res.tempFilePaths[0]);
    //   }
    // })
  },
  uploadImage(imagePath) {
    console.log(imagePath)
    // wx.uploadFile({
    //   url: '服务器地址', // 上传图片的接口地址
    //   filePath: imagePath, // 图片文件路径
    //   name: 'image', // 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容
    //   success: (res) => {
    //     // 上传成功后，将服务器返回的图片地址更新到image标签中
    //     this.setData({
    //       imageUrl: res.data
    //     });
    //   },
    //   fail: function (res) {
    //     console.log(res);
    //   }
    // })
  }
})