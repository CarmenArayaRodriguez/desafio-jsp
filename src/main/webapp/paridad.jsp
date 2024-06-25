<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Detalle de Paridad</title>
</head>
<body>
    <h1>Detalle de Paridad</h1>
    <p>El número <%= request.getAttribute("numero") %> es <%= request.getAttribute("paridad") %>.</p>
    <a href="index.jsp">Volver</a>
</body>
</html>
