package com.jboss.coursewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class StackController {
    @RequestMapping("/stacks")
    public String courses(HttpServletRequest req){
        HttpSession session = req.getSession();
        String sname = req.getParameter("sname");
        session.setAttribute("sname", sname);
        return "stack";
    }
}
