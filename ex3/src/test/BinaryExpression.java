package test;

/// BinaryExpression class
/// Interpreter Pattern & Factory Pattern exercise 3
/// Student Name: Ahigad Genish
/// ID : 31628022
public abstract class BinaryExpression implements Expression {

    // Data Members
    protected Expression left;
    protected Expression right;

    // Constructors
    public BinaryExpression(Expression newLeftExpression, Expression newRightExpression){
        this.left = newLeftExpression;
        this.right = newRightExpression;
    }
}
