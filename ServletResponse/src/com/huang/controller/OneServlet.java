package com.huang.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "Hello Servlet!";
        int a = 50;

        PrintWriter writer = response.getWriter();
        writer.write(str);

        writer.write(a);
        writer.print(a);
    }
}
