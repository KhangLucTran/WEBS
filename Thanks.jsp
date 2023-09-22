<%-- 
    Document   : Thanks
    Created on : Sep 22, 2023, 10:38:17 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Murach's Java Servlets and JSP</title>
    </head>
    <body>
        <h1>Thanks for joining our email list</h1>
        
        <p>Here is the information that you entered:</p>
        
        <label>Email:</label>
        <span>${user.email}</span><br>
         <label>First Name:</label>
        <span>${user.firstName}</span><br>
         <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        <label>Date or Birth:</label>
        <span>${user.dateOfbirth}</span><br>
        <p>
          To enter another email address, click on the Back button in your 
          or the Return button shown below.  
        </p>
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
        
    </body>
</html>
