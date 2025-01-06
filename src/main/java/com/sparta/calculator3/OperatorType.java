package com.sparta.calculator3;

public enum OperatorType {
    ADD('+'),
    SUBSTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char operatorType;

    OperatorType(char operator){
        this.operatorType = operator;
    }

    public char getOperator() {
        return operatorType;
    }
}
