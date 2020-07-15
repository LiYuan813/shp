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
    <s:form>
        <s:hidden name="id"></s:hidden>
        <div class="ItemBlock_Title1"><!-- 信息说明<DIV CLASS="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 岗位信息 </DIV>  -->
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                   <tr><td>文件地址：</td>
                        <td><s:textfield  name="filePath" id="filePath" /> </td>
                    </tr>
                     <tr><td>文件名称：</td>
                        <td><s:textfield  name="fileName" id="filename" /> </td>
                    </tr>
                </table>
            </div>
        </div>
        
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <s:a  action="role_importExcel"> <img src="${pageContext.request.contextPath}/style/images/save.png"/></s:a>
            <a href="javascript:history.go(-1);"><img src="${pageContext.request.contextPath}/style/images/goBack.png"/></a>
        </div>
    </s:form>
</div>

</body>
</html>




