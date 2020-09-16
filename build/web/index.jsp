<%-- 
    Document   : index
    Created on : 15-sep-2020, 17:40:52
    Author     : Adrian
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>     
        <title>Register</title>
    </head>
    <body style="margin-top: 30px">      

        <%
            Connection cnx = null;
            Statement sta = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/bd_practica?user=root&password=");

                sta = cnx.createStatement();
                rs = sta.executeQuery("select * from persona");

        %>

        <div class="container">            
            <button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal"> Agregar Nuevo</button>
        </div>  

        <br>
        <div class="container">               

            <table class="table table-bordered"  id="tablaDatos">
                <thead>
                    <tr>
                        <th class="text-center">Id</th>
                        <th class="text-center">DNI</th>
                        <th class="text-center">NOMBRES</th>
                        <th class="text-center">TELEFONO</th>
                        <th class="text-center">DIRECCION</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <tbody id="tbodys">
                    <%while (rs.next()) {%>

                    <tr>

                        <td class="text-center"><%= rs.getInt(1)%></td>
                        <td><%= rs.getString(2)%></td>
                        <td class="text-center"><%= rs.getString(3)%></td>
                        <td class="text-center"><%= rs.getInt(4)%></td>
                        <td class="text-center"><%= rs.getString(5)%></td>
                        <td class="text-center">

                            <a href="Editar.jsp?id=<>" class="btn btn-primary">Editar</a>
                            <a href="Delete.jsp?id=<>" class="btn btn-danger">Delete</a>
                        </td>
                    </tr>
                    <%}%>


                    <%

                            sta.close();
                            rs.close();
                            cnx.close();
                        } catch (Exception e) {

                        }
                    %>
            </table>
        </div>        
        <div class="container">          
            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                <div class="modal-dialog" role="document" style="z-index: 9999; width: 450px">
                    <div class="modal-content">
                        <div class="modal-header">                            
                            <h4 class="modal-title" id="myModalLabel">Agregar Registro</h4>
                        </div>
                        <div class="modal-body">
                            <form action="" method="post">
                                <label>Nombres:</label> 
                                <input type="text" name="txtNom" class="form-control"/><br>
                                <label>DNI:</label> 
                                <input type="text" name="txtDNI" class="form-control"/>                                      
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>                            
                                    <input type="submit" value="Guardar" class="btn btn-primary"/>
                                </div>
                            </form>
                        </div>
                    </div>                    
                </div>
            </div>

        </div>        
        <script src="js/jquery.js" type="text/javascript"></script>             
        <script src="js/bootstrap.min.js" type="text/javascript"></script>        
    </body>
</html>

