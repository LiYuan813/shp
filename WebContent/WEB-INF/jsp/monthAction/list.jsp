<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>TPM月表</title>
<%@ taglib prefix="s" uri="/struts-tags" %>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
 <style type="text/css">
   #month{
      width:60px;
   }
  </style>
  <script type="text/javascript" src="${pageContext.request.contextPath}/script/jquery.js"></script>
	<script type="text/javascript">
	$(function(){
		function projectName() {
		    // 1、获取当前全路径，如： http://localhost:8080/springmvc/page/frame/test.html
		    var curWwwPath = window.location.href;
		    // 获取当前相对路径： /springmvc/page/frame/test.html
		    var pathName = window.location.pathname;    // 获取主机地址,如： http://localhost:8080
		    //var local = curWwwPath.substring(0,curWwwPath.indexOf(pathName));  
		    // 获取带"/"的项目名，如：/springmvc  
		    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);  
		    //var rootPath = local + projectName;  
		    return projectName; 
		};
		/*
		var flag;
		$("a[name='edit']").click(function(){
			flag=1;
			alert(flag);
		});
		
		*/
			$("#year").dblclick(function(){
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
			var projectName=projectName();
			// /shp/style/images/whiteA.png
			var colorsA=[projectName+'/style/images/greenA.png',projectName+'/style/images/redA.png',projectName+'/style/images/whiteA.png'];
			var colorFlagA=0;
			 $(".colorA").click(function(){
				$(this).children("img").attr("src",colorsA[colorFlagA]);
				   colorFlagA++;
				   if(colorFlagA==colorsA.length)colorFlagA=0;			
			});
				var colorsB=[projectName+'/style/images/greenB.png',projectName+'/style/images/redB.png',projectName+'/style/images/whiteB.png'];
				var colorFlagB=0;
				 $(".colorB").click(function(){
					$(this).children("img").attr("src",colorsB[colorFlagB]);
					   colorFlagB++;
					   if(colorFlagB==colorsB.length)colorFlagB=0;			
				}); 
		
				 
				
				 $("a[name='save']").click(function(){
					 var year=$("#year").text();
					 var month1operator1=$(".operator").eq(0).text();
					 var month2operator1=$(".operator").eq(1).text();
					 var month3operator1=$(".operator").eq(2).text();
					 var month4operator1=$(".operator").eq(3).text();
					 var month5operator1=$(".operator").eq(4).text();
					 var month6operator1=$(".operator").eq(5).text();
					 var month7operator1=$(".operator").eq(6).text();
					 var month8operator1=$(".operator").eq(7).text();
					 var month9operator1=$(".operator").eq(8).text();
					 var month10operator1=$(".operator").eq(9).text();
					 var month11operator1=$(".operator").eq(10).text();
					 var month12operator1=$(".operator").eq(11).text();
					 
					 var month1operator2=$(".operator").eq(12).text();
					 var month2operator2=$(".operator").eq(13).text();
					 var month3operator2=$(".operator").eq(14).text();
					 var month4operator2=$(".operator").eq(15).text();
					 var month5operator2=$(".operator").eq(16).text();
					 var month6operator2=$(".operator").eq(17).text();
					 var month7operator2=$(".operator").eq(18).text();
					 var month8operator2=$(".operator").eq(19).text();
					 var month9operator2=$(".operator").eq(20).text();
					 var month10operator2=$(".operator").eq(21).text();
					 var month11operator2=$(".operator").eq(22).text();
					 var month12operator2=$(".operator").eq(23).text();
					 
					 var month1operator3=$(".operator").eq(24).text();
					 var month2operator3=$(".operator").eq(25).text();
					 var month3operator3=$(".operator").eq(26).text();
					 var month4operator3=$(".operator").eq(27).text();
					 var month5operator3=$(".operator").eq(28).text();
					 var month6operator3=$(".operator").eq(29).text();
					 var month7operator3=$(".operator").eq(30).text();
					 var month8operator3=$(".operator").eq(31).text();
					 var month9operator3=$(".operator").eq(32).text();
					 var month10operator3=$(".operator").eq(33).text();
					 var month11operator3=$(".operator").eq(34).text();
					 var month12operator3=$(".operator").eq(35).text();
					 
					 var year1operator1=$(".operator").eq(36).text();
					 var year2operator1=$(".operator").eq(37).text();
					 var year1operator2=$(".operator").eq(38).text();
					 var year2operator2=$(".operator").eq(39).text();
					 
					 var month1color1=$(".colorA").eq(0).children("img").attr("src");
					 month1color1=month1color1.substring(18,month1color1.indexOf("A.png"));
					 var month3color1=$(".colorA").eq(1).children("img").attr("src");
					 month3color1=month3color1.substring(18,month3color1.indexOf("A.png"));
					 var month5color1=$(".colorA").eq(2).children("img").attr("src");
					 month5color1=month5color1.substring(18,month5color1.indexOf("A.png"));
					 var month7color1=$(".colorA").eq(3).children("img").attr("src");
					 month7color1=month7color1.substring(18,month7color1.indexOf("A.png"));
					 var month9color1=$(".colorA").eq(4).children("img").attr("src");
					 month9color1=month9color1.substring(18,month9color1.indexOf("A.png"));
					 var month11color1=$(".colorA").eq(5).children("img").attr("src");
					 month11color1=month11color1.substring(18,month11color1.indexOf("A.png"));
					 
					 var month1color2=$(".colorA").eq(6).children("img").attr("src");
					 month1color2=month1color2.substring(18,month1color2.indexOf("A.png"));
					 var month3color2=$(".colorA").eq(7).children("img").attr("src");
					 month3color2=month3color2.substring(18,month3color2.indexOf("A.png"));
					 var month5color2=$(".colorA").eq(8).children("img").attr("src");
					 month5color2=month5color2.substring(18,month5color2.indexOf("A.png"));
					 var month7color2=$(".colorA").eq(9).children("img").attr("src");
					 month7color2=month7color2.substring(18,month7color2.indexOf("A.png"));
					 var month9color2=$(".colorA").eq(10).children("img").attr("src");
					 month9color2=month9color2.substring(18,month9color2.indexOf("A.png"));
					 var month11color2=$(".colorA").eq(11).children("img").attr("src");
					 month11color2=month11color2.substring(18,month11color2.indexOf("A.png"));
					 
					 var month1color3=$(".colorA").eq(12).children("img").attr("src");
					 month1color3=month1color3.substring(18,month1color3.indexOf("A.png"));
					 var month3color3=$(".colorA").eq(13).children("img").attr("src");
					 month3color3=month3color3.substring(18,month3color3.indexOf("A.png"));
					 var month5color3=$(".colorA").eq(14).children("img").attr("src");
					 month5color3=month5color3.substring(18,month5color3.indexOf("A.png"));
					 var month7color3=$(".colorA").eq(15).children("img").attr("src");
					 month7color3=month7color3.substring(18,month7color3.indexOf("A.png"));
					 var month9color3=$(".colorA").eq(16).children("img").attr("src");
					 month9color3=month9color3.substring(18,month9color3.indexOf("A.png"));
					 var month11color3=$(".colorA").eq(17).children("img").attr("src");
					 month11color3=month11color3.substring(18,month11color3.indexOf("A.png"));
					 var year1color1=$(".colorA").eq(18).children("img").attr("src");
					 year1color1=year1color1.substring(18,year1color1.indexOf("A.png"));
					 var year1color2=$(".colorA").eq(19).children("img").attr("src");
					 year1color2=year1color2.substring(18,year1color2.indexOf("A.png"));
					 
					 var month2color1=$(".colorB").eq(0).children("img").attr("src");
					 month2color1=month2color1.substring(18,month2color1.indexOf("B.png"));
					 var month4color1=$(".colorB").eq(1).children("img").attr("src");
					 month4color1=month4color1.substring(18,month4color1.indexOf("B.png"));
					 var month6color1=$(".colorB").eq(2).children("img").attr("src");
					 month6color1=month6color1.substring(18,month6color1.indexOf("B.png"));
					 var month8color1=$(".colorB").eq(3).children("img").attr("src");
					 month8color1=month8color1.substring(18,month8color1.indexOf("B.png"));
					 var month10color1=$(".colorB").eq(4).children("img").attr("src");
					 month10color1=month10color1.substring(18,month10color1.indexOf("B.png"));
					 var month12color1=$(".colorB").eq(5).children("img").attr("src");
					 month12color1=month12color1.substring(18,month12color1.indexOf("B.png"));
					 
					 var month2color2=$(".colorB").eq(6).children("img").attr("src");
					 month2color2=month2color2.substring(18,month2color2.indexOf("B.png"));
					 var month4color2=$(".colorB").eq(7).children("img").attr("src");
					 month4color2=month4color2.substring(18,month4color2.indexOf("B.png"));
					 var month6color2=$(".colorB").eq(8).children("img").attr("src");
					 month6color2=month6color2.substring(18,month6color2.indexOf("B.png"));
					 var month8color2=$(".colorB").eq(9).children("img").attr("src");
					 month8color2=month8color2.substring(18,month8color2.indexOf("B.png"));
					 var month10color2=$(".colorB").eq(10).children("img").attr("src");
					 month10color2=month10color2.substring(18,month10color2.indexOf("B.png"));
					 var month12color2=$(".colorB").eq(11).children("img").attr("src");
					 month12color2=month12color2.substring(18,month12color2.indexOf("B.png"));
					 
					 var month2color3=$(".colorB").eq(12).children("img").attr("src");
					 month2color3=month2color3.substring(18,month2color3.indexOf("B.png"));
					 var month4color3=$(".colorB").eq(13).children("img").attr("src");
					 month4color3=month4color3.substring(18,month4color3.indexOf("B.png"));
					 var month6color3=$(".colorB").eq(14).children("img").attr("src");
					 month6color3=month6color3.substring(18,month6color3.indexOf("B.png"));
					 var month8color3=$(".colorB").eq(15).children("img").attr("src");
					 month8color3=month8color3.substring(18,month8color3.indexOf("B.png"));
					 var month10color3=$(".colorB").eq(16).children("img").attr("src");
					 month10color3=month10color3.substring(18,month10color3.indexOf("B.png"));
					 var month12color3=$(".colorB").eq(17).children("img").attr("src");
					 month12color3=month12color3.substring(18,month12color3.indexOf("B.png"));
					 
					 var year2color1=$(".colorB").eq(18).children("img").attr("src");
					 year2color1=year2color1.substring(18,year2color1.indexOf("B.png"));
					 var year2color2=$(".colorB").eq(19).children("img").attr("src");
					 year2color2=year2color2.substring(18,year2color2.indexOf("B.png"));
					

					 $.ajax({
							type:'post',
							url:'month_save.action',
							data:JSON.stringify({
				                  "year":year,
				                  "month1operator1":month1operator1,
				                  "month2operator1":month2operator1,
				                  "month3operator1":month3operator1,
				                  "month4operator1":month4operator1,
				                  "month5operator1":month5operator1,
				                  "month6operator1":month6operator1,
				                  "month7operator1":month7operator1,
				                  "month8operator1":month8operator1,
				                  "month9operator1":month9operator1,
				                  "month10operator1":month10operator1,
				                  "month11operator1":month11operator1,
				                  "month12operator1":month12operator1,
				                  "month1operator2":month1operator2,
				                  "month2operator2":month2operator2,
				                  "month3operator2":month3operator2,
				                  "month4operator2":month4operator2,
				                  "month5operator2":month5operator2,
				                  "month6operator2":month6operator2,
				                  "month7operator2":month7operator2,
				                  "month8operator2":month8operator2,
				                  "month9operator2":month9operator2,
				                  "month10operator2":month10operator2,
				                  "month11operator2":month11operator2,
				                  "month12operator2":month12operator2,
				                  "month1operator3":month1operator3,
				                  "month2operator3":month2operator3,
				                  "month3operator3":month3operator3,
				                  "month4operator3":month4operator3,
				                  "month5operator3":month5operator3,
				                  "month6operator3":month6operator3,
				                  "month7operator3":month7operator3,
				                  "month8operator3":month8operator3,
				                  "month9operator3":month9operator3,
				                  "month10operator3":month10operator3,
				                  "month11operator3":month11operator3,
				                  "month12operator3":month12operator3,
				                  "year1operator1":year1operator1,
				                  "year2operator1":year2operator1,
				                  "year1operator2":year1operator2,
				                  "year2operator2":year2operator2,
				                  "month1color1":month1color1,
				                  "month1color2":month1color2,
				                  "month1color3":month1color3,
				                  "month2color1":month2color1,
				                  "month2color2":month2color2,
				                  "month2color3":month2color3,
				                  "month3color1":month3color1,
				                  "month3color2":month3color2,
				                  "month3color3":month3color3,
				                  "month4color1":month4color1,
				                  "month4color2":month4color2,
				                  "month4color3":month4color3,
				                  "month5color1":month5color1,
				                  "month5color2":month5color2,
				                  "month5color3":month5color3,
				                  "month6color1":month6color1,
				                  "month6color2":month6color2,
				                  "month6color3":month6color3,
				                  "month7color1":month7color1,
				                  "month7color2":month7color2,
				                  "month7color3":month7color3,
				                  "month8color1":month8color1,
				                  "month8color2":month8color2,
				                  "month8color3":month8color3,
				                  "month9color1":month9color1,
				                  "month9color2":month9color2,
				                  "month9color3":month9color3,
				                  "month10color1":month10color1,
				                  "month10color2":month10color2,
				                  "month10color3":month10color3,
				                  "month11color1":month11color1,
				                  "month11color2":month11color2,
				                  "month11color3":month11color3,
				                  "month12color1":month12color1,
				                  "month12color2":month12color2,
				                  "month12color3":month12color3,
				                  "year1color1":year1color1,
				                  "year1color2":year1color2,
				                  "year2color1":year2color1,
				                  "year2color2":year2color2
				              }),
				            contentType: "application/json",
				            success: function () {
				                alert("保存数据成功！");
				              },
				            error:function(){
				            	alert("保存数据失败！");
				            }
						})
					});
		
	})
	</script>
</head>
<body>
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/>TPM月表
        </div>
        <div id="Title_End"></div>
    </div>
</div>
<div id="MainArea">
  <table border="1"  cellspacing="0" width="1200"  datakey="monthList">
 <s:iterator value="#monthList">
<tr>
	<td colspan="4" height="40" align="center">北京奔驰汽车有限公司</td>
	<td colspan="12" height="40" align="center">测量设备月TPM列表</td>
	
</tr>
<tr height="30">
	<td colspan="2" align="center">所属单位QM/MT</td>
	<td colspan="2" align="center">设备位置/名称</td>
	<td colspan="5" align="center">/</td>
	<td colspan="3" align="center">年份</td>
	<td id="year" colspan="4" align="center">${year}</td>
</tr>
<tr height="30">
	<td  rowspan="2" align="center">序号</td>
	<td  rowspan="2" align="center">项目</td>
	<td  rowspan="2" align="center">保养内容</td>
	<td  rowspan="2" align="center">频次/操作人</td>
	<td  colspan="12" align="center">月/份</td>
			
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
</tr>
<tr height="30">
	<td  rowspan="2" align="center">1</td>
	<td  rowspan="2" align="center">压缩空气过滤器</td>
	<td  rowspan="2" align="center">检查压缩空气过滤器</td>
	<td align="center">月/次</td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month1color1}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month2color1}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month3color1}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month4color1}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month5color1}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month6color1}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month7color1}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month8color1}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month9color1}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month10color1}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month11color1}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month12color1}B.png" /></td>
