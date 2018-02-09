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
    System.out.println("get_method");
  //   doPost(request, response);
  }
  // public void delete_method(){
  //   System.out.println("delete_method");
  // //   doPost(request, response);
  // }
  // @Override
  // protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  //   super.doHead(req, resp);
  // }
 
  public void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("put_method");
  }

  protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // super.doDelete(req, resp);
    System.out.println("delete_method");
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
System.out.println("post_method");
    PrintWriter pw = response.getWriter();
// pw.println("hello world");
 
    String text = "Update successfull"; //message you will recieve 
   // String name = request.getParameter("name");
   System.out.println(text);
  //  System.out.println(name);
   
  }
}