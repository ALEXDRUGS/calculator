package com.example.calculator.services.impl;

import com.example.calculator.services.CalcService;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public void addition(Integer a, Integer b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    @Override
    public void subtraction(Integer a, Integer b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    @Override
    public void multiplication(Integer a, Integer b) {
        System.out.println(a + " + " + b + " = " + (a * b));
    }

    @Override
    public void division(Integer a, Integer b) {
        if (b == 0) {
            System.out.println("Can't divide by zero");
        } else {
            System.out.println(a + " + " + b + " = " + (a / b));
        }
    }
}
