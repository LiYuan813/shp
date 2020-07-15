<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>维修记录</title>
     <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/>维修记录
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
                <td width="30">序号</td>
                <td width="50">测量室</td>
                <td width="100">测量机臂</td>
                <td width="100">测量机臂号</td>
                <td width="90">问题发生时间</td>
                <td width="250">问题描述(现象)</td>
                <td width="250">解决方案</td>
                <td width="50">维修或更换的备件及备件号</td>
                <td width="50">BBAC工程师故障处理时长(H)</td>
                <td width="50">供应商维修开始时间</td>
                <td width="50">供应商维修等待时间</td>
                <td width="50">供应商维修结束时间</td>
                <td width="50">供应商纯维修时间(H)</td>
                <td width="90">BBAC确认时间</td>
                <td width="50">BBAC确认人</td>
                <td width="200">相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="maintenanceRecordsList">
         <s:iterator value="recordList">
			<tr class="TableDetail1 template">
				<td>${measurementRoom}&nbsp;</td>
				<td>${testingArm}&nbsp;</td>
				<td>${testingArmId}&nbsp;</td>
				<td>${problemTime}&nbsp;</td>
				<td>${problemDescription}&nbsp;</td>
				<td>${solution}&nbsp;</td>
				<td>${attachment}&nbsp;</td>
				<td>${troubleshootingTime}&nbsp;</td>
				<td>${startTime}&nbsp;</td>
				<td>${waitedTime}&nbsp;</td>
				<td>${finishTime}&nbsp;</td>
				<td>${totalTime}&nbsp;</td>
				<td>${confirmTime}&nbsp;</td>
				<td>${confirmPerson}&nbsp;</td>
				<td>${remarks}&nbsp;</td>
				<td>
                   <s:a action="maintenanceRecords_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
                   <s:a action="maintenanceRecords_editUI?id=%{id}">修改</s:a>
				</td>
			</tr>
		 </s:iterator>
        </tbody>
    </table>
        <!-- 分页信息 -->
        <%@ include file="/WEB-INF/jsp/public/pageView.jspf" %>
       <script type="text/javascript">
		function gotoPage( pageNum ){
			window.location.href = "maintenanceRecords_list.action?id=${id}&pageNum="+pageNum;
		}
	</script>
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
             <s:a action="maintenanceRecords_addUI">新建</s:a>
             <s:a action="maintenanceRecords_importUI">导入表格</s:a>
              <s:a action="maintenanceRecords_exportUI">导出表格</s:a>
        </div>
    </div>
</div>
</body>
</html>



