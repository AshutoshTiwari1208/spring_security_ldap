package com.inclined.springsecurityldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String getHome() {
        return "<h3> hey this is the home page...</h3>";
    }

}
