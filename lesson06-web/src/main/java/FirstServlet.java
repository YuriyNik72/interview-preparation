

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
    public class FirstServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {
            resp.setContentType("text/html; charset = UTF-8");
            resp.getWriter().printf("<h1>New GET request</h1>");
        }
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {
            resp.getWriter().printf("<h1>New POST request</h1>");
        }
        @Override
        public void init() throws ServletException{
        }
    }

