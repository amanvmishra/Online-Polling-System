package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.*;


public class Authentication extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        String u=request.getParameter("userId");
        String p=request.getParameter("pass");
        u=u.replace("'","\\'");
        p=p.replace("'","\\'");
      //  out.print("<h1>Welcome'"+u+"' password : '"+p+"'</h1>");
        
        String q="select * from users where UserID='"+u+"' and password='"+p+"';";
         ResultSet rs=DAOLayer.selectData(q);
         try{
             if(rs.next())
            {
              
              String role =rs.getString(4);
              if(role.equals("admin"))
              { 
                HttpSession s=request.getSession();
                s.setAttribute("userId",u);
                response.sendRedirect("Admin_homepage.jsp");
                
              }
              else        
              {
               HttpSession s=request.getSession();
                s.setAttribute("userId",u);
                response.sendRedirect("voter_homepage.jsp");
                
              }
              }
           else
             {
                out.print("<h2>Invalid User ID or Password :</h2>");
                out.print("<h2><a href='voterlogin.jsp'>Try Again</a></h2>");
             }
             
         }
         catch(Exception e)
         {
         out.print("<h3>Sorry : ResultSet Error<h3>");
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
