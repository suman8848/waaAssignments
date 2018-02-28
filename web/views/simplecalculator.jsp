<%--
  Created by IntelliJ IDEA.
  User: sumankhatiwada
  Date: 2/27/18
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<div>
    <form method="post" action="/simplecalculator">
    <input id="firstNumber" name="firstNumber" type="number" value="${first}">
    + <input id="secondNumber" name="secondNumber" type="number" value="${second}"> = <input id="resultvalue"  name="resultNumber" type="number" value="${sum}">
        <br>
        <input id="firstMultiNumber" name="firstMultiNumber" type="number" value="${firstMulti}">
        * <input id="secondMultiNumber" name="secondMultiNumber" type="number" value="${secondMulti}"> = <input id="resultMultivalue"  name="resultNumber" type="number" value="${multi}">
        <br>
    <input id="sumResult" type="submit">
    </form>




</div>
</body>
</html>
