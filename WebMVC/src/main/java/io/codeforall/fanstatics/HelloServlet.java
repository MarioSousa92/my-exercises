package io.codeforall.fanstatics;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    Customer customer = new Customer("Hugo", " Ilobeklqhsdbsd@gmail.com", 911);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/rui.jsp");
        getServletContext().setAttribute("customer", customer);
        requestDispatcher.forward(req, resp);

    }
}