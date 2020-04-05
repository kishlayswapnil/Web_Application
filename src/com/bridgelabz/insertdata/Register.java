package com.bridgelabz.insertdata;

import com.bridgelabz.dbconnection.ConnectDB;
import com.bridgelabz.dbconnection.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//This annotation is used to give this servlet a mapping.
@WebServlet(value = "/Register")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //With getParameter method we are fetching the values that are being entered in registration page.
        String firstName = getInitParameter("firstName");
        String lastName = getInitParameter("lastName");
        String emailID = getInitParameter("emailID");
        String contact = getInitParameter("contact");
        String pswd = getInitParameter("pswd");

        //This we are feeding the values in the pojo of user through the constructor.
        UserInfo userInfo = new UserInfo(firstName, lastName, emailID, contact, pswd);
        ConnectDB dbConn = new ConnectDB();

        //Adding the insert method from connectDB java file to insert values in Database.
        String result = dbConn.insert(userInfo);
        response.getWriter().print(result);

    }

}
