<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>问题追踪</title>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body> 

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 问题追踪
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id="MainArea">
    <s:form action="problem_%{id==null?'add':'edit'}">
        <s:hidden name="id"></s:hidden>
        <div class="ItemBlock_Title1"><!-- 信息说明<DIV CLASS="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 岗位信息 </DIV>  -->
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr><td>编号</td>
                        <td><s:textfield name="number" cssClass="InputStyle"/> </td>
                    </tr>
					<tr><td>提出人</td>
						<td><s:textfield name="person1" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>日期</td>
                         <td><s:textfield type="installationDate" name="date" id="installdate" cssClass="InputStyle" />
                         </td>
                    </tr>
                    <tr><td>问题描述</td>
						<td><s:textfield type="warrantyDeadine" name="description" id="expirationdate" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>原因</td>
                         <td><s:textfield name="reason" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>紧急措施</td>
                         <td><s:textfield name="measures" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>紧急措施完成时间</td>
                         <td><s:textfield name="time1" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>负责人</td>
                         <td><s:textfield name="person2" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>长期措施预计完成时间</td>
                         <td><s:textfield name="time2" cssClass="InputStyle"/> </td>
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
