import java.util.Stack;
/*
* Problem:Evaluate Infix Expression (basic)
* Solution:https://www.geeksforgeeks.org/problems/fun-with-expresions2523/1
*/
public class Problem2 {
    public int evaluateInfix(String[] arr) {
        // Code here
        //gpt solution
        Stack<Integer> values = new Stack<>();
        Stack<String> ops = new Stack<>();

        for (String token : arr) {

            // If number
            if (isNumber(token)) {
                values.push(Integer.parseInt(token));
            } // If opening bracket
            else if (token.equals("(")) {
                ops.push(token);
            } // If closing bracket
            else if (token.equals(")")) {
                while (!ops.isEmpty() && !ops.peek().equals("(")) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop(); // remove "("
            } // If operator
            else {
                while (!ops.isEmpty() && !ops.peek().equals("(")
                        && (precedence(ops.peek()) > precedence(token)
                        || (precedence(ops.peek()) == precedence(token) && !token.equals("^")))) {

                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(token);
            }
        }

        // Remaining operations
        while (!ops.isEmpty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    private boolean isNumber(String s) {
        return s.matches("\\d+");
    }

    private int precedence(String op) {
        if (op.equals("+") || op.equals("-")) {
            return 1;
        }
        if (op.equals("*") || op.equals("/")) {
            return 2;
        }
        if (op.equals("^")) {
            return 3;
        }
        return 0;
    }

    private int applyOp(String op, int b, int a) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "^":
                return (int) Math.pow(a, b);
        }
        return 0;
    }
}
