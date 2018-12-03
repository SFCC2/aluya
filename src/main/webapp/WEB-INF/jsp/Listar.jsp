<%-- 
    Document   : eliminarPersona
    Created on : 25/11/2018, 01:48:57 PM
    Author     : Sulay2016
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="VO.Persona" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="resources/styles.css"/>
        <title>Listar Persona</title>
        <meta charset=\"UTF-8\">
        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">

        <style>
            * {
                box-sizing: border-box;
            }

            body {
                font-family: Arial, Helvetica, sans-serif;
            }
            header {
                background-color: #666;
                padding: 30px;
                text-align: center;
                font-size: 35px;
                color: white;
            }



            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                width: 200px;
                background-color: #f1f1f1;
            }


            /* Style the list inside the menu */
            nav ul {
                width: 10%;
                list-style-type: none;
                background: #FFFFFF;
                padding: 0;
            }

            pCamuflaje{ 
                color: #045FB3;

                background-color: #045FB3; 
            }


            li a {
                display: flex;
                color: #000;
                padding: 8px 16px;
                text-decoration: none;
                justify-content: space-between;
            }

            /* Change the link color on hover */
            li a:hover {
                background-color: #04B404;
                color: white;
            }
            @media only screen and (max-width:620px) {
                /* For mobile phones: */
                .menu, .main, .right {
                    width:100%;
                }
            }
        </style>



    </head>
    <body>


        <div class="jumbotron text-center bg-white text-dark" style="margin-bottom:0">
            <h1>Logo de la empresa</h1>
            <p>ASESORÍAS TÉCNICAS GEOLÓGICAS ATG LTDA.</p> 
        </div>
        <nav class="navbar navbar-expand-sm" style="background-color: #045FB3;">
            <br><pCamuflaje> <br>
                <a class="btn btn-primary" href=Persona.html>Menu</a>
                <br></pCamuflaje>
        </nav>
        <section>
            <div class="container" style="margin-top:75px">
                <div class="row">
                    <div class="col-md-12 text-center">


                        <h2>Lista de Personas</h2>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Cedula</th>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>correo</th>
                                    <th>Carrera</th>
                                    <th>especialidad</th>
                                    <th>areaTrabajo</th>
                                </tr>
                            </thead>
                            <tbody>

                               



                        </table >
                    </div>
                </div>   </section>

        <div class="jumbotron text-center" style="margin-bottom:5"   >
            <div class="container " >
                <div class="row">
                    <div class="col-sm-4 bg-white text-dark">
                        <h3>Column 1</h3>
                        <p>fOTO.</p>
                    </div>
                    <div class="col-sm-4">
                        <h3>Informacion General</h3>
                        <p>Dirección: Transversal 16 BIS No. 45d -90</p>
                        <p>Teléfonos: 2852980 - 3688604</p>
                        <p> Celular: 311 506 1413 - 310 877 2557 </p>
                        <p>Correo electrónico: atg@atgltda.com</p>
                    </div>
                    <div class="col-sm-4">
                        <h3>IMPORTANTE</h3>        
                        <p>La firma tiene experiencia de 20 años en la mayoría de zonas geográficas y cuencas sedimentarias del país.</p>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
