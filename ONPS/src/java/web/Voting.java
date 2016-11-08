
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.*;

public class Voting extends HttpServlet {

      static int bjp;
      static int cong;
      static int aap;
      static int bjd;
      static int tmc;
      static String voter_id;
      String votingStatus;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        HttpSession s=request.getSession();
        String user=(String)s.getAttribute("userId");
       
        
        String party=request.getParameter("vote");
       
    
   String q1="select* from voter where userid='"+user+"'";
      ResultSet rs =DAOLayer.selectData(q1);
     
      try{
      if(rs.next())
      {    voter_id =rs.getString(1);
           votingStatus=rs.getString(8);
        //  out.print("<h2>"+votingStatus+"</h2>");
        //  out.print("<h2>"+voter_id+"</h2>");
      }
      
      }
      catch(Exception e)
      {
      out.print("Result Set Error : ");
      }
      
      if(votingStatus.equals("notvoted"))

      {   
          if(party.equals("bjp"))
        {
          bjp=bjp+1;
         String q="update politicalparty set vote="+bjp+" where party_id='bjp';";
          int ar=DAOLayer.updateData(q);
          if(ar!=0)
        {
            status();
       out.print("<h2>You have Successfully Voted</h2>");
            out.print("<h2><a href='voter_homepage.jsp'>Go Back</a></h2>");   
         
        }
      
      }
      else if(party.equals("cong"))
      {
          cong=cong+1;
          String q="update politicalparty set vote="+cong+" where party_id='"+party+"';";
          int ar=DAOLayer.updateData(q);
          if(ar!=0)
        {
            status();
        out.print("<h2>You have Successfully Voted</h2>");
            out.print("<h2><a href='voter_homepage.jsp'>Go Back</a></h2>");
         
        }
      
      }
      else if(party.equals("aap"))
      {
          aap=aap+1;
          String q="update politicalparty set vote="+cong+" where party_id='"+party+"';";
          int ar=DAOLayer.updateData(q);
          if(ar!=0)
        {
            status();
       out.print("<h2>You have Successfully Voted</h2>");
            out.print("<h2><a href='voter_homepage.jsp'>Go Back</a></h2>");  
         
        }
      
      }
      else if(party.equals("bjd"))
      {
          bjd=bjd+1;
          String q="update politicalparty set vote="+bjd+" where party_id='"+party+"';";
          int ar=DAOLayer.updateData(q);
          if(ar!=0)
        {
            status();
        out.print("<h2>You have Successfully Voted</h2>");
            out.print("<h2><a href='voter_homepage.jsp'>Go Back</a></h2>");  
         
        }
      
      }
      else
      {
       
          tmc=tmc+1;
          String q="update politicalparty set vote="+tmc+" where party_id='"+party+"';";
          int ar=DAOLayer.updateData(q);
          if(ar!=0)
        {
            status();
        // request.setAttribute("msg","Voting Recorded");
            out.print("<h2>You have Successfully Voter</h2>");
            out.print("<h2><a href='voter_homepage'>Go Back</a></h2>");
   
         
        }
      
      }
      }
      else{
      
      out.print("You have already Voted");
      
      }
    }
    
    public void status()
    {
    String q2="update voter set voting_status='voted' where voter_id='"+voter_id+"'"; 
    int ar=DAOLayer.updateData(q2);
   
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
