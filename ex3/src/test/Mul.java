package test;

/// Mul class
/// Interpreter Pattern & Factory Pattern exercise 3
/// Student Name: Ahigad Genish
/// ID : 31628022
public class Mul extends BinaryExpression{

    // Constructors
    public Mul(Expression newLeftExpression, Expression newRightExpression) {
        super(newLeftExpression, newRightExpression);
    }

    // Methods
    @Override
    public double calculate() {
        return super.left.calculate() * super.right.calculate();
    }
}
