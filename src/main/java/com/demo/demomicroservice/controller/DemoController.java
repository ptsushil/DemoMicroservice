package com.demo.demomicroservice.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/hello/{name}",  method = RequestMethod.GET)
    public String helloWorld(@PathVariable String name)
    {
        return name;
    }
}
