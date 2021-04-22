<%--
  Created by IntelliJ IDEA.
  User: cartonni
  Date: 21/04/2021
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire Hello</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/simple-hello" method="post" >
    <label for="fname">Nom :</label><br>
    <input type="text" id="fname" name="fname"><br>
    <label for="lname">Prénom :</label><br>
    <input type="text" id="lname" name="lname"><br>
    <label for="heure">Heure (juste l'heure 0-24) :</label><br>
    <input type="text" id="heure" name="heure">
    <input type="submit" value="Envoyer">
</form>
</body>
</html>
