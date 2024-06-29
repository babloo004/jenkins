<%@page language="java" %>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" type="text/css" href="/css/style.css">
    </head>
    <body>
        <form id="signup" method="post" action="/submitsignip">
            <table>
                <tr>
                    <td class="labtd"> <label for="username">Username</label></td>
                    <td><input type="text"  id="username" name="username" required><br></td>
                </tr>
                <tr>
                    <td class="labtd"><label for="password">Password</label></td>
                    <td><input type="password" id="password" name="password" required><br></td>
                </tr>
            </table>
            <button id="but" type="submit">signin</button>
        </form>
    </body>
</html>