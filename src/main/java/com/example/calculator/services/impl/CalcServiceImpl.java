package com.example.calculator.services.impl;

import com.example.calculator.services.CalcService;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public String addition(Integer a, Integer b) {
       return a + " + " + b + " = " + (a + b);
    }

    @Override
    public String subtraction(Integer a, Integer b) {
        return a + " - " + b + " = " + (a - b);
    }

    @Override
    public String multiplication(Integer a, Integer b) {
        return a + " * " + b + " = " + (a * b);
    }

    @Override
    public String division(Integer a, Integer b) {
        if (b == 0) {
            return "Can't divide by zero";
        } else {
            return a + " / " + b + " = " + (a / b);
        }
    }
}
