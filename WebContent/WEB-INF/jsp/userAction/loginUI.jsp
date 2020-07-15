<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
    <META http-equiv=Content-Type CONTENT="text/html; charset=gbk" />
	<TITLE>奔驰管理系统</TITLE>
	<LINK HREF="${pageContext.request.contextPath}/style/blue/login.css" type=text/css rel=stylesheet />
	 <%@ include file="/WEB-INF/jsp/public/commons.jspf"%>
</HEAD>

<BODY LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 CLASS=PageBody >
<s:form  action="user_login" focusElement="loginNameInput">
    <div id="CenterAreaBg">
        <div id="CenterArea">
            <div id="LogoImg"><font color="white" size="5">北京奔驰测量设备管理系统</font></div>
            <DIV ID="LoginInfo">
                <TABLE BORDER=0 CELLSPACING=0 CELLPADDING=0 width=100%>
                     <tr>
                        <td colspan="3">
                         <font color="red"><s:fielderror/></font>
                        </td>
                     </tr>
                    <tr>
                        <td width=45 CLASS="Subject"><IMG BORDER="0" SRC="${pageContext.request.contextPath}/style/blue/images/login/userId.gif" /></td>
                        <td><s:textfield size="20"  name="name" tabindex="1" cssClass="TextField required" id="loginNameInput" /></TD>
                        <TD ROWSPAN="2" STYLE="padding-left:10px;"><INPUT TYPE="image" SRC="${pageContext.request.contextPath}/style/blue/images/login/userLogin_button.gif"/></TD>
                    </tr>
                    <TR>
                        <TD CLASS="Subject"><IMG BORDER="0" SRC="${pageContext.request.contextPath}/style/blue/images/login/password.gif" /></TD>
                        <TD><s:password name="password" id="aa" size="20" tabindex="2" cssClass="TextField required"  showPassword="false"/></TD>
                    </TR>
                </TABLE>
            </DIV>            
        </div>
    </div>
</s:form>
</BODY>

</HTML>






