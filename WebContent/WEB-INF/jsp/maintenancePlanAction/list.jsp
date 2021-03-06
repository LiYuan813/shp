<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>保养计划</title>
    <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head"> 
        <div></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 保养计划
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="1" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
                <td>Supplier</td>
                <td>Measure Room</td>
                <td>CMM No.</td>
                <td>Machine</td>
                <td>2019 Maintenance Plan</td>
                <td>操作</td>
            </tr>
        </thead>
        
        <!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="maintenancePlanList">
         <s:iterator value="recordList">
            <tr class="TableDetail1 template" align=center>
            
                <td>${supplier}&nbsp;</td>
                <td>${measureroom}&nbsp;</td>
                <td>${cmmno}&nbsp;</td>
                 <td>${machine}&nbsp;</td>
                <td>${maintainplan}&nbsp;</td>
                <td><s:a action="maintenancePlan_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
	                <s:a action="maintenancePlan_editUI?id=%{id}">修改</s:a>
                </td>
            </tr>
          </s:iterator>
        </tbody>
    </table>
        <!-- 分页信息 -->
        <%@ include file="/WEB-INF/jsp/public/pageView.jspf" %>
       <script type="text/javascript">
		function gotoPage( pageNum ){
			window.location.href = "maintenancePlan_list.action?id=${id}&pageNum="+pageNum;
		}
	</script>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <s:a action="maintenancePlan_addUI" >新建</s:a>
             <s:a action="maintenancePlan_importUI" >导入表格</s:a>
              <s:a action="maintenancePlan_exportUI">导出表格</s:a>
        </div>
    </div>
</div>

</body>
</html>