</tr >
<tr height="30">
	<td align="center">操作人</td>
	<td class="operator">${month1operator1}</td>
	<td class="operator">${month2operator1}</td>
	<td class="operator">${month3operator1}</td>
	<td class="operator">${month4operator1}</td>
	<td class="operator">${month5operator1}</td>
	<td class="operator">${month6operator1}</td>
	<td class="operator">${month7operator1}</td>
	<td class="operator">${month8operator1}</td>
	<td class="operator">${month9operator1}</td>
	<td class="operator">${month10operator1}</td>
	<td class="operator">${month11operator1}</td>
	<td class="operator">${month12operator1}</td>
</tr>
<tr height="30">
	<td  rowspan="2" align="center">2</td>
	<td  rowspan="2" align="center">Y/Z轴导轨</td>
	<td  rowspan="2" align="center">定期清洁Y/Z轴导轨，防止导轨污垢影响机器性能</td>
	<td align="center">月/次</td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month1color2}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month2color2}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month3color2}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month4color2}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month5color2}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month6color2}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month7color2}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month8color2}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month9color2}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month10color2}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month11color2}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month12color2}B.png" /></td>
</tr >
<tr height="30">
	<td align="center">操作人</td>
	<td class="operator">${month1operator2}</td>
	<td class="operator">${month2operator2}</td>
	<td class="operator">${month3operator2}</td>
	<td class="operator">${month4operator2}</td>
	<td class="operator">${month5operator2}</td>
	<td class="operator">${month6operator2}</td>
	<td class="operator">${month7operator2}</td>
	<td class="operator">${month8operator2}</td>
	<td class="operator">${month9operator2}</td>
	<td class="operator">${month10operator2}</td>
	<td class="operator">${month11operator2}</td>
	<td class="operator">${month12operator2}</td>
