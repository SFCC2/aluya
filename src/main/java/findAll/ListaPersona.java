/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findAll;

import VO.PersonaVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios.BDpersona;

/**
 *
 * @author Labing I5
 */
public class ListaPersona extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            BDpersona bd = new BDpersona();
            ArrayList<PersonaVO> personas = bd.getPersonas();
            
             String box = "* {\n"
                    + "                box-sizing: border-box;\n"
                    + "            }\n"
                    + "";
            String body = " body {\n"
                    + "                font-family: Arial, Helvetica, sans-serif;\n"
                    + "            }";
            String ul = " ul {\n"
                    + "                list-style-type: none;\n"
                    + "                margin: 0;\n"
                    + "                padding: 0;\n"
                    + "                width: 200px;\n"
                    + "                background-color: #f1f1f1;\n"
                    + "            }";
            String nav_ul = "nav ul {\n"
                    + "                width: 10%;\n"
                    + "                list-style-type: none;\n"
                    + "                background: #FFFFFF;\n"
                    + "                padding: 0;\n"
                    + "            }";
            String pCamuflaje = "pCamuflaje{ \n"
                    + "                color: #045FB3;\n"
                    + "\n"
                    + "                background-color: #045FB3; \n"
                    + "            }";
            String li_a = " li a {\n"
                    + "                display: flex;\n"
                    + "                color: #000;\n"
                    + "                padding: 8px 16px;\n"
                    + "                text-decoration: none;\n"
                    + "                justify-content: space-between;\n"
                    + "            }";
            String li__a = " li a:hover {\n"
                    + "                background-color: #04B404;\n"
                    + "                color: white;\n"
                    + "            }";
            String only_screen = "@media only screen and (max-width:620px) {\n"
                    + "                /* For mobile phones: */\n"
                    + "                .menu, .main, .right {\n"
                    + "                    width:100%;\n"
                    + "                }\n"
                    + "            }";


            StringBuilder content = new StringBuilder();
            content.append("\n"
                    + "<html>\n"
                    + "     <head>\n"
                    + "         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                    + "         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n"
                    + "         <link rel=\"stylesheet\" href=\"resources/styles.css\"/>\n"
                    + "         <title>Listar Persona</title>\n"
                    + "         <meta charset=\"UTF-8\">\n"
                    + "         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "         <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n"
                    + "         <style>\n"
                    + box
                    + body
                    + ul
                    + nav_ul
                    + pCamuflaje
                    + li_a
                    + li__a
                    + only_screen
                    + "         </style>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "     <div class=\"jumbotron text-center bg-white text-dark\" style=\"margin-bottom:0\">\n"
                    + "         <h1>Logo de la empresa+ </h1>\n"
                    + "         <p>ASESORÍAS TÉCNICAS GEOLÓGICAS ATG LTDA.</p>\n"
                    + "</div>\n"
                    + "<nav class=\"navbar navbar-expand-sm\" style=\"background-color: #045FB3;\">\n"
                    + "     <br>\n" + "<pCamuflaje>\n" + "<br>\n"
                    + "         <a class=\"btn btn-primary\" href=Persona.html></a>\n"
                    + "         <br>\n" + "</pCamuflaje>\n"
                    + "</nav>\n"
                    + "<section>\n"
                    + "     <div class=\"container\" style=\"margin-top:75px\">\n"
                    + "         <div class=\"row\">\n"
                    + "             <div class=\"col-md-12 text-center\">\n"
                    + "                 <h2>Lista de Personas</h2>\n"
                    + "                 <table class=\"table table-hover\">\n"
                    +                   "<thead>\n"
                    + "                     <tr>\n"
                    + "                         <th>Cedula</th>\n"
                    + "                         <th>Nombre</th>\n"
                    + "                         <th>Apellido</th>\n"
                    + "                         <th>correo</th>\n"
                    + "                         <th>Carrera</th>\n"
                    + "                         <th>especialidad</th>\n"
                    + "                         <th>areaTrabajo</th>\n"
                    + "                 </tr>\n"
                    + "         </thead>\n"
                    + "<tbody>\n");

            for (PersonaVO persona : personas) {
                content.append(""
                        + "<tr>\n"
                        + "<td>" + persona.getCedula() + "</td>\n"
                        + "<td>" + persona.getNombre() + "</td>\n"
                        + "<td>" + persona.getApellido() + "</td>\n"
                        + "<td>" + persona.getCorreo() + "</td>\n"
                        + "<td>" + persona.getCarrera() + "</td>\n"
                        + "<td>" + persona.getAreaTrabajo() + "</td>\n"
                        + "<td>" + persona.getEspecialidad() + "</td>\n"
                        + "<td>" + persona.getTipoEmpleado() + "</td>\n"
                        + "</tr>\n");
            }
            content.append(""
                    + "</tbody>\n"
                    + "</table >\n"
                    + "</div>\n"
                    + "</div>\n" + "</section>\n"
                    + "         <div class=\"jumbotron text-center\" style=\"margin-bottom:5\"   >\n"
                    + "             <div class=\"container \" >\n"
                    + "                 <div class=\"row\">\n"
                    + "                     <div class=\"col-sm-4 bg-white text-dark\">\n"
                    + "                         <h3>Column 1</h3>\n"
                    + "                             <p>fOTO.</p>\n"
                    + "</div>\n"
                    + "<div class=\"col-sm-4\">\n"
                    + "<h3>Informacion General</h3>\n"
                    + "     <p>Dirección: Transversal 16 BIS No. 45d -90</p>\n"
                    + "     <p>Teléfonos: 2852980 - 3688604</p>\n"
                    + "     <p> Celular: 311 506 1413 - 310 877 2557</p>\n"
                    + "<p>Correo electrónico: atg@atgltda.com+</p>\n"
                    + "</div>\n"
                    + "<div class=\"col-sm-4\">\n"
                    + "         <h3>IMPORTANTE</h3>\n"
                    + "<p>La firma tiene experiencia de 20 años en la mayoría de zonas geográficas y cuencas sedimentarias del país.</p>\n"
                    + "</div>\n"
                    + "</div>\n"
                    + "</div>\n"
                    + "</div>\n"
                    + "</body>\n"
                    + "</html>\n"
            );

            out.println(content.toString());
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
