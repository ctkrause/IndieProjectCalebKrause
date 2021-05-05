package caleb.indie.controller;

import caleb.indie.entity.User;
import caleb.indie.persistence.ApiDao;
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

@WebServlet(
        name = "index", urlPatterns = {"/index"} )

public class DisplayJobsServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApiDao apiDao = new ApiDao();
        String searchBox = req.getParameter("search");
        String radioChoice = req.getParameter("criteria");
        try {
            if (searchBox == null) {
                req.setAttribute("jobs", apiDao.getAllJobs().getJobs());
            } else if (radioChoice.equals("company")) {
                String newSearchBox = searchBox.replaceAll(" ", "%20");
                req.setAttribute("jobs", apiDao.getJobsByCompany(newSearchBox).getJobs());
            } else if (radioChoice.equals("category")) {
                String newSearchBox = searchBox.replaceAll(" ", "%20");
                req.setAttribute("jobs", apiDao.getJobsByCategory(newSearchBox).getJobs());
            } else {
                String newSearchBox = searchBox.replaceAll(" ", "%20");
                req.setAttribute("jobs", apiDao.getJobsByDescription(newSearchBox).getJobs());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }

}
