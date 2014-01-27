package net.karakhanyan.integration.controller;


import net.karakhanyan.integration.entity.User;
import net.karakhanyan.integration.service.UserService;
import org.springframework.stereotype.Component;
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
@WebServlet(name = "userAllController", urlPatterns={"/userAllController.do"}  )
/*@Component("myServlet")*/
public class UserAllController extends HttpRequestHandlerServlet implements HttpRequestHandler {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("******* HELLO *******");
        final Collection<User> allUsers = userService.getAll();
        //System.out.println(allUsers);

        req.setAttribute("allUsers", new ArrayList<User>(allUsers));
        //req.setAttribute("user", userService.getById(1));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/users_all.jsp");
        dispatcher.forward(req, resp);
    }

    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("******* HELLO *******");
        System.out.println(userService.serviceMethod());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/users_all.jsp");
        dispatcher.forward(req, resp);
    }*/
}
