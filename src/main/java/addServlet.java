import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "adduser", value = "/adduser")
public class addServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/adduser.jsp")
                .forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName=request.getParameter("userName");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        User user=new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);
        UserDAO userDAO=new UserDAO();
        userDAO.create(user);
        response.sendRedirect(request.getContextPath() + "/mainview");
    }
}
