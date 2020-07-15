<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>保存表格</title>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
 
</head>
<body> 

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 保存表格
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id="MainArea">
    <s:form action="month_edit">
        <s:hidden name="id"></s:hidden>
        <div class="ItemBlock_Title1"><!-- 信息说明<DIV CLASS="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 岗位信息 </DIV>  -->
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
      <table border="0" cellspacing="0">
<tr>
	<td colspan="2"> 年份：<input type="text" name="year"/></td>
</tr>
<tr>
	<td> 一月：<select name="month1color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month1operator1"/></td>
		<td><select name="month1color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month1operator2"/></td>
		<td><select name="month1color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month1operator3"/></td>
</tr>
<tr>
		<td> 二月：<select name="month2color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month2operator1"/></td>
		<td><select name="month2color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month2operator2"/></td>
		<td><select name="month2color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month2operator3"/></td>
</tr>
<tr>
		<td> 三月：<select name="month3color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month3operator1"/></td>
		<td><select name="month3color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month3operator2"/></td>
		<td><select name="month3color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month3operator3"/></td>
</tr>
<tr>
	<td> 四月：<select name="month4color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month4operator1"/></td>
		<td><select name="month4color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month4operator2"/></td>
		<td><select name="month4color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month4operator3"/></td>
</tr>
<tr>
		<td> 五月：<select name="month5color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month5operator1"/></td>
		<td><select name="month5color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month5operator2"/></td>
		<td><select name="month5color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month5operator3"/></td>
</tr>
<tr>
		<td> 六月：<select name="month6color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month6operator1"/></td>
		<td><select name="month6color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month6operator2"/></td>
		<td><select name="month6color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month6operator3"/></td>
</tr>
<tr>
		<td> 七月：<select name="month7color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month7operator1"/></td>
		<td><select name="month7color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month7operator2"/></td>
		<td><select name="month7color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month7operator3"/></td>
</tr>
<tr>
		<td> 八月：<select name="month8color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month8operator1"/></td>
		<td><select name="month8color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month8operator2"/></td>
		<td><select name="month8color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month8operator3"/></td>
</tr>
<tr>
		<td> 九月：<select name="month9color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month9operator1"/></td>
		<td><select name="month9color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month9operator2"/></td>
		<td><select name="month9color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month9operator3"/></td>
</tr>
<tr>
		<td> 十月：<select name="month10color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month10operator1"/></td>
		<td><select name="month10color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month10operator2"/></td>
		<td><select name="month10color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month10operator3"/></td>
</tr>
<tr>
		<td> 十一月：<select name="month11color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month11operator1"/></td>
		<td><select name="month11color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month11operator2"/></td>
		<td><select name="month11color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month11operator3"/></td>
</tr>
<tr>
		<td> 十二月：<select name="month12color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month12operator1"/></td>
		<td><select name="month12color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month12operator2"/></td>
		<td><select name="month12color3">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
        </select></td>
	<td>操作人：<input type="text" name="month12operator3"/></td>
</tr>
<tr>
	<td>上半年：<select name="year1color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
  </select></td>
	<td>操作人：<input type="text" name="year1operator1"/></td>
	<td><select name="year1color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
  </select></td>
	<td>操作人：<input type="text" name="year1operator2"/></td>
</tr>
<tr>
	<td>下半年：<select name="year2color1">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
  </select></td>
	<td>操作人：<input type="text" name="year2operator1"/></td>
	<td><select name="year2color2">
        <option value="white">white</option>
		<option value="red">red</option>
		<option value="green">green</option>
  </select></td>
 <td>操作人：<input type="text" name="year2operator2"/></td>
</tr>
</table>
            </div>
        </div>
        
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image"  src="${pageContext.request.contextPath}/style/images/save.png"/>
            <a href="javascript:history.go(-1);"><img src="${pageContext.request.contextPath}/style/images/goBack.png"/></a>
        </div>
    </s:form>
</div>

</body>
</html>




