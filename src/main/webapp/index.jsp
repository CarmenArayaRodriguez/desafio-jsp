<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Desafío JSP</title>
    <style>
        table {
            width: 100%;
            border-collapse: separate;
            border-spacing: 0;
        }
        th, td {
            padding: 8px;
            padding-right: 20px; 
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>Desafío JSP</h1>
    <table>
        <tr>
            <th>#</th>
            <th>Número</th>
            <th>Calcular Factorial</th>
            <th>Paridad</th>
        </tr>
        <% for (int i = 1; i <= 10; i++) { %>
        <tr>
            <td><%= i %></td>
            <td>Número Mes <%= i %></td>
            <td><a href="FactorialServlet?numero=<%= i %>">Factorial de <%= i %></a></td>
            <td><a href="ParidadServlet?numero=<%= i %>">¿Es par o impar el número <%= i %>?</a></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
