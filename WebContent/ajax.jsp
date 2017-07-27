<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#ip1").blur(function(){
		
		var v_name = $(this).val();
		alert(v_name);
		$.ajax({
            type: "post",
            url: "checkname",
            data: "loginName="+v_name,
            dataType:"json",
            success: function(data){
                alert(data)
                if(!data){
                	$("#sp01").text("被占用！");
                }else
                	$("#sp01").text("可用！");
            }
        })
		
		
	})
	
})

</script>

</head>
<body>
    <div>
        姓名：<input type="text" id="ip1"><span id="sp01"></span>
       
    </div>
</body>
</html>