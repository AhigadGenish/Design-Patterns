package test;

/// Minus class
/// Interpreter Pattern & Factory Pattern exercise 3
/// Student Name: Ahigad Genish
/// ID : 31628022
public class Minus extends BinaryExpression{

    // Constructors
    public Minus(Expression newLeftExpression, Expression newRightExpression) {
        super(newLeftExpression, newRightExpression);
    }

    // Methods
    @Override
    public double calculate() {
        return super.left.calculate() - super.right.calculate();
    }
}
