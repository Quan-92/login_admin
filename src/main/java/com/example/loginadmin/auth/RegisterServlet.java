package com.example.loginadmin.auth;

import com.example.loginadmin.entity.Account;
import com.example.loginadmin.service.AccountService;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

public class RegisterSevlet extends HttpServlet {
    private HashMap<String, String> errors;
    private AccountService accountService;

    @Override
    public void init() throws ServletException {
        errors = new HashMap<>();
        accountService = new AccountService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/auth/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        if(errors.size() == 0) {
            Account account = accountService.login(username, password);
            System.out.println("acc " + account.toString());
            if(account != null) {
                session.setAttribute("currentAccount", account);
                resp.sendRedirect("/admin/categories");
                return;
            }
        }
        req.setAttribute("errors", errors);
        req.setAttribute("username", username);
        req.getRequestDispatcher("/admin/auth/login.jsp").forward(req, resp);
    }
}
