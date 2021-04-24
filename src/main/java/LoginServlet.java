import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String userName=request.getParameter("UserName");
        String password=request.getParameter("Password");
        if(userName.equals("Mehtab") && password.equals("pass")){
            out.println(userName + " Login Successfully");
            out.println("<!DOCTYPE html>" +
            "<html>" +
               "<head>" +"</head>\n" +
               "<body" +
                  userName +"<h1> Login Successfully </h1>"+
               "</body>" +
            "</html>"
         );
        }else{
            out.println("Your uername or password is incorrect");
        }
        
    }
}
