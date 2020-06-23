
package controlador;

import Modelo.Usuario;
import Modelo.UsuarioDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {
    UsuarioDao dao=new UsuarioDao();
    Usuario u= new Usuario();
    int r;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         String accion= request.getParameter("accion");
         if(accion.equals("Ingresar")){
             String correo=request.getParameter("txtcorreo");
             String contrasenna=request.getParameter("txtcontr");
             u.setCorreo(correo);
             u.setContrasenna(contrasenna);
             r=dao.validar(u);
             if(r==1){
                
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
         }
        }
    }


