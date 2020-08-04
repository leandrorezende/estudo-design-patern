package com.designpattern;

public class Main {
    public InterpreterContext interpreterContext;

    public Main(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public static void main(String[] args) {
        String first = "13 in Binary";
        String second = "28 in Hexadecimal";

        Main interpreter = new Main(new InterpreterContext());
        System.out.println(first + " = " + interpreter.interpreter(first));
        System.out.println(second + " = " + interpreter.interpreter(second));
    }

    public String interpreter(String str){
        Expression expression = null;
        if(str.contains("Hexadecimal"))
            expression = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        else if(str.contains("Binary"))
            expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        else
            return str;

        return expression.interpreter(interpreterContext);
    }
}
