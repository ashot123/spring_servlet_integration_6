package net.karakhanyan.integration.controller;


import net.karakhanyan.integration.entity.User;
import net.karakhanyan.integration.service.UserService;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Ashot Karakhanyan on 27-01-2014
 */
@WebServlet(name = "userAllController", urlPatterns = {"/userAllController.do"})
public class UserAllController extends HttpRequestHandlerServlet implements HttpRequestHandler {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final Collection<User> allUsers = userService.getAll();

        req.setAttribute("allUsers", allUsers);
        //req.setAttribute("user", userService.getById(1));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/users_all.jsp");
        dispatcher.forward(req, resp);
    }

}
