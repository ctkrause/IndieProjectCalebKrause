package caleb.indie.controller;

import caleb.indie.entity.JobsItem;
import caleb.indie.persistence.ApiDao;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/allJobs"})

public class AllJobs extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApiDao apiDAO = new ApiDao();
        JobsItem jobs = null;
        try {
            jobs = apiDAO.getAllJobs();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("jobs", jobs);
        RequestDispatcher dispatcher = req.getRequestDispatcher("displayJobs.jsp");
        dispatcher.forward(req, resp);
        System.out.println(jobs);
    }
}
