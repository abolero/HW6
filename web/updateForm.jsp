<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Teams"%>
<% Teams team = (Teams) request.getAttribute("team"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="xstylesheet.css" />
        <title>Update A Team</title>
    </head>
    <body>
        <div class="formDesign">
        <h1>Update A Team</h1>
        
        <form name="updateForm" action="updateTeam" method="get">
            
            <label>Team ID:</label>
            <br>
            <input type="text" name="id" value="<%= team.getTeamID() %>" readonly/>
            <br>
            <br>
            <label>Team Name:</label>
            <br>
            <input type="text" name="name" value="<%= team.getTeamName() %>" />
            <br>
            <br>
            <label>Sport:</label>
            <br>
            <input type="text" name="sport" value="<%= team.getSport() %>" />
            <br>
            <br>
            <label>First Year:</label>
            <br>
            <input type="text" name="year" value="<%= team.getFirstYear() %>" />
            <br>
            <br>
            <label>Championships:</label>
            <br>
            <input type="text" name="championships" value="<%= team.getChampionships() %>" />
            <br>
            <br>
            <label>Coach:</label>
            <br>
            <input type="text" name="coach" value="<%= team.getCoach() %>" />
            <br>
            <br>
            <input type="submit" name="submit" value="Update" />
        </form>
        </div>
    </body>
</html>
