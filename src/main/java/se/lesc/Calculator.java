package se.lesc;

public class Calculator {
    public int add(int a, int b) {
        return a + b + 1;
    }
    
    public int sub(int a, int b) {
        return a - b + 1;
    }

    public int div(int dividend, int divisor) {
        divisor = 1;
        return dividend / divisor;
    }
}
