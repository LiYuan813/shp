<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
 <style type="text/css">
   #month{
      width:60px;
   }
  </style>
  <script type="text/javascript" src="${pageContext.request.contextPath}/script/jquery.js"></script>
	<script type="text/javascript">
	$(function(){// 相当于在页面中的body标签加上onload事件 
		
		/* 给表格里面每一个td添加一个dblclick事件 */
		$(".operator").dblclick(function(){
			/* 1.先拿到这个td原来的值，然后将这个td变成一个input:text,并且原来的值不动 */
			var tdVal = $(this).text();
		    //创建一个input标签
			var oInput = $("<input type='text' value='"+tdVal+"'/>");
		    //把td变成input
		    $(this).html(oInput);
		    oInput.focus();
		    /* 2.失去焦点，这个td变为原来的text，value为修改过后的value */
			oInput.blur(function(){
				oInput.parent().html(oInput.val());

			});
		});
		var colors=['green','red','white'];
		var colorFlag=0;
		 $(".color").click(function(){
			$(this).css("background-color",colors[colorFlag]);
			   colorFlag++;
			   if(colorFlag==colors.length)colorFlag=0;			
		}); 
	});

	</script>
<title>TPM日表</title>
</head>
<body>
<div >
<table border="1"  cellspacing="0" width="2490">
<tr>
	<td colspan="3" height="40" align="center">北京奔驰汽车有限公司</td>
	<td colspan="31" height="40" align="center">测量设备月TPM列表</td>
	
</tr>
<tr height="30">
	<td colspan="2" align="center">所属单位QM/MT</td>
	<td align="center">设备位置/名称</td>
	<td colspan="8" align="center">/</td>
	<td colspan="3" align="center">班次</td>
	<td colspan="4" align="center"></td>
	<td colspan="5" align="center">记录时间</td>
	   
	<td  colspan="4" align="center"></td>
	<td colspan="2" align="center">年</td>
	<td  colspan="3" align="center"></td>
	<td colspan="2" align="center">月</td>
	
</tr>
<tr height="30">
	<td  rowspan="2" align="center">序号</td>
	<td   rowspan="2" align="center">项目</td>
	<td  rowspan="2" align="center">工作内容</td>
	<td  colspan="31" align="center">日期</td>
			
</tr>
<tr height="30">
		<td align="center"id="month">1</td>
		<td align="center" id="month" >2</td>
		<td align="center" id="month">3</td>
		<td align="center" id="month">4</td>
		<td align="center" id="month">5</td>
		<td align="center" id="month">6</td>
		<td align="center"  id="month">7</td>
		<td align="center"  id="month">8</td>
		<td align="center"  id="month">9</td>
		<td align="center"  id="month">10</td>
		<td align="center"  id="month">11</td>
		<td align="center"  id="month">12</td>
		<td align="center"id="month">13</td>
		<td align="center" id="month" >14</td>
		<td align="center" id="month">15</td>
		<td align="center" id="month">16</td>
		<td align="center" id="month">17</td>
		<td align="center" id="month">18</td>
		<td align="center"  id="month">19</td>
		<td align="center"  id="month">20</td>
		<td align="center"  id="month">21</td>
		<td align="center"  id="month">22</td>
		<td align="center"  id="month">23</td>
		<td align="center"  id="month">24</td>
		<td align="center"id="month">25</td>
		<td align="center" id="month" >26</td>
		<td align="center" id="month">27</td>
		<td align="center" id="month">28</td>
		<td align="center" id="month">29</td>
		<td align="center" id="month">30</td>
		<td align="center"  id="month">31</td>
</tr>
<tr height="30">
	<td  align="center">1</td>
	<td  rowspan="2" align="center">测量机</td>
	<td   align="center">清洁表面，确保无灰尘、无污渍和胶</td>
     <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr >
<tr height="30">
	<td  align="center">2</td>
	<td align="center">观察测量机状态，无卡段、无异响、掉电等</td>
	<td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr>
<tr height="30">
	<td  align="center">3</td>
	<td   align="center">测量平台</td>
	<td   align="center">清洁表面，确保无灰尘、无污渍和胶</td>
     <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr>
<tr height="30">
	<td  align="center">4</td>
	<td  rowspan="2" align="center">控制柜</td>
	<td   align="center">清洁表面，确保无灰尘、无污渍和胶</td>
     <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr >
<tr height="30">
	<td  align="center">5</td>
	<td align="center">观察控制柜运行状态，确保无异响等</td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr>
<tr height="30">
	<td  align="center">6</td>
	<td   align="center">UPS</td>
	<td   align="center">清洁表面，确保无灰尘、无污渍和胶</td>
     <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr>
<tr height="30">
	<td rowspan="2"  align="center">7</td>
	<td  rowspan="2" align="center">测量支具</td>
	<td   align="center">摆放整齐，清洁表面</td>
     <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr >
<tr height="30">
	<td align="center" >检查使用支具，确保支具无损坏，无松动</td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr>
<tr height="30">
	<td rowspan="2"  align="center">8</td>
	<td  rowspan="2" align="center">测量机精度</td>
	<td   align="center">检查单臂精度，确保单臂精度合格</td>
    <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr >
<tr height="30">
	<td align="center" >检查单臂精度，确保双臂精度合格</td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr>
<tr height="30">
	<td  align="center">9</td>
	<td   align="center">线缆</td>
	<td   align="center">检查线缆，确保电线无破损，插头无松动，捆扎有序</td>
     <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
	 <td class="color"></td>
</tr>
<tr height="30">
	<td colspan="3" align="center">操作人</td>
     <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	 <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	 <td class="operator"></td>
	  <td class="operator"></td>
	 <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	 <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	 <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
	  <td class="operator"></td>
</tr>
<tr height="30">
	<td  align="center">制表人</td>
	<td align="center">王嵩</td>
	<td rowspan="3"  align="center">备注</td>
	<td align="center" rowspan="3" colspan="31">做了OK涂<font color="green">绿</font>色，没做涂<font color="red">红</font>色，做了有发现异常情况，待处理完成后涂绿色</td>
</tr>
<tr height="30">
	<td  align="center">批准人</td>
	<td align="center">王永涛</td>
</tr>
<tr height="30">
	<td  align="center">制表日期</td>
	<td align="center">2019年1月1日</td>
</tr>
</table>
<!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <a href=#><img src="${pageContext.request.contextPath}/style/images/save.png"/></a>            
        </div>
    </div>
</div>
</body>
</html>