<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
</head>
<body>

    <h1>L-Pizza - Meny</h1>

    <form action="" method="post">
    <table>
        <tr>
            <c:forEach var="pizza" items="${pizzaer}">
                <td>
                    <img = src="webapp/bilder${pizza.bildefil}"> <br>
                    ${pizza.id} ${pizza.navn} <br>
                    ${pizza.beskrivelse}<br>
                    ${pizza.pris} <br>
                    Antall: <input type="number" name="antallAv${pizza.nr}">
                </td>
            </c:forEach>
        </tr>
    </table>
    Ditt mobilnummer: <input type="text" name="kundemobil"><br>
    <input type="submit" value="Bestill">
    </form>
    
</body>
</html>