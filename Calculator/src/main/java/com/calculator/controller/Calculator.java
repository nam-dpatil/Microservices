package com.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Calculator {
    @GetMapping("/add/{num1}/{num2}")
    public Integer add(@PathVariable int num1, @PathVariable int num2)
    {
        return num1+num2;
    }

    @GetMapping("/sub/{num1}/{num2}")
    public Integer sub(@PathVariable int num1, @PathVariable int num2)
    {
        return num1-num2;
    }

    @GetMapping("/multi/{num1}/{num2}")
    public Integer multi(@PathVariable int num1, @PathVariable int num2)
    {
        return num1*num2;
    }

    @GetMapping("/div/{num1}/{num2}")
    public Integer div(@PathVariable int num1, @PathVariable int num2)
    {
        return num1/num2;
    }
}
