<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./js/jquery-3.2.1.js"></script>
<script type="text/javascript">
$(function(){
	console.log("第一条日志...")
	$.post("initProvince",
			null,
			function(data){
		        //alert(data)
		        for(var i=0;i<data.length;i++){
		        	//alert(i)
		        	$("#prov").append('<option value="'+data[i].id+'">'+data[i].name+'</option>')
		        }
		    },
		   "json"
			)
	$("#prov").on("change",function(){
		var pid = $(this).val();
		$("#city").html('<option value="0">请选择</option>')
		
		$.post("initCity",
				{"pid":pid},
				function(data) {
					for(var i=0;i<data.length;i++){
						$("#city").append('<option value="'+data[i].id+'">'+data[i].name+'</option>')
					}
				},
				"json"
				)
	})
	
	$("#form1").on("submit",function(){
		
        $.post("initCity",
                {"pid":2},
               function(data){
                    alert(data)
                    alert(location.href)
                    //location.href="./index.html"
                },
                "json")
        return false;
	})
	
	$("#b1").on("click",function(){
        
        $.post("ssssss",
                {"pid":2},
               function(data){
                    alert(data)
                })
        return false;
    })
	
	
	
})
</script>
</head>
<body>
    请选择省份：<select id="prov">
                <option value="0">请选择</option>
                
                </select>
    请选择城市：<select id="city">
                <option value="0">请选择</option>
                </select>
  </br>  
  
  <form id="form1" >
   <input type="text" id="username">
   <input type="submit" value="提交">
  
  </form>           
                
   <button id="b1">解析普通数据</button>  
  <!--   <button id="b2">解析JSON数据</button>        -->   

</body>
</html>