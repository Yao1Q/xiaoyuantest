// index.js
// 获取应用实例
const app = getApp()

Page({
  data: {
    active: 0,
    motto: 'Hello Worlda',
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    canIUseGetUserProfile: false,
    canIUseOpenData: wx.canIUse('open-data.type.userAvatarUrl') && wx.canIUse('open-data.type.userNickName'), // 如需尝试获取用户信息可改为false
    homeimg:{},
    newsnighlights:{}
  },
  onChange(event) {
    // event.detail 的值为当前选中项的索引
    this.setData({ active: event.detail });
    console.log(this.data.active)
  },
  // 事件处理函数
  bindViewTap() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad() {
    var that = this;
    console.log("进来了")
    wx.request({
      // url: 'https://5g8490g928.goho.co/gongchengjixie/homeimg',
      url: 'http://localhost:8081/gongchengjixie/homeimg',

      method:'GET',
      success:function(res){
        console.log(res,"进来时候的res")
        that.setData({ 
          homeimg: res.data.data
        })
      }
    })
    wx.request({
      // url: 'https://5g8490g928.goho.co/gongchengjixie/NewsHighlights',
      url: 'http://localhost:8081/gongchengjixie/NewsHighlights',

      method:'GET',
      success:function(res){
        // console.log(res)
        that.setData({ 
          newsnighlights: res.data.data
        })
      }
    })
    if (wx.getUserProfile) {
      this.setData({
        canIUseGetUserProfile: true
      })
    }
  },
  getUserProfile(e) {
    console.log("进来了")

    // 推荐使用wx.getUserProfile获取用户信息，开发者每次通过该接口获取用户个人信息均需用户确认，开发者妥善保管用户快速填写的头像昵称，避免重复弹窗
    wx.getUserProfile({
      desc: '展示用户信息', // 声明获取用户个人信息后的用途，后续会展示在弹窗中，请谨慎填写
      success: (res) => {
        console.log(res)
        this.setData({ 
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    })
  },
  getUserInfo(e) {
    console.log("进来了")

    // 不推荐使用getUserInfo获取用户信息，预计自2021年4月13日起，getUserInfo将不再弹出弹窗，并直接返回匿名的用户个人信息
    console.log(e)
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },
  home(event){
    console.log("首页")
  },
  DiscoverCampus(event){
    console.log("DiscoverCampus")
    // 这里进行微信登录信息拉取登录
    wx.getUserProfile({
      desc: '登录授权',
      success:function(respose){
        var userimg = respose.userInfo;
        console.log(userimg,"userInfo")
        app.globalData.userimg = userimg.avatarUrl;
        app.globalData.username = userimg.nickName;
        wx.navigateTo({
          url: '../discoveringcampus/discoveringcampus'
        })
      },
      fail:function(err){
       
        console.log("quxiao")
      }
    })
    
  },
  IntegrationCenter(event){
    console.log("IntegrationCenter")
  },
  PersonalCenter(event){
    console.log("PersonalCenter")
  },
})
