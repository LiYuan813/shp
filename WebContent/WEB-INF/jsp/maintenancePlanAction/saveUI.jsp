<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>保养计划</title>
    <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body>

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 保养计划
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id=MainArea>
    <s:form action="maintenancePlan_%{id==null?'add':'edit'}">
     
     
      <s:hidden name="id"></s:hidden>
      
      
        <div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 保养计划</div> 
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr><td>Supplier</td>
                        <td><s:textfield name="supplier" cssClass="InputStyle"/> </td>
                    </tr>
					<tr><td>Measure Room</td>
						<td><s:textfield name="measureroom" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>CMM No.</td>
                         <td><s:textfield name="cmmno" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>Machine</td>
						<td><s:textfield name="machine" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>2019 Maintenance Plan</td>
                         <td><s:textfield name="maintainplan" cssClass="InputStyle"/> </td>
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

