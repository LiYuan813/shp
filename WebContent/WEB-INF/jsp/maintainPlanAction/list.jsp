<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>维修计划</title>
    <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head"> 
        <div></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 维修计划
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="1" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
                <!-- <td width="100">登录名</td> -->
                <td>Measure Room</td>
                <td>CMM No.</td>
                <td>CMM Type</td>
                <td>Maintenance Plan</td>
                <td>Order</td>
                <td>X axis</td>
                <td>备注</td>
                <td>操作</td>
            </tr>
        </thead>
        
        <!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="maintainPlanList">
         <s:iterator value="recordList">
            <tr class="TableDetail1 template" align=center>
            
                <td>${measureroom}&nbsp;</td>
                <td>${cmmno}&nbsp;</td>
                 <td>${cmmtype}&nbsp;<%-- <img alt="无法加载" src="${pageContext.request.contextPath}/style/images/${id}.gif"/> --%></td>
                <td>${plan}&nbsp;</td>
                 <td>${number}&nbsp;</td>
                <td>${xaxis}&nbsp;</td>
                 <td>${remarks}&nbsp;</td>
                <td><s:a action="maintainPlan_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
	                <s:a action="maintainPlan_editUI?id=%{id}">修改</s:a>
                </td>
            </tr>
          </s:iterator>
        </tbody>
    </table>
        <!-- 分页信息 -->
        <%@ include file="/WEB-INF/jsp/public/pageView.jspf" %>
       <script type="text/javascript">
		function gotoPage( pageNum ){
			window.location.href = "maintainPlan_list.action?id=${id}&pageNum="+pageNum;
		}
	</script>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
             <s:a action="maintainPlan_addUI" >新建</s:a>
             <s:a action="maintainPlan_importUI" >导入表格</s:a>
             <s:a action="maintainPlan_exportUI">导出表格</s:a>
        </div>
    </div>
</div>

</body>
</html>



