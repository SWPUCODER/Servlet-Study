package com.huang.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class TwoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String parameterName = (String) parameterNames.nextElement();
            String value = request.getParameter(parameterName);
            System.out.println(parameterName+":"+value);
        }
    }
}
