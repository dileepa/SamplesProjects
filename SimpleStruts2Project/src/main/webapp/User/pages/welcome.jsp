<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<h1>Successfully Logged. </h1>
<h1>Logged User <s:property value="username"/> </h1>
<s:form action="EnterDetails">
<h4>Please, Enter your </h4>
<s:textfield name="name" label="Full Name"/>
<s:hidden name="username" value="%{username}"/>
<s:hidden name="password" value="%{password}"/>
<s:submit/>
</s:form>

</body>
</html>