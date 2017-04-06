<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="xstylesheet.css" />
    </head>

    <% String table = (String) request.getAttribute("table");%>

    <body>
        <div class="wrap">
            <div class="myDesign">


                <%@ include file="includes/header.jsp" %>

                <%@ include file="includes/menu.jsp" %>

                <div class="main">    


                    <h1>Chicago Pro Teams</h1>
                    <%= table%>

                    <br><br>

                    <a href ="add">Add A New Team</a>
                    <br> <br>
                    <a href="search.jsp">Search Teams</a>
                </div>

                <%@ include file="includes/footer.jsp" %>

            </div>
        </div>
    </body>
</html>
