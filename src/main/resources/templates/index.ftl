<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="utf-8">
    <title>websocket通讯</title>
</head>
<script>
    //获取当前窗口的主机名
    var host = window.location.host;
    alert(host)
    var socket;
    function openSocket() {
        if(typeof(WebSocket) == "undefined") {
            console.log("您的浏览器不支持WebSocket");
        }else{
            console.log("您的浏览器支持WebSocket");
            //实现化WebSocket对象，指定要连接的服务器地址与端口  建立连接
            //等同于socket = new WebSocket("ws://localhost:8888/xxxx/im/25");
            //var socketUrl=" /im/"+$("#userId").val();
            var socketUrl="http://"+host+"/im/"+$("#userId").val();
            socketUrl=socketUrl.replace("https","ws").replace("http","ws");
            console.log(socketUrl)
            socket = new WebSocket(socketUrl);
            //打开事件
            socket.onopen = function() {
                console.log("websocket已打开");
                //socket.send("这是来自客户端的消息" + location.href + new Date());
            };
            //获得消息事件
            socket.onmessage = function(msg) {
                console.log(msg.data);
                //发现消息进入    开始处理前端触发逻辑
            };
            //关闭事件
            socket.onclose = function() {
                console.log("websocket已关闭");
            };
            //发生了错误事件
            socket.onerror = function() {
                console.log("websocket发生了错误");
            }
        }
    }
    function sendMessage() {
        if(typeof(WebSocket) == "undefined") {
            console.log("您的浏览器不支持WebSocket");
        }else {
            console.log("您的浏览器支持WebSocket");
            console.log('[{"toUserId":"'+$("#toUserId").val()+'","contentText":"'+$("#contentText").val()+'"}]');
            socket.send('[{"toUserId":"'+$("#toUserId").val()+'","contentText":"'+$("#contentText").val()+'"}]');
        }
    }
</script>
<script src="/js/jquery.js"></script>
<body>

<p>【userId】：<div><input id="userId" name="userId" type="text" value="25"></div>
<p>【toUserId】：<div><input id="toUserId" name="toUserId" type="text" value="26"></div>
<p>【toUserId】：<div><input id="contentText" name="contentText" type="text" value="嗷嗷嗷"></div>
<p>【操作】：<div><a onclick="openSocket()">开启socket</a></div>
<p>【操作】：<div><a onclick="sendMessage()">发送消息</a></div>
</body>

</html>