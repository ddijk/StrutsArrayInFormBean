<%--
    Document   : createPf
    Created on : 23-jun-2013, 17:03:56
    Author     : DickD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <html:errors />
    <html:form action="/createPf">


      <%--
      <logic:iterate name="PortfolioDynaForm" property="name">
      <html:text property="name[0]" size="10" value=""></html:text>
      <html:text property="name[1]" size="10" value=""></html:text>
      <html:text property="name[2]" size="10" value=""></html:text>
      </logic:iterate>
      --%>
      <input name="name[0]" size="10" value="">
      <input name="name[1]" size="10" value="">
      <input name="name[2]" size="10" value="">
      <br>
      namex<input name="namex[0]" size="10" value="">
      <br>
      number<html:text property="number" size="10"></html:text>
      number2<html:text property="number2" size="10"></html:text>
      <html:submit value="ok"/>
    </html:form>
  </body>
</html>
