package model;

import java.util.regex.Pattern;

public class Calculator {

    public static String execute(String[] params) {

        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        for (int i=0;i<3;i++) {
            if (params[i] == null) {
                throw new CalculatorException("Пустая строка!");
            }
        }
        for (int j = 1; j < 3; j++) {
            if (!(pattern.matcher(params[j]).matches())){
                throw new CalculatorException("Не является числом!");
            }
        }
        
        String operator = params[0];
        double value1;
        double value2;
        value1 = Double.valueOf(params[1]);
        value2 = Double.valueOf(params[2]);
        double result = calculate(operator, value1, value2);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new CalculatorException("Превышен порог значений");
        }
        return String.valueOf(Math.ceil(result * 1000) / 1000);
    }

    private static double calculate(String operator, double a, double b) {
        switch (operator) {
            case "+":
                return add(a, b);
            case "-":
                return subst(a, b);
            case "*":
                return mult(a, b);
            case "/":
                return div(a, b);
        }
        throw new CalculatorException("Неизвестный оператор");
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subst(double a, double b) {
        return a - b;
    }

    private static double div(double a, double b) {
        if (b == 0) {
            throw new CalculatorException();
        }
        return a / b;
    }

    private static double mult(double a, double b) {
        return a * b;
    }

}
