<%-- 
    Document   : welcome
    Created on : Jan 27, 2016, 1:19:11 PM
    Author     : klwortman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greeting</title>
    </head>
    <body>
        <p>
            <%
                Object responseObj = request.getAttribute("myMsg");
                Object errObj = request.getAttribute("errorMsg");
                
                    if (responseObj != null) {
                        out.println(responseObj.toString());
                    }

                    if (errObj != null) {
                        out.println(errObj.toString());
                    }
                %>
        </p>
    </body>
</html>
