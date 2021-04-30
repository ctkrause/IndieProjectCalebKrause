package caleb.indie.controller;

import caleb.indie.persistence.ApiDao;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/allJobs"})

public class AllJobs extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApiDao apiDAO = new ApiDao();
        req.setAttribute("jobs", apiDAO.getAllJobs());
        RequestDispatcher dispatcher = req.getRequestDispatcher("displayJobs.jsp");
        dispatcher.forward(req, resp);
    }
}
