package com.bridgelabz.login_page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//This annotation is used to give this servlet a mapping.
@WebServlet(value = "/LogIn")
public class LogIn extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Extracting the parameters to compare it that if it is correct or not.
        String uName = request.getParameter("uName");
        String pswd = request.getParameter("pswd");

        //Comparison been done on the basis of which welcome page will be accessed.
        if ("kishlay".equals(uName) && "sw".equals(pswd)) {
            HttpSession session = request.getSession();
            session.setAttribute("uName", uName);
            String location = "WelcomePage.jsp";
            response.sendRedirect(location);
        }
        else {
            response.sendRedirect("Login.jsp");
        }
    }
}