<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Team</title>
        <link rel="stylesheet" type="text/css" href="xstylesheet.css" />
    </head>
    <body>
        <div class="wrap">
            <div class="formDesign">

                <%@ include file="includes/header.jsp" %>

                <%@ include file="includes/menu.jsp" %>
                <h1>Add A New Team</h1>

                <form name="addForm" action="addTeam" method="get">
                    <label>Team Name:</label>
                    <br>
                    <input type="text" name="name" value="" />
                    <br>
                    <br>
                    <label>Sport:</label>
                    <br>
                    <input type="text" name="sport" value="" />
                    <br>
                    <br>
                    <label>First Year:</label>
                    <br>
                    <input type="text" name="year" value="" />
                    <br>
                    <br>
                    <label>Championships:</label>
                    <br>
                    <input type="text" name="championships" value="" />
                    <br>
                    <br>
                    <label>Coach:</label>
                    <br>
                    <input type="text" name="coach" value="" />
                    <br>
                    <br>
                    <input type="submit" name="submit" value="Submit" />
                </form>
                <%@ include file="includes/footer.jsp" %>

            </div>
        </div>
    </body>
</html>
