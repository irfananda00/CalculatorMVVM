package com.example.mac.calculatormvvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 4/2/18.
 */

public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    //Function
    public void reset() {
        value = 0;
    }

    public boolean isOperatorExist(String formula){
        for (int i = 0; i < formula.length(); i++) {
            if (Character.isLetter(formula.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public int doFormula(String formula){
        int num1 = 0;
        int num2 = 0;
        String numTemp = "";
        String currentOperator = "";
        for (int i = 0; i < formula.length(); i++) {
            if (Character.isDigit(formula.charAt(i))){
                numTemp = numTemp + formula.charAt(i);
            }else{
                if (num1==0)
                    num1 = Integer.valueOf(numTemp);
                else
                    num2 = Integer.valueOf(numTemp);
                numTemp = "";
                if (!currentOperator.equals("")){
                    switch (currentOperator){
                        case "÷":
                            value = divide(num1,num2);
                            break;
                        case "x":
                            value = multiply(num1,num2);
                            break;
                        case "-":
                            value = substract(num1,num2);
                            break;
                        case "+":
                            value = add(num1,num2);
                            break;
                    }
                    num1 = value;
                    num2 = 0;
                    numTemp = "";
                    currentOperator = "";
                }
                currentOperator = String.valueOf(formula.charAt(i));
            }
        }
        if (num1==0)
            num1 = Integer.valueOf(numTemp);
        else
            num2 = Integer.valueOf(numTemp);
        numTemp = "";
        if (!currentOperator.equals("")) {
            switch (currentOperator) {
                case "÷":
                    value = divide(num1, num2);
                    break;
                case "x":
                    value = multiply(num1, num2);
                    break;
                case "-":
                    value = substract(num1, num2);
                    break;
                case "+":
                    value = add(num1, num2);
                    break;
            }
        }
        return value;
    }

    public int divide(int num1, int num2){
        value = num1/num2;
        return value;
    }

    public int multiply(int num1, int num2){
        value = num1*num2;
        return value;
    }

    public int substract(int num1, int num2){
        value = num1-num2;
        return value;
    }

    public int add(int num1, int num2){
        value = num1+num2;
        return value;
    }

    //Set Get Variables
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
