package com.bridgelabz;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description = "Login servlet testing",
        urlPatterns = {"/LoginServlet"},
        initParams = {
                @WebInitParam(name = "user",value = "sahil"),
                @WebInitParam(name = "password",value = "pawar")
        }
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        String userID = getServletConfig().getInitParameter("user");
        String password = getServletConfig().getInitParameter("password");
        if (userID.equals(user) && password.equals(pwd)) {
            request.setAttribute("user",user);
            request.getRequestDispatcher("LoginSuceess.jsp").forward(request,response);
        }else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/LoginServlet.html");
            PrintWriter out = response.getWriter();
            out.println("<font color = red>Either user name or password is wrong</font>");
            rd.include(request, response);
        }
    }
}
