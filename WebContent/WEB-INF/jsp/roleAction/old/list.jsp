<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>list</title>
</head>
<body>
     <s:iterator value="#roleList">
        <s:property value="id"/>,
        <s:property value="name"/>,
        <s:property value="description"/>,
        <s:a action="role_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
        <s:a action="role_editUI?id=%{id}">修改</s:a>
        <br/>
     </s:iterator>
     <br/>
     <s:a action="role_addUI">添加</s:a>
</body>
</html>