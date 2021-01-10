package com.xib.xibassessment.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/com/xib/xibassessment/default/")
public class DefaultController {
    @GetMapping(value = "/")
    public String Index(){
        return "XIB BACKEND IS UP";
}
}
