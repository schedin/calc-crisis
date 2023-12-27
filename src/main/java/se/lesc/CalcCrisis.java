package se.lesc;

public class CalcCrisis {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: CalcCrisis <operand1> <operator> <operand2>");
            System.exit(1);
        }
        // Parse command line arguments
        int operand1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int operand2 = Integer.parseInt(args[2]);

        System.out.println("Result: " + execute(operand1, operator, operand2));
    }
    
    public static int execute(int operand1, String operator, int operand2) {
        Calculator calculator = new Calculator();
        int result = 0;

        switch (operator) {
            case "+":
                result = calculator.add(operand1, operand2);
                break;
            case "-":
                result = calculator.sub(operand1, operand2);
                break;                
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
        return result;
    }
}
