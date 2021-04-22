package org.wcs.hello;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})
public class SimpleHelloServlet extends HttpServlet {
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/hello-form.jsp").include(request,response);
    }

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("lname");
        String prenom = request.getParameter("fname");
        String heure = request.getParameter("heure");

        PrintWriter out = response.getWriter();
        int h = 0;
        try {
            h = Integer.parseInt(heure);
        } catch (Exception e) {
            log("echec parse heure ! " + e.getMessage());
        }
        if (h > 8 && h < 20) {
            out.println("Bonjour " + prenom +" " + nom + " !");
        } else {
            out.println("Bonsoir " + prenom +" " + nom + " !");
        }

    }

}
