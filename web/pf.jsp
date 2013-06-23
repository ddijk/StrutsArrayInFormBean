<%--
    Document   : pf
    Created on : 23-jun-2013, 10:58:58
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
    <h1>Porfolio</h1>
    <%--
    <logic:iterate id="naam" name="PortfolioForm">
      <bean:write name="naam"/>
    </logic:iterate>
    --%>
    Number<bean:write name="PortfolioDynaForm" property="number"/>
    <ul>
      <logic:iterate id="n" name="PortfolioDynaForm" property="name">
        <li>naam<bean:write name="n"/></li>
        </logic:iterate>
    </ul>
  </body>
</html>
