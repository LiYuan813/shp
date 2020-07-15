
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TPM周列表</title>
<%@ taglib prefix="s" uri="/struts-tags" %>
  <style type="text/css">
   *{
     margin:0;
     padding:0;
   }
	#td1{
	    width:68px;
	}
	#td2{
	width:66px;
	}
	#td3{
	width:86px;
	}
	#td4{
	width:69px;
	}
	#td5{
	width:62px;
	}
	#td6{
	width:60px;
	}
	#td7{
	width:60px;
	}
	#td8{
	width:60px;
	}
	#td9{
	width:100px;
	}
	#td10{
	width:43px;
	}
	#td11{
	width:150px;
	}
  </style>
</head>
<body>
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
        <%
		   Date d = new Date();
		   SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   String now = df.format(d).substring(0, 4);
	    %>
        
            <%=now %>年TPM周完成情况
        </div>
        <div id="Title_End"></div>
    </div>
</div>
<table border="0" width="1000" height="550" border="0"  cellspacing="0"
 background="${pageContext.request.contextPath}/style/images/week/bleak.PNG" style="background-size:100% 100%;background-repeat:no-repeat;" >
   <s:iterator value="#weekList">
  <tr height="82">
    <td id="td1"></td>
	<td id="td2"></td>
	<td id="td3"></td>
	<td id="td4"></td>
	<td id="td5"></td>
	<td id="td6"></td>
	<td id="td7"></td>
	<td id="td8"></td>
	<td id="td9"></td>
	<td id="td10"></td>
	<td id="td11"></td>
	<td id="td12"></td>
  </tr>
  <tr  height="44" >
    <td id="td1"></td>
	<td id="td2" align="center">
	    <img src="${pageContext.request.contextPath}/style/images/week/${week1}1.png" width="30" height="38" />
	</td>
	<td id="td3" align="center" > &nbsp;&nbsp;&nbsp;
	    <img src="${pageContext.request.contextPath}/style/images/week/${week2}2.png"  width="30" height="38"  />
	</td>
	<td id="td4" align="center">&nbsp;&nbsp;&nbsp;
	    <img src="${pageContext.request.contextPath}/style/images/week/${week3}3.png"  width="30" height="38"  />
	</td>
	<td id="td5"></td>
	<td id="td6">&nbsp;
	    <img src="${pageContext.request.contextPath}/style/images/week/${week11}11.png"  width="40" height="38" />
	</td>
	<td id="td7" align="center">
	    <img src="${pageContext.request.contextPath}/style/images/week/${week19}19.png" width="40" height="38" />
	</td>
	<td id="td8" align="right">
	    <img src="${pageContext.request.contextPath}/style/images/week/${week20}20.png"  width="40" height="38"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</td>
	<td id="td9"></td>
	<td id="td10" align="center"> 
	    <img src="${pageContext.request.contextPath}/style/images/week/${week21}21.png" width="40" height="38" />
	</td>
	<td id="td11"></td>
	<td id="td12"> 
	    <img src="${pageContext.request.contextPath}/style/images/week/${week45}45.png" width="40" height="38" />
	</td>
  </tr>
  <tr  height="50" >
     <td id="td1"></td>
	<td id="td2"></td>
	<td id="td3" align="center"> &nbsp;&nbsp;&nbsp;
	    <img src="${pageContext.request.contextPath}/style/images/week/${week4}4.png" width="30" height="38" />
	</td>
	<td id="td4"></td>
	<td id="td5"></td>
	<td id="td6">&nbsp;
	    <img src="${pageContext.request.contextPath}/style/images/week/${week12}12.png" width="40" height="38" />
	</td>
	<td id="td7"></td>
	<td id="td8"></td>
	<td id="td9" align="left">
	     <img src="${pageContext.request.contextPath}/style/images/week/${week21}21.png" width="40" height="38" />
	</td>
	<td id="td10" align="center">
	     <img src="${pageContext.request.contextPath}/style/images/week/${week27}27.png" width="40" height="38" />
	</td>
	<td id="td11" align="right">
	      <img src="${pageContext.request.contextPath}/style/images/week/${week34}34.png" width="40" height="38" />
		  &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
		  <img src="${pageContext.request.contextPath}/style/images/week/${week44}44.png" width="40" height="38" />
	</td>
	<td id="td12">  
	       <img src="${pageContext.request.contextPath}/style/images/week/${week46}46.png" width="40" height="38" />
	</td>
  </tr>
  <tr  height="54" >
    <td id="td1"></td>
	<td id="td2"></td>
	<td id="td3" align="center"> &nbsp; &nbsp; 
	      <img src="${pageContext.request.contextPath}/style/images/week/${week5}5.png" width="30" height="38" />
	</td>
	<td id="td4"></td>
	<td id="td5"></td>
	<td id="td6"> &nbsp;
	       <img src="${pageContext.request.contextPath}/style/images/week/${week13}13.png" width="40" height="38" />
	</td>
	<td id="td7"></td>
	<td id="td8"></td>
	<td id="td9"> &nbsp;  &nbsp; 
	      <img src="${pageContext.request.contextPath}/style/images/week/${week22}22.png" width="40" height="38" />
	</td>
	<td id="td10" align="center">
	       <img src="${pageContext.request.contextPath}/style/images/week/${week28}28.png" width="40" height="38" />
	</td>
	<td id="td11"> &nbsp;
	       <img src="${pageContext.request.contextPath}/style/images/week/${week35}35.png" width="40" height="38" />
		   &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
		   <img src="${pageContext.request.contextPath}/style/images/week/${week43}43.png" width="40" height="38" />
	</td>
	<td id="td12">
	       <img src="${pageContext.request.contextPath}/style/images/week/${week47}47.png" width="40" height="38" /> 
	</td>
  </tr>
  <tr  height="50" >
     <td id="td1"></td>
	<td id="td2"></td>
	<td id="td3" align="center"> &nbsp; &nbsp;
	      <img src="${pageContext.request.contextPath}/style/images/week/${week6}6.png" width="30" height="38" />
	</td>
	<td id="td4"></td>
	<td id="td5"></td>
	<td id="td6"> &nbsp;
	       <img src="${pageContext.request.contextPath}/style/images/week/${week14}14.png" width="40" height="38" />
	</td>
	<td id="td7"></td>
	<td id="td8"></td>
	<td id="td9" >
	      <img src="${pageContext.request.contextPath}/style/images/week/${week23}23.png" width="40" height="38" />
	</td>
	<td id="td10">
	      <img src="${pageContext.request.contextPath}/style/images/week/${week29}29.png" width="40" height="38" />
	</td>
	<td id="td11">
	        &nbsp;&nbsp;&nbsp;
	      <img src="${pageContext.request.contextPath}/style/images/week/${week36}36.png" width="40" height="38" />
		   &nbsp;&nbsp; &nbsp;&nbsp;  &nbsp;
		  <img src="${pageContext.request.contextPath}/style/images/week/${week42}42.png" width="40" height="38" />
	</td>
	<td id="td12">
	      <img src="${pageContext.request.contextPath}/style/images/week/${week48}48.png" width="40" height="38" />
	</td>
  </tr>
  <tr  height="55" >
    <td id="td1"></td>
	<td id="td2"></td>
	<td id="td3" align="center"> &nbsp; &nbsp;
	      <img src="${pageContext.request.contextPath}/style/images/week/${week7}7.png" width="30" height="38" />
	</td>
	<td id="td4"></td>
	<td id="td5"></td>
	<td id="td6"> &nbsp;
	       <img src="${pageContext.request.contextPath}/style/images/week/${week15}15.png" width="40" height="38" />
	</td>
	<td id="td7" >
	         <img src="${pageContext.request.contextPath}/style/images/week/${week26}26.png" width="40" height="38" />
	</td>
	<td id="td8" colspan="2">
	        <img src="${pageContext.request.contextPath}/style/images/week/${week25}25.png" width="40" height="38" />
			<img src="${pageContext.request.contextPath}/style/images/week/${week24}24.png" width="40" height="38" />
			 &nbsp; &nbsp; &nbsp;
	</td>
	    
	<td id="td10">
	     <img src="${pageContext.request.contextPath}/style/images/week/${week30}30.png" width="40" height="38" />
	</td>
	<td id="td11">
	      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	     <img src="${pageContext.request.contextPath}/style/images/week/${week37}37.png" width="40" height="38" />
		 &nbsp;
		 <img src="${pageContext.request.contextPath}/style/images/week/${week41}41.png" width="40" height="38" />
	</td>
	<td id="td12">
	     <img src="${pageContext.request.contextPath}/style/images/week/${week49}49.png" width="40" height="38" />
	</td>
  </tr>
  <tr  height="50" >
  <td id="td1"></td>
	<td id="td2"></td>
	<td id="td3" align="center"> &nbsp; &nbsp;
	      <img src="${pageContext.request.contextPath}/style/images/week/${week8}8.png" width="30" height="38" />
	</td>
	<td id="td4"></td>
	<td id="td5"></td>
	<td id="td6"> &nbsp;
	       <img src="${pageContext.request.contextPath}/style/images/week/${week16}16.png" width="40" height="38" />
	</td>
	<td id="td7"></td>
	<td id="td8"></td>
	<td id="td9"></td>
	<td id="td10">
	        <img src="${pageContext.request.contextPath}/style/images/week/${week31}31.png" width="40" height="38" />
	</td>
	<td id="td11">
	        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
	        <img src="${pageContext.request.contextPath}/style/images/week/${week38}38.png" width="40" height="38" />
			<img src="${pageContext.request.contextPath}/style/images/week/${week40}40.png" width="40" height="38" />
	</td>
	<td id="td12">
	        <img src="${pageContext.request.contextPath}/style/images/week/${week50}50.png" width="40" height="38" />
	</td>
  </tr>
  <tr  height="50" >
   <td id="td1"></td>
	<td id="td2"></td>
	<td id="td3" align="center"> &nbsp; &nbsp;
	      <img src="${pageContext.request.contextPath}/style/images/week/${week9}9.png" width="30" height="38" />
	</td>
	<td id="td4"></td>
	<td id="td5"></td>
	<td id="td6"> &nbsp;
	       <img src="${pageContext.request.contextPath}/style/images/week/${week17}17.png" width="40" height="38" />
	</td>
	<td id="td7"></td>
	<td id="td8"></td>
	<td id="td9"></td>
	<td id="td10">
	        <img src="${pageContext.request.contextPath}/style/images/week/${week32}32.png" width="40" height="38" />
	</td>
	<td id="td11" align="center">
	        <img src="${pageContext.request.contextPath}/style/images/week/${week39}39.png" width="40" height="38" />
	</td>
	<td id="td12">
	        <img src="${pageContext.request.contextPath}/style/images/week/${week51}51.png" width="40" height="38" />
	</td>
  </tr>
  <tr  height="50" >
   <td id="td1"></td>
	<td id="td2"></td>
	<td id="td3" align="center"> &nbsp; &nbsp;
	      <img src="${pageContext.request.contextPath}/style/images/week/${week10}10.png" width="40" height="38" />
	</td>
	<td id="td4"></td>
	<td id="td5"></td>
	<td id="td6"> &nbsp;
	       <img src="${pageContext.request.contextPath}/style/images/week/${week18}18.png" width="40" height="38" />
	</td>
	<td id="td7"></td>
	<td id="td8"></td>
	<td id="td9"></td>
	<td id="td10">
	        <img src="${pageContext.request.contextPath}/style/images/week/${week33}33.png" width="40" height="38" />
	</td>
	<td id="td11"></td>
	<td id="td12">
	        <img src="${pageContext.request.contextPath}/style/images/week/${week52}52.png" width="40" height="38" />
	</td>
  </tr>
   <tr>
    <td id="td1"></td>
	<td id="td2"></td>
	<td id="td3"></td>
	<td id="td4"></td>
	<td id="td5"></td>
	<td id="td6"></td>
	<td id="td7"></td>
	<td id="td8"></td>
	<td id="td9"></td>
	<td id="td10"></td>
	<td id="td11"></td>
	<td id="td12"></td>
  </tr>
  </s:iterator>
  </table>
  <div>
        <div id="TableTail_inside">
            <s:a action="week_editUI">修改</s:a>
            <s:a action="week_editUI">重置</s:a>
        </div>
  </div>
</body>
</html>