</tr>
<tr height="30">
	<td align="center" rowspan="2">3</td>
	<td align="center" rowspan="2">擦拭Y/Z轴光栅尺</td>
	<td align="center" rowspan="2">用干净的纱布沿着一个方向擦拭干净光栅</td>
	<td align="center">月/次</td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month1color3}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month2color3}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month3color3}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month4color3}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month5color3}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month6color3}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month7color3}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month8color3}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month9color3}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month10color3}B.png" /></td>
	<td class="colorA"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month11color3}A.png" /></td>
	<td class="colorB"><img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${month12color3}B.png" /></td>
</tr>
<tr height="30">
	<td align="center">操作人</td>
	<td class="operator">${month1operator3}</td>
	<td class="operator">${month2operator3}</td>
	<td class="operator">${month3operator3}</td>
	<td class="operator">${month4operator3}</td>
	<td class="operator">${month5operator3}</td>
	<td class="operator">${month6operator3}</td>
	<td class="operator">${month7operator3}</td>
	<td class="operator">${month8operator3}</td>
	<td class="operator">${month9operator3}</td>
	<td class="operator">${month10operator3}</td>
	<td class="operator">${month11operator3}</td>
	<td class="operator">${month12operator3}</td>
</tr>
<tr height="30">
	<td align="center" rowspan="2">4</td>
	<td align="center" rowspan="2">加润滑油</td>
	<td  align="center" rowspan="2">为机器三轴轴承加注润滑油</td>
	<td align="center">半年/次</td>
	<td class="colorA" align="center" colspan="6"> <img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${year1color1}A.png" /></td>
	<td class="colorB"align="center" colspan="6"> <img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${year2color1}B.png" /></td>
