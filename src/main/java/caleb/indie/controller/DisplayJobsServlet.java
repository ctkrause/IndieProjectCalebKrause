package caleb.indie.controller;

import caleb.indie.persistence.ApiDao;
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
 * This servlet uses the Remotive IO to retrieve job information and return jobs to the index jsp.
 * @author Caleb Krause
 * @version 1.0
 */
@WebServlet(
        name = "index", urlPatterns = {"/index"} )

public class DisplayJobsServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    /**
     * The doGet method utilizes the api dao to retrieve job data from the API endpoints
     * @param req the request object
     * @param resp the response object
     * @throws ServletException
     * @throws IOException
     */
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
