package com.example.loginadmin.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminFilter implements Filter {
    @Override
    public void doFilter(ServletRequest Request, ServletResponse servletResponse, FilterChain Chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) Request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) Request;
        HttpSession session = httpServletRequest.getSession();
        boolean havePermission = false;
        if (session.getAttribute("username") != null) {
            String username = (String) session.getAttribute("username");
            System.out.println("Hello user: " + username);
            if (username.equals("admin")) {
                havePermission = true;
            }
        }
        if (havePermission) {
            Chain.doFilter(httpServletRequest, httpServletResponse);
        } else {
            httpServletResponse.getWriter().println("Permission denied");
        }
    }
}
