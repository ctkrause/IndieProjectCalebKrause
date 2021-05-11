package caleb.indie.controller;

import caleb.indie.persistence.GenericDao;
import caleb.indie.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


/**
 * A servlet to retrieve all users and send to admin accessible page
 * @author Caleb Krause
 * @version 1.0
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUsers extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Retrieves a list of all users stored in the database table and outputs them to a page only able to be
     * accessed by an admin
     * @param req The request object
     * @param resp The response object
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<User> userDao = new GenericDao(User.class);
        List<User> users = userDao.getAll();
        logger.info(users);
        req.setAttribute("users", users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/searchUser.jsp");
        dispatcher.forward(req, resp);
    }
}
