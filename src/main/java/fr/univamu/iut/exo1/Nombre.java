package fr.univamu.iut.exo1;

public class Nombre extends Expression {
    private int value;

    /** Constructors **/

    public Nombre (int value) {
        this.value = value;
    }

    /** Methods **/

    public double CalculateValue() {
        return value;
    }

    /** Getters/Setters **/

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