</tr>
<tr  height="30">
	<td align="center">操作人</td>
	<td class="operator" colspan="6"> ${year1operator1}</td>
	<td  class="operator" colspan="6">${year2operator1}</td>
</tr>
<tr height="30">
	<td  rowspan="2" align="center">5</td>
	<td  rowspan="2" align="center">清洁过滤网</td>
	<td  rowspan="2" align="center">清洁控制柜背面风道过滤网</td>
	<td align="center">半年/次</td>
	<td class="colorA" align="center" colspan="6"> <img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${year1color2}A.png" /></td>
	<td class="colorB" align="center" colspan="6"> <img width="30"height="30" src="${pageContext.request.contextPath}/style/images/${year2color2}B.png" /></td>
</tr>
<tr height="30">
	<td align="center">操作人</td>
	<td class="operator" colspan="6"> ${year1operator2}</td>
	<td  class="operator"colspan="6"> ${year2operator2}</td>
</tr>
<tr height="30">
	<td colspan="2" align="center">制表人</td>
	<td align="center">王嵩</td>
	<td  rowspan="3" align="center">备注</td>
	<td align="center" rowspan="3" colspan="12">做了OK涂<font color="green">绿</font>色，没做涂<font color="red">红</font>色，做了有发现异常情况，待处理完成后涂绿色</td>
</tr>
<tr height="30">
	<td colspan="2" align="center">批准人</td>
	<td align="center">王永涛</td>
</tr>
<tr height="30">
	<td colspan="2" align="center">制表日期</td>
	<td align="center">2019年1月1日</td>
</tr>
 </s:iterator>
</table>

<div>
   <div id="TableTail_inside">
         <a name="save">保存</a>
    </div>
</div>
</div>
</body>
</html>