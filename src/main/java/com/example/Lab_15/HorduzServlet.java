package com.example.Lab_15;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "horduzServlet", value = "/horduz-servlet")
public class HorduzServlet extends HttpServlet {
    private String fullName;

    public void init() {
        fullName = "Oleksandr Horduz";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>" + fullName + "</h1>");
        out.println("<img src=\"eclipse.jpg\" alt=\"Oops, something went wrong\">");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}
