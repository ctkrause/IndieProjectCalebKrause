package caleb.indie.controller;

import caleb.indie.entity.ResultsItem;
import caleb.indie.entity.User;
import caleb.indie.persistence.GenericDao;
import caleb.indie.persistence.JobService;
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
        name = "listAllJobs", urlPatterns = {"/listAllJobs"} )

public class DisplayAllJobs extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ResultsItem> jobs = JobService.fetchJobs(0, 50);
        req.setAttribute("jobs", jobs);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/listAllJobs.jsp");
        dispatcher.forward(req, resp);
    }
}
