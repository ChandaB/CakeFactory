package com.cakefactory.bakeryapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class BakeryAppController {
    /**
     * To set your default context path, add a server.servlet.contextPath setting in your
     * application.properties file otherwise your index page will display at root
     * URL (i.e. localhost:8080 instead of localhost:8080/index
     *
     * @return this is the page template that gets displayed for the path cake
     */
    @RequestMapping(value = "/cake")
    public String index() {
        return "cake";
    }
}
