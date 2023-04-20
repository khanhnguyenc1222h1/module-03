package com.example.calculatorservlet;

public class Calculator {

    public static float calculator(float number_first, float number_two, char operator) {
        float   result = 0;
        switch (operator){
            case '+':
                result = number_first + number_two;
                break;
            case '-':
                result = number_first - number_two;
                break;
            case '*':
                result = number_first * number_two;
                break;
            case '/':
                result = number_first / number_two;
                break;
        }
        return result;
    }
}
