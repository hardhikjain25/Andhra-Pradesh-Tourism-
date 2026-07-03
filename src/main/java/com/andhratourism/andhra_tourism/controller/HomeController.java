package com.andhratourism.andhra_tourism.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/places")
    public String places() {
        return "places";
    }

    @GetMapping("/hotels")
    public String hotels() {
        return "hotels";
    }

    @GetMapping("/food")
    public String food() {
        return "food";
    }

    @GetMapping("/travel")
    public String travel() {
        return "travel";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}