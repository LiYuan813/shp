<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>北京奔驰设备管理系统</title>
<%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<frameset rows="100,*,25" framespacing="0" border="0" frameborder="0">
    <frame src="${pageContext.request.contextPath}/home_top.action" name="TopMenu"  scrolling="no" noresize />
    <frameset cols="160,*" id="resize">
        <frame noresize name="menu" src="${pageContext.request.contextPath}/home_left.action" />
        <frame noresize name="right" src="${pageContext.request.contextPath}/home_right.action" />
    </frameset>
    <frame noresize name="status_bar" scrolling="no" src="${pageContext.request.contextPath}/home_bottom.action" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>
