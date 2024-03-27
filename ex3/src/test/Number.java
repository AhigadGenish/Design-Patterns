package test;

/// Number class
/// Interpreter Pattern & Factory Pattern exercise 3
/// Student Name: Ahigad Genish
/// ID : 31628022

public class Number implements Expression{

    // Data Members
    private double value;

    // Constructor
    public Number(double newValue){
        this.value = newValue;
    }

    // Methods
    @Override
    public double calculate() {
        return value;
    }
}
