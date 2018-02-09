import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    doPost(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    
    PrintWriter pw = response.getWriter();
// pw.println("hello world");
 
    String text = "Update successfull"; //message you will recieve 
   // String name = request.getParameter("name");
   System.out.println(text);
  //  System.out.println(name);
   
  }
}