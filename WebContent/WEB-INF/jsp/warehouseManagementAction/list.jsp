<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>入库管理</title>
 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/>入库管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
            	<td width="400px">物品种类</td>
                <td width="400px">物品名称</td>
                <td width="200px">规格</td>
                <td width="200px">型号</td>
                <td width="200px">品牌</td>
                <td width="500px">订货号</td>
                <td width="100px">物品数量</td>
                <td width="100px">单位</td>
                <td width="100px">预警数量</td>
                <td width="100px">有效期</td>
                <td width="200px">存放位置</td>
                <td width="200px">入库日期</td>
                <td width="200px">送货人</td>
                <td width="200px">接收人</td>
                <td width="200px">操作人</td>
                <td width="200px">id</td>
                <td width="200px">物品总价</td>
                <td width="200px">相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="warehouseManagementList">
         <s:iterator value="recordList">
			<tr class="TableDetail1 template">
				<td>${typesOfGoods}&nbsp;</td>
				<td>${name}&nbsp;</td>
				<td>${specification}&nbsp;</td>
				<td>${model}&nbsp;</td>
				<td>${brand}&nbsp;</td>
				<td>${orderNumber}&nbsp;</td>
				<td>${numberOfRecipients}&nbsp;</td>
				<td>${unit}&nbsp;</td>
				<td>${warningQuantity}&nbsp;</td>
				<td>${termOfValidity}&nbsp;</td>
				<td>${storageLocation}&nbsp;</td>
				<td>${date}&nbsp;</td>
				<td>${deliverer}&nbsp;</td>
				<td>${receiver}&nbsp;</td>
				<td>${operator}&nbsp;</td>
				<td>${goodsId}&nbsp;</td>
				<td>${totalPrice}&nbsp;</td>
				<td>
                   <s:a action="warehouseManagement_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
                   <s:a action="warehouseManagement_editUI?id=%{id}">修改</s:a>
				</td>
			</tr>
		 </s:iterator>
        </tbody>
    </table>
        <!-- 分页信息 -->
        <%@ include file="/WEB-INF/jsp/public/pageView.jspf" %>
    <script type="text/javascript">
		function gotoPage( pageNum ){
			window.location.href = "warehouseManagement_list.action?id=${id}&pageNum="+pageNum;
		}
	</script>
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
             <s:a action="warehouseManagement_addUI">新建</s:a>
             <s:a action="warehouseManagement_importUI">导入表格</s:a>
             <s:a action="warehouseManagement_exportUI">导出表格</s:a>
        </div>
    </div>
</div>
</body>
</html>

