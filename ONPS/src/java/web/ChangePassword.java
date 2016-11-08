package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.*;
import javax.servlet.http.HttpSession;


public class ChangePassword extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     
      String np=request.getParameter("npass");
      String cp=request.getParameter("cpass");
      
         if(np.equals(cp))
         {
             HttpSession s=request.getSession();
        
            String user=(String)s.getAttribute("userId");
            String q="update users set password='"+np+"' where UserID='"+user+"';";
           int ar=DAOLayer.updateData(q);   
             
              if(ar>0)
              { 
                   response.sendRedirect("change_password.jsp");
                   out.print("<h2>Password Changed Successfully</h2>");
                 
              }
    
    }
         else
         {
            out.print("<h2>Confirm Password Does not match</h2>");
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
