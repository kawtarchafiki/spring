<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Affecter un Employé à un Projet</title>
</head>
<body>
<h1>Affecter un Employé à un Projet</h1>
<form action="/assign" method="post">
    <label for="employeeName">Employé :</label>
    <select id="employeeName" name="employeeId" required>
        <!-- Boucle sur la liste des employés et affiche chaque employé dans une option -->
        <c:forEach var="employee" items="${employees}">
            <option value="${employee.id}">${employee.name}</option>
        </c:forEach>
    </select><br>

    <label for="projectName">Projet :</label>
    <select id="projectName" name="projectId" required>
        <!-- Boucle sur la liste des projets et affiche chaque projet dans une option -->
        <c:forEach var="project" items="${projects}">
            <option value="${project.id}">${project.name}</option>
        </c:forEach>
    </select><br>

    <button type="submit">Affecter Employé</button>
</form>
</body>
</html>
