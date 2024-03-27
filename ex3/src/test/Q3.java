package test;

import java.util.*;

/// Q3 Class
/// Interpreter Pattern & Factory Pattern exercise 3
/// Student Name: Ahigad Genish
/// ID : 31628022
public class Q3 {

    // Creator interface - Factory Pattern
    public interface BinaryExpressionCreator{
        BinaryExpression create(Expression left, Expression right);
    }

    // Binary Expression Factory Class
    public static class BinaryExpressionFactory{

        // Data Member
        private static Map<String, BinaryExpressionCreator> factory = new HashMap<String, BinaryExpressionCreator>();
        // Static constructor
        static {
            factory.put("+", (left, right) -> new Plus(left, right));
            factory.put("-", (left, right) -> new Minus(left, right));
            factory.put("/", (left, right) -> new Div(left, right));
            factory.put("*", (left, right) -> new Mul(left, right));
        }

        // Creator method
        public static BinaryExpression creator(String operator, Expression left, Expression right){

            BinaryExpressionCreator binaryExpression = factory.get(operator);

            if(binaryExpression != null)
                return binaryExpression.create(left, right);

            return null;
        }
    }

    // Methods

    // Calc method - use Shunting yard algorithm of Dijkstra
    public static double calc(String expression){

        // Get final state of queue by shunting yard algorithm
        Deque<String> queueNumbers = shuntingYardAlgorithm(expression);
        // Return result by help method
        return helpCalc(queueNumbers);
    }

    // Help method to create calculation by expression
    public static double helpCalc(Deque<String> queueNumbers) {

        if (queueNumbers.isEmpty()) {
            return 0.0; // Return 0.0 for an empty queue
        }
        // Get final expression
        Expression expression = helpExpression(queueNumbers);

        // Calculate the result
        double result = expression.calculate();

        // Round the result to 4 decimal places
        result = Math.round(result * 10000.0) / 10000.0;

        return result;
    }

    // Create expression recursively like tree and return final expression
    private static Expression helpExpression(Deque<String> queueNumbers){

        String lastValue = queueNumbers.removeLast();

        if(isNumeric(lastValue) == true){ // Number
            Number newNumber = new Number(Double.parseDouble(lastValue));
            return newNumber;
        }
        else{ // Operator - meaning at least 2 more strings are in queue
            Expression right = helpExpression(queueNumbers);
            Expression left = helpExpression(queueNumbers);
            return BinaryExpressionFactory.creator(lastValue, left, right);
        }
    }

    // Shunting yard algorithm by Dijkstra
    private static Deque<String> shuntingYardAlgorithm(String expression){
        
        // Initialize queue for numbers and stack for operators
        Deque<String> queueNumbers = new ArrayDeque<String>();
        Stack<String> operatorStack = new Stack<String>();

        // Convert the expression to array of strings
        List<String> expressionList = getStringArray(expression);

        for(String c : expressionList){

            if(isNumeric(c) == true){
                queueNumbers.add(c); // Number - so enqueue
            }
            else if(isOperator(c) == true){ // Operator - check for greater precedence operator on stack

                // While stack is not empty and the peek is operator with greater precedence
                while(operatorStack.isEmpty() == false && isOperator(operatorStack.peek()) == true && hasGreatOrEqualPrecedence(operatorStack.peek(), c) == true){
                    popOperatorFromStackOntoQueue(queueNumbers, operatorStack); // // Pop operator from stack onto queue
                }
                // Otherwise, push the operator into stack
                operatorStack.push(c);
            }
            else if(isOpenParenthesis(c) == true){ // Open parenthesis - so push into stack
                operatorStack.push(c);
            }
            else if(isCloseParenthesis(c) == true){ // Close parenthesis - pop from stack into queue until the open parenthesis appearing

                // While stack is not empty and the peek is not open parenthesis
                while(operatorStack.isEmpty() == false && isOpenParenthesis(operatorStack.peek()) == false){
                    popOperatorFromStackOntoQueue(queueNumbers, operatorStack);  // Pop operator from stack onto queue
                }
                // Otherwise - if not empty - pop the open parenthesis
                if(operatorStack.isEmpty() == false)
                    operatorStack.pop();
            }
        }

        // While stack is not empty
        while(operatorStack.isEmpty() == false){
            popOperatorFromStackOntoQueue(queueNumbers, operatorStack); // Pop operator from stack onto queue
        }

        return queueNumbers;
    }

    // Method for pop top from stack ant insert it into queue
    private static void popOperatorFromStackOntoQueue(Deque<String> queueNumbers, Stack<String> operatorStack) {
        String topStackOperator = operatorStack.pop();
        queueNumbers.add(topStackOperator);
    }

    // Help method for convert string expression to array
    private static List<String> getStringArray(String expression) {

        List<String> result = new ArrayList<String>();
        // Split expression around matches of empty string ""
        String[] expressionArray = expression.split("");

        String temp = "";
        for(String current : expressionArray){

            if(isNotOperator(current) == true){
                temp += current;
            }
            else{
                if(temp.isEmpty() == false){
                    result.add(temp);
                    temp = "";
                }
                result.add(current);
            }
        }

        if(temp.isEmpty() == false){
            result.add(temp);
        }

        return result;
    }

    // Check if given string is not operator (e.g: digit \ point)
    private static boolean isNotOperator(String s) {

        return isCloseParenthesis(s) == false && isOpenParenthesis(s) == false && isOperator(s) == false;
    }

    // Check if given string is close parenthesis
    private static boolean isCloseParenthesis(String c) {

        return c.equals(")") == true;
    }

    // Check if given string is open parenthesis
    private static boolean isOpenParenthesis(String c) {
        return c.equals("(") == true;
    }

    // Check if given string is operator
    private static boolean isOperator(String c) {

        if(c.equals("*") == true || c.equals("/") == true || c.equals("+") == true || c.equals("-") == true){
            return true;
        }
        return false;
    }

    // Check if given string is numeric value
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }

        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // Helper method to check if operator a has greater or equal precedence than operator b
    private static boolean hasGreatOrEqualPrecedence(String a, String b) {
        return precedence(a) >= precedence(b);
    }

    // Helper method to assign precedence values to operators
    private static int precedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return 0; // Default precedence for unknown operators
        }
    }

}