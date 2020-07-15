<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/top.css" />
<title>Insert title here</title>
</head>
<body class="PageBody" style="margin: 0">
 
	<div id="Head1">
		<div id="Logo">
			<a id="msgLink" href="javascript:void(0)"></a>
            <font color="#0000CC" style="color:#F1F9FE; font-size:28px; font-family:Arial Black, Arial">北京奔驰</font> 
			<!--<img border="0" src="style/blue/images/logo.png" />-->
        </div>
		
		<div id="Head1Right">
			<div id="Head1Right_UserName">
                <img border="0" width="13" height="14" src="${pageContext.request.contextPath}/style/images/top/user.gif" /> 您好，<b>${user.name }</b>
			</div>

			<div id="Head1Right_Time"></div>
		</div>
		
        <div id="Head1Right_SystemButton">
            <a target="_parent" href="${pageContext.request.contextPath}/user_logout.action">
				<img width="78" height="20" alt="退出系统" src="${pageContext.request.contextPath}/style/blue/images/top/logout.gif" />
			</a>
        </div>
	</div>
    
    <div id="Head2">
        <div id="Head2_Awoke">
            <ul id="AwokeNum">
                <li><a  target="right" href="${pageContext.request.contextPath}/home_right.action" >首页 
						<span id="msg"></span>
					</a>
				</li>
                <li class="Line"></li>
                <li><a target="right" href="${pageContext.request.contextPath}/home_TPMRight.action"" >
						 TPM
						<span id="mail"></span>
					</a>
				</li>
                <li class="Line"></li>
				  <!-- 是否有待审批文档的提示1，数量 -->
                <li><a href="Flow_Formflow/myTaskList.html" target="desktop">
                		
                		待办事项（<span id="wait" class="taskListSize">1</span>）
                	</a>
                </li>
            </ul>
        </div>
        
	</div>

</body>
</html>