<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>设备状态信息</title>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/>设备状态
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
            	<td width="200px">机器型号</td>
                <td width="200px">系列号</td>
                <td width="200px">安装日期</td>
                <td width="200px">保修截至日期</td>
                <td width="200px">地点</td>
                <td width="200px">臂长</td>
                <td width="200px">维修年份</td>
                <td width="200px">备注</td>
                <td width="200px">相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="roleList">
         <s:iterator value="recordList">
			<tr class="TableDetail1 template">
				<td>${name}&nbsp;</td>
				<td>${description}&nbsp;</td>
				<td>${installationDate}&nbsp;</td>
				<td>${warrantyDeadine}&nbsp;</td>
				<td>${location}&nbsp;</td>
				<td>${armLength}&nbsp;</td>
				<td>${repairYear}&nbsp;</td>
				<td>${remarks}&nbsp;</td>
				<td>
                   <s:a action="role_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
                   <s:a action="role_editUI?id=%{id}">修改</s:a>
				</td>
			</tr>
		 </s:iterator>
        </tbody>
    </table>
    <!-- 分页信息 -->
        <%@ include file="/WEB-INF/jsp/public/pageView.jspf" %>
       <script type="text/javascript">
		function gotoPage( pageNum ){
			window.location.href = "role_list.action?id=${id}&pageNum="+pageNum;
		}
	</script>
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <s:a action="role_addUI">新建</s:a>
             <s:a action="role_importUI">导入表格</s:a>
              <s:a action="role_exportUI">导出表格</s:a>
        </div>
    </div>
</div>
</body>
</html>

