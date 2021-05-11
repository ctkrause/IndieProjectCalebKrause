package caleb.indie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import caleb.indie.entity.Role;
import caleb.indie.persistence.GenericDao;
import caleb.indie.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Allows a new user to sign up and stores their information in the database
 * @author Caleb Krause
 * @version 1.0
 */

@WebServlet("/register")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 5462223600l;
    private GenericDao genericDao;
    private GenericDao roleDao;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Initializes Generic Dao for class specific use
     */
    public void init() {
        genericDao = new GenericDao(User.class);
        roleDao = new GenericDao(Role.class);
    }

    /**
     * Calls the register method
     * @param request The request object
     * @param response The response object
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        register(request, response);
    }

    /**
     * Redirects to the register jsp page
     * @param request The request object
     * @param response The response object
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("register.jsp");
    }

    /**
     * Grabs user entered information from the register jsp page and inputs the new user into the database
     * @param request The request object
     * @param response The response object
     * @throws IOException
     * @throws ServletException
     */
    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = new User();
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.setUserName(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));


        Role role = new Role();
        String userName = user.getUserName();
        int userId = user.getId();
        role.setUser(user);
        role.setRoleName("user");
        role.setUserName(userName);
        role.setId(userId);
        genericDao.insert(user);
        roleDao.insert(role);

        RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.jsp");
        dispatcher.forward(request, response);

    }
}
