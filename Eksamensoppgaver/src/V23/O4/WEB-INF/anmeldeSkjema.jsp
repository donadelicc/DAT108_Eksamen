<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Anmelde</title>
</head>
<body>
    <a ref="bokanmdelser?bok_id=${bok.id}">Tilbake til anmeldelser</a><br>
    <img src="bilder/${bok.bilde}"> ${bod.tittel}<br>

    Din anmeldelse: <br>
    
    <form action="anmelde" method="POST">
        
        <input type="hidden" name="bok_id" value="${bok.id}" /><br>

        Rating: <br>
        <c:forEach var="i" begin="5" end="1" step="-1">
            <input type="radio" name="rating" value="${i}" ${i eq 3? "checked" : ""}>
            <img src="bilder(rating${i}.png)"><br>
        </c:forEach>

        Text<br>
        <textarea name="tekst" rows="5" cols="40"></textarea><br>
        Hilsen <input type="tekst" name="anmelder"><br>
        <input type="submit" value="Send inn anmeldelse"><br>

    </form>
</body>
</html>
