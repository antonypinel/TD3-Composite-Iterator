package fr.univamu.iut.exo1;

public class NoeudInterne extends Expression {
    private char operatorBinary;
    private Expression premierOperand;
    private Expression secondOperand;


    /** Constructors **/

    public NoeudInterne (char operatorBinary, Expression premierOperand, Expression secondOperand) {
        this.operatorBinary = operatorBinary;
        this.premierOperand = premierOperand;
        this.secondOperand = secondOperand;

    }

    /** Methods **/

    public double CalculateValue() {
        if (operatorBinary == '-') {
            return premierOperand.CalculateValue() - secondOperand.CalculateValue();
        }
        else if (operatorBinary == '+') {
            return premierOperand.CalculateValue() + secondOperand.CalculateValue();
        }
        else if (operatorBinary == '*') {
            return premierOperand.CalculateValue() * secondOperand.CalculateValue();
        }
        else if (operatorBinary == '/') {
            return premierOperand.CalculateValue() / secondOperand.CalculateValue();
        }
        else return 0;
    }

    /** Getters/Setters **/

    public char getOperatorBinary() {
        return operatorBinary;
    }
    public void setOperatorBinary(char operatorBinary) {
        this.operatorBinary = operatorBinary;
    }

    public Expression getPremierOperand() {
        return premierOperand;
    }

    public void setPremierOperand(Expression premierOperand) {
        this.premierOperand = premierOperand;
    }

    public Expression getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Expression secondOperand) {
        this.secondOperand = secondOperand;
    }
}

