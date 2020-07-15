<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>用户信息</title>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/>用户信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
            	<td width="200px">用户名</td>
                <td width="200px">所属部门</td>
                <td width="200px">密码</td>              
                <td width="600px">相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="recordList">
         <s:iterator value="recordList">
			<tr class="TableDetail1 template">
				<td>${name}&nbsp;</td>
				<td>${department}&nbsp;</td>
				<td>${password}&nbsp;</td>
				<td>
                   <s:a action="user_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
                   <s:a action="user_editUI?id=%{id}">修改</s:a>
                   <s:a action="user_setPrivilegeUI?id=%{id}">设置权限</s:a>
                   <s:a action="user_initPassword?id=%{id}" onclick="return confirm('确定要初始化密码吗？')">初始化密码</s:a>
				</td>
			</tr>
		 </s:iterator>
        </tbody>
    </table>
    <!-- 分页信息 -->
    <%@ include file="/WEB-INF/jsp/public/pageView.jspf" %>
    	<script type="text/javascript">
		function gotoPage( pageNum ){
			window.location.href = "user_list.action?id=${id}&pageNum="+pageNum;
		}
	</script>
    <!-- 其他功能超链接 -->
    <table id="TableTail">
        <td>
            <s:a action="user_addUI">新建</s:a>           
        </td>
    </table>
</div>
</body>
</html>




