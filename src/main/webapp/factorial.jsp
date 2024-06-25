<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Detalle del Factorial</title>
</head>
<body>
    <h1>Detalle del Factorial</h1>
    <p>El factorial de <%= request.getAttribute("numero") %> es <%= request.getAttribute("factorial") %>.</p>
    <a href="index.jsp">Volver</a>
</body>
</html>
