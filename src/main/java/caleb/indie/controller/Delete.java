package caleb.indie.controller;

import caleb.indie.entity.User;
import caleb.indie.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Add or edit the user
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/delete"}
)

public class Delete extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao<User> userData = new GenericDao(User.class);
        User user = new User();
        int id = Integer.valueOf(req.getParameter("id"));
        User usertodelete = userData.getById(id);
        userData.delete(usertodelete);
        logger.info(usertodelete + " was deleted from the database.");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/searchUser");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
