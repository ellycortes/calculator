package io.pivotal.pal.calculator;

public class Calculator {

    private int firstValue;
    private int secondValue;

    public Calculator(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public int add() {
        return this.firstValue + this.secondValue;
    }

    public int sub() {
        return this.firstValue - this.secondValue;
    }

    public int mul() {
        return this.firstValue * this.secondValue;
    }

    public int div() {
        return this.firstValue / this.secondValue;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }
}
