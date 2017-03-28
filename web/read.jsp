<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="xstylesheet.css" />
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <div class="myDesign">
        <h1>Chicago Pro Teams</h1>
        <%= table %>
        
        <br><br>
        
        <a href ="add">Add A New Team</a>
        </div>
    </body>
</html>
