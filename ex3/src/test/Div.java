package test;

/// Div class
/// Interpreter Pattern & Factory Pattern exercise 3
/// Student Name: Ahigad Genish
/// ID : 31628022
public class Div extends BinaryExpression{

    // Constructors
    public Div(Expression newLeftExpression, Expression newRightExpression) {
        super(newLeftExpression, newRightExpression);
    }

    // Methods
    @Override
    public double calculate() {

        double rightValue = super.right.calculate();

        // Check if right expression is zero
        if (rightValue == 0.0) {
            // Handle division by zero
            throw new ArithmeticException("Division by zero");
        }

        // Perform the division
        return super.left.calculate() / rightValue;
    }
}
