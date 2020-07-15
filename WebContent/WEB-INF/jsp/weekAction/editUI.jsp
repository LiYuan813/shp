<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>TPM周信息</title>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
  <style type="text/css">
	 tr{
	 height:20px;
	 }
	</style>
</head>
<body> 

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> TPM周完成信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id="MainArea">
    <s:form action="week_edit">
        <s:hidden name="id"></s:hidden>
        <div class="ItemBlock_Title1"><!-- 信息说明<DIV CLASS="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 岗位信息 </DIV>  -->
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                 <table border="0" cellspacing="0" width="800" height="360" class="mainForm">
  <tr>
	<td>第1周：
	<select name="week1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第2周：
	<select name="week2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第3周：
	<select name="week3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第4周  ：
	<select name="week4">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
   <tr>
	<td>第5周：
	<select name="week5">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第6周：
	<select name="week6">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第7周：
	<select name="week7">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第8周 ：
	<select name="week8">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
     <tr>
	<td>第9周 ：
	<select name="week9">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第10周：
	<select name="week10">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第11周：
	<select name="week11">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第12周：
	<select name="week12">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
    <tr>
	<td>第13周：
	<select name="week13">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第14周：
	<select name="week14">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第15周：
	<select name="week15">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第16周：
	<select name="week16">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
    <tr>
	<td>第17周：
	<select name="week17">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第18周：
	<select name="week18">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第19周：
	<select name="week19">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第20周：
	<select name="week20">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
     <tr>
	<td>第21周：
	<select name="week21">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第22周：
	<select name="week22">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第23周：
	<select name="week23">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第24周：
	<select name="week24">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
     <tr>
	<td>第25周：
	<select name="week25">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第26周：
	<select name="week26">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第27周：
	<select name="week27">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第28周：
	<select name="week28">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
     <tr>
	<td>第29周：
	<select name="week29">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第30周：
	<select name="week30">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第31周：
	<select name="week31">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第32周：
	<select name="week32">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
     <tr>
	<td>第33周：
	<select name="week33">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第34周：
	<select name="week34">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第35周：
	<select name="week35">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第36周：
	<select name="week36">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
     <tr>
	<td>第37周：
	<select name="week37">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第38周：
	<select name="week38">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第39周：
	<select name="week39">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第40周：
	<select name="week40">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
     <tr>
	<td>第41周：
	<select name="week41">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第42周：
	<select name="week42">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第43周：
	<select name="week43">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第44周：
	<select name="week44">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
    <tr>
	<td>第45周：
	<select name="week45">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第46周：
	<select name="week46">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第47周：
	<select name="week47">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第48周：
	<select name="week48">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
     <tr>
	<td>第49周：
	<select name="week49">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>

	<td>第50周：
	<select name="week50">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第51周：
	<select name="week51">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
	<td>第42周：
	<select name="week52">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
    </select>
	</td>
  </tr>
  </table>
            </div>
        </div>
        
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="${pageContext.request.contextPath}/style/images/save.png"/>
            <a href="javascript:history.go(-1);"><img src="${pageContext.request.contextPath}/style/images/goBack.png"/></a>
        </div>
    </s:form>
</div>

</body>
</html>