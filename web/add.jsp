<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Team</title>
        <link rel="stylesheet" type="text/css" href="xstylesheet.css" />
    </head>
    <body>
        <div class="myDesign">
        <h1>Add A New Team</h1>
        
        <form name="addForm" action="addTeam" method="get">
            <label>Team Name:</label>
            <input type="text" name="name" value="" />
            <br>
            <label>Sport:</label>
            <input type="text" name="sport" value="" />
            <br>
            <label>First Year:</label>
            <input type="text" name="year" value="" />
            <br>
            <label>Championships:</label>
            <input type="text" name="championships" value="" />
            <br>
            <label>Coach:</label>
            <input type="text" name="coach" value="" />
            <br>
            <input type="submit" name="submit" value="Submit" />
        </form>
        </div>
    </body>
</html>
