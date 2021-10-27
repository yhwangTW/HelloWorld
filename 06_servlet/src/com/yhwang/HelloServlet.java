package com.yhwang;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("1");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)) {
            doGet();
        } else {
            doPost();
        }
        System.out.println("3");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4");
    }

    public void doGet() {
        System.out.println("GET request");
    }

    public void doPost() {
        System.out.println("POST request");
    }
}
