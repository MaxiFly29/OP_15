package com.example.Lab_15;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "sachkodmytro", value = "/Sachko_Dm")
public class SachkoDm extends HttpServlet {
    private String github, name, email;

    public void init() {
        github = "https://github.com/MaxiFly29";
        name = "Dmytro Sachko";
        email = "dimaidanya79@gmail.com";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + name + "</h1>");
        out.println("<h2>Email: " + email + "</h2>");
        out.println("<h2>GitHub: <a href=\"" + github + "\">click</a></h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

