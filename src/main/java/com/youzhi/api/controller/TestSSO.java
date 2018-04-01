package com.youzhi.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class TestSSO {

    @GetMapping("/addUser")
    public String index(HttpServletRequest request, HttpServletResponse response) throws IOException {

        return "addUser";

    }
}
