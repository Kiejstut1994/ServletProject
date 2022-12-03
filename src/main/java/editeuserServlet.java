import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "editeuser", value = "/editeuser")
public class editeuserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   HttpSession session=request.getSession();
   session.setAttribute("id",Integer.parseInt(request.getParameter("id")));
        getServletContext().getRequestDispatcher("/editeuser.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session= request.getSession();
    int id=(int) session.getAttribute("id");
    String userName=request.getParameter("userName");
    String email=request.getParameter("email");
    String password=request.getParameter("password");
    UserDAO userDAO=new UserDAO();
    userDAO.update(id,userName,email,password);
        response.sendRedirect(request.getContextPath() + "/mainview");
    }
}
