package caleb.indie.controller;

import caleb.indie.entity.JobsItem;
import caleb.indie.persistence.NetClientGet;
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
        name = "allJobs", urlPatterns = {"/allJobs"} )

public class GetJobs extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        NetClientGet net = new NetClientGet();
        JobsItem jobs = new JobsItem();
        String jobsItem;
        jobsItem = net.retrieveRemote();
        req.setAttribute("jobsItem", jobsItem);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/allJobs.jsp");
        dispatcher.forward(req, resp);
    }

}
