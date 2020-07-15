<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>维修列表</title>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body> 

!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/>BBAC测量机故障记录（蔡司）
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id=MainArea>
    <s:form action="maintenanceRecords_%{id==null?'add':'edit'}">
      <s:hidden name="id"></s:hidden>
        <div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> BBAC测量机故障记录（蔡司）</div> 
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr><td>序号</td>
                        <td><s:textfield name="num" cssClass="InputStyle"/> </td>
                    </tr>
					<tr><td>测量室</td>
						<td><s:textfield name="measurementRoom" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>测量机臂</td>
                         <td><s:textfield name="testingArm" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>测量机臂号</td>
						<td><s:textfield name="testingArmId" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>问题发生时间</td>
                         <td><s:textfield type="date" name="problemTime" id="timeoftrouble" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td  width="250">问题描述(现象)</td>
                         <td><s:textfield name="problemDescription" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>解决方案</td>
                         <td><s:textfield name="solution" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>维修或更换的备件及备件号</td>
                        <td><s:textfield name="attachment" cssClass="InputStyle"/> </td>
                    </tr>
					<tr><td>BBAC工程师故障处理时长(H)</td>
						<td><s:textfield name="troubleshootingTime" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>供应商维修开始时间</td>
                         <td><s:textfield name="startTime" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>供应商维修等待时间</td>
						<td><s:textfield name="waitedTime" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>供应商维修结束时间</td>
                         <td><s:textfield name="finishTime" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>供应商纯维修时间(H)</td>
                         <td><s:textfield name="totalTime" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>BBAC确认时间</td>
                         <td><s:textfield type="confirmTime" name="confirmtime" id="confirmtime" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>BBAC确认人</td>
                         <td><s:textfield name="confirmPerson" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>备注</td>
                         <td><s:textfield name="remarks" cssClass="InputStyle"/> </td>
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
