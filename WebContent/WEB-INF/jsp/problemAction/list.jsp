<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>TPM问题追踪表</title>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/>TPM问题追踪
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
            	<td width="200px">编号</td>
                <td width="200px">提出人</td>
                <td width="200px">日期</td>
                <td width="200px">问题描述</td>
                <td width="200px">原因</td>
                <td width="200px">紧急措施</td>
                <td width="200px">紧急措施完成时间</td>
                <td width="200px">负责人</td>
                <td width="200px">长期措施预计完成时间</td>
                <td width="200px">相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="tPMWenTiList">
         <s:iterator value="recordList">
			<tr class="TableDetail1 template">
				<td>${number}&nbsp;</td>
				<td>${person1}&nbsp;</td>
				<td>${date}&nbsp;</td>
				<td>${description}&nbsp;</td>
				<td>${reason}&nbsp;</td>
				<td>${measures}&nbsp;</td>
				<td>${time1}&nbsp;</td>
				<td>${person2}&nbsp;</td>
				<td>${time2}&nbsp;</td>
				<td>
                   <s:a action="problem_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
                   <s:a action="problem_editUI?id=%{id}">修改</s:a>
				</td>
			</tr>
		 </s:iterator>
        </tbody>
    </table>
    <!-- 分页信息 -->
        <%@ include file="/WEB-INF/jsp/public/pageView.jspf" %>
       <script type="text/javascript">
		function gotoPage( pageNum ){
			window.location.href = "problem_list.action?id=${id}&pageNum="+pageNum;
		}
	</script>
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <s:a action="problem_addUI">新建</s:a>
             <!-- 
             <s:a action="role_importUI">导入表格</s:a>
              <s:a action="role_exportUI">导出表格</s:a>
               -->
        </div>
    </div>
</div>
</body>
</html>