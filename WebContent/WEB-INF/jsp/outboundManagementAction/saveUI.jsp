<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>出库管理</title>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body> 

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/>出库物品信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id="MainArea">
    <s:form action="outboundManagement_%{id==null?'add':'edit'}">
        <s:hidden name="id"></s:hidden>
        <div class="ItemBlock_Title1"><!-- 信息说明<DIV CLASS="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif" /> 岗位信息 </DIV>  -->
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr><td>物品种类</td>
                        <td><s:textfield name="typesOfGoods" cssClass="InputStyle"/> </td>
                    </tr>
					<tr><td>物品名称</td>
						<td><s:textfield name="name" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>规格</td>
                         <td><s:textfield  name="specification"  cssClass="InputStyle" />
                         </td>
                    </tr>
                    <tr><td>型号</td>
						<td><s:textfield  name="model"  cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>品牌</td>
                         <td><s:textfield name="brand" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>订货号</td>
                         <td><s:textfield name="orderNumber" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>领取数量</td>
                         <td><s:textfield name="numberOfRecipients" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>单位</td>
                         <td><s:textfield name="unit" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>有效期</td>
                        <td><s:textfield name="termOfValidity" cssClass="InputStyle"/> </td>
                    </tr>
					<tr><td>存放位置</td>
						<td><s:textfield name="storageLocation" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>使用区域</td>
                         <td><s:textfield name="useArea"  cssClass="InputStyle" />
                         </td>
                    </tr>
                    <tr><td>领用人</td>
						<td><s:textfield  name="person" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>领用日期</td>
                         <td><s:textfield name="date" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>操作人</td>
                         <td><s:textfield name="operator" cssClass="InputStyle"/> </td>
                    </tr>
                    <tr><td>id</td>
                         <td><s:textfield name="goodsId" cssClass="InputStyle"/> </td>
                    </tr>
                     <tr><td>物品总价</td>
                         <td><s:textfield name="totalPrice" cssClass="InputStyle"/> </td>
                    </tr>
                </table>
            </div>
        </div>
        
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="${pageContext.request.contextPath}/style/images/save.png"/>
            <a href="javascript:history.go(-1);"><img src="${pageContext.request.contextPath}/style/images/goBack.png"/></a>
        </div>
    </s:form>
</div>

</body>
</html>
