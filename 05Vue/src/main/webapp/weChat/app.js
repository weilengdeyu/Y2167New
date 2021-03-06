'use strict'
var Koa=require('koa')
var path=require('path')
var wechat=require('./wechat/g')
var util=require('./libs/util')
var wechat_file=path.join(__dirname,'./config/wechat.txt')
var config={
  wechat:{
    appID:'wxb7508c61c7f37476',
	appSecret:'1c085d33d1fb363ebc1ab832ffbb67ec',
	token:'weilegndeyuhappytoken',
	getAccessToken:function(){
	   return util.readFileAsync(wechat_file)
	},
	saveAccessToken:function(data){
	   data=JSON.stringify(data)
	   return util.writeFileAsync(wechat_file,data)
	}
  }
}
var app=new Koa()
app.use(wechat(config.wechat))

app.listen(1234)
console.log('Listening:1234 ')
