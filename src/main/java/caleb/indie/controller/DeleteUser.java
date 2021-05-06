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
import java.util.List;

/**
 * Add or edit the user
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/deleteUser"}
)

public class DeleteUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("delete") != null) {
            GenericDao<User> userDao = new GenericDao(User.class);
            User user = new User();
            int userId = user.getId(user);
            User userToDelete = userDao.getById(userId);
            userDao.delete(userToDelete);
            RequestDispatcher dispatcher = req.getRequestDispatcher("searchUser");
            dispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
