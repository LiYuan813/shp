<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>测量室管理</title>
    <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head"> 
        <div></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 测量室管理
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
                <td>测量室</td>
                <td>备注</td>
                <td>相关操作</td>
            </tr>
        </thead>
        
        <!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="measureRoomList">
         <s:iterator value="#measureRoomList">
            <tr class="TableDetail1 template" align=center>            
                <td>${measureRoom}&nbsp;</td>
                <td>${remarks}&nbsp;</td>
                <td><s:a action="measureRoom_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
	                <s:a action="measureRoom_editUI?id=%{id}">修改</s:a>
                </td>
            </tr>
          </s:iterator>
        </tbody>
    </table>
    
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <s:a action="measureRoom_addUI"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
        </div>
    </div>
</div>

</body>
</html>



