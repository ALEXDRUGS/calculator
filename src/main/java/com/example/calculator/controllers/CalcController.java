package com.example.calculator.controllers;

import com.example.calculator.services.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return " Welcome in calculator ";
    }

    @GetMapping("/plus")
    public String addition(Integer num1, Integer num2) {
       return calcService.addition(num1, num2);
    }

    @GetMapping("/minus")
    public String subtraction(Integer num1, Integer num2) {
       return calcService.subtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplication(Integer num1, Integer num2) {
       return calcService.multiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String division(Integer num1, Integer num2) {
       return calcService.division(num1, num2);
    }
}
