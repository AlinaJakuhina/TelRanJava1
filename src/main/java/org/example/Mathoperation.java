package org.example;

public class Mathoperation {

    private double result;

    private double resExp;
    private double resSum;
    private double resDer;

    private void exp(float x) {
        resExp = Math.exp(-x);
    }

    private void sum(double x) {
        resSum = 1 + x;
    }

    private void der(double x) {
        resDer = 1 / x;
    }

    public void getSigmoid2(float x) {
        exp(x);
        sum(resExp);
        der(resSum);
    }
}
