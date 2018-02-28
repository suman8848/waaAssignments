package com.suman.day2lab1assignment;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleCalculator extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello I am post" + req.getParameter("firstNumber") );
        int firstNumber =Integer.parseInt (req.getParameter("firstNumber"));
        int secondNumber =Integer.parseInt (req.getParameter("secondNumber"));
        int firstMultiNumber = Integer.parseInt(req.getParameter("firstMultiNumber"));
        int secondMultiNumber = Integer.parseInt(req.getParameter("secondMultiNumber"));
        int multiply = firstMultiNumber * secondMultiNumber;
        int sum = firstNumber + secondNumber;
        req.setAttribute("sum", sum); // It'll be available as ${sum}.
        req.setAttribute("first",firstNumber);
        req.setAttribute("second",secondNumber);
        req.setAttribute("firstMulti",firstMultiNumber);
        req.setAttribute("secondMulti",secondMultiNumber);
        req.setAttribute("multi",multiply);
        req.getRequestDispatcher("views/simplecalculator.jsp").forward(req, resp);

    }
}
