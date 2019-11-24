<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css"  media="all">
<title>Insert title here</title>

</head>
<body >
	<div class="layui-row">
    <div class="layui-col-md3 layui-col-md-offset7">
      <div class="grid-demo grid-demo-bg1" style="height: 300px;margin-top: 45%">
      	<form class="layui-form" action="login.action">
      	<div class="layui-form-item">
		    <div class="layui-inline">
				<label class="layui-form-label">用户名</label>
				<div class="layui-input-inline">
				  <input type="tel" name="userId" placeholder="请输入用户名" lay-verify="required" autocomplete="off" class="layui-input">
				</div>
		    </div>
		    <div class="layui-form-item">
			    <label class="layui-form-label">密&nbsp;&nbsp;&nbsp;码</label>
			    <div class="layui-input-block">
			      <input type="password" name="pas" placeholder="请输入密码" lay-verify="required" autocomplete="off" class="layui-input">
			    </div>
		  	</div>
    	</div>
    	
    	<div class="layui-form-item">
		    <div class="layui-input-block">
		      <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">登录</button>
		      <button type="reset" class="layui-btn layui-btn-primary">清空</button>
		    </div>
  		</div>
      	</form>
      </div>
    </div>
  </div>
<script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.all.js"></script>
<script type="text/javascript">
layui.use(['form', 'layedit', 'laydate'], function(){
	//监听提交
	form.on('submit(demo1)', function(data){
	  layer.alert(JSON.stringify(data.field), {
	    title: '最终的提交信息'
	  })
	  return false;
	});
});
</script>
<body>
</html>