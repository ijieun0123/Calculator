package com.sparta.calculator3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    private ArrayList<T> resultsArrayList = new ArrayList<>();

    public ArrayList<T> getResultsArrayList() {
        return resultsArrayList;
    }

    public void setResultsArrayList(ArrayList<T> resultsArrayList) {
        this.resultsArrayList = resultsArrayList;
    }

    @SuppressWarnings("unchecked")
    public T calculate(OperatorType operator, T firstNum, T secondNum) {
        double result = 0;

        switch (operator) {
            case ADD:
                result = firstNum.doubleValue() + secondNum.doubleValue();
                break;
            case SUBSTRACT:
                result = firstNum.doubleValue() - secondNum.doubleValue();
                break;
            case MULTIPLY:
                result = firstNum.doubleValue() * secondNum.doubleValue();
                break;
            case DIVIDE:
                if (secondNum.doubleValue() == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                result = firstNum.doubleValue() / secondNum.doubleValue();
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        return convertToSpecificType(result, (Class<T>) firstNum.getClass());
    }

    private <T extends Number> T convertToSpecificType(double value, Class<T> type) {
        if (type == Integer.class) {
            return type.cast((int) value);
        } else if (type == Double.class) {
            return type.cast(value);
        } else if (type == Float.class) {
            return type.cast((float) value);
        } else if (type == Long.class) {
            return type.cast((long) value);
        } else {
            throw new UnsupportedOperationException("Unsupported type: " + type.getName());
        }
    }

    public void removeResult() {
        if (!resultsArrayList.isEmpty()) {
            resultsArrayList.remove(0);
        } else {
            System.out.println("결과값 리스트가 비어 있습니다.");
        }
    }

    public List<Double> returnBigNumber(double inputNum, ArrayList<Double> resultArrayList) {
        return resultArrayList.stream()
                .filter(n -> n > inputNum)
                .collect(Collectors.toList());
    }
}
