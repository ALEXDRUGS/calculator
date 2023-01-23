package com.example.calculator.controllers;

import com.example.calculator.services.CalcService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public void hello() {
        System.out.println("Welcome in calculator");
    }

    @GetMapping("/plus")
    public void addition(Integer num1, Integer num2) {
       calcService.addition(num1, num2);
    }

    @GetMapping("/minus")
    public void subtraction(Integer a, Integer b) {
       calcService.subtraction(a, b);
    }

    @GetMapping("/multiply")
    public void multiplication(Integer a, Integer b) {
       calcService.multiplication(a, b);
    }

    @GetMapping("/divide")
    public void division(Integer a, Integer b) {
       calcService.division(a, b);
    }
}
