<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="xstylesheet.css" />
        <title>Search Teams</title>
    </head>
    <body>
        <div class="wrap">
            <div class="myDesign">

                <%@ include file="includes/header.jsp" %>

                <%@ include file="includes/menu.jsp" %>

                <h1>Search Teams</h1>

                <form name="searchForm" action="search" method="get">

                    <input type="text" name="searchVal" value="" />

                    <br>

                    <input type="submit" name="submit" value="Search" />

                </form>

                <%@ include file="includes/footer.jsp" %>

            </div>
        </div>
    </body>
</html>
