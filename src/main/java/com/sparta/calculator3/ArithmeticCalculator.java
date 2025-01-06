package com.sparta.calculator3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator <T extends Number>{
    private ArrayList<T> resultsArrayList = new ArrayList<>();

    public ArrayList<T> getResultsArrayList() {
        return resultsArrayList;
    }

    public void setResultsArrayList(ArrayList<T> resultsArrayList) {
        this.resultsArrayList = resultsArrayList;
    }

    public Number calculate(char operator, T firstNum, T secondNum){
        double result = 0;
        if(operator == OperatorType.ADD.getOperator()) {
            result = firstNum.doubleValue() + secondNum.doubleValue();
        } else if(operator == OperatorType.SUBSTRACT.getOperator()){
            result = firstNum.doubleValue() - secondNum.doubleValue();
        } else if(operator == OperatorType.MULTIPLY.getOperator()){
            result = firstNum.doubleValue() * secondNum.doubleValue();
        } else if(operator == OperatorType.DIVIDE.getOperator()){
            if (secondNum.doubleValue() == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            result = firstNum.doubleValue() / secondNum.doubleValue();
        }
        return result;
    }

    public void removeResult(){
        if (!resultsArrayList.isEmpty()) {
            resultsArrayList.remove(0);
        } else {
            System.out.println("결과값 리스트가 비어 있습니다.");
        }
    }

    public List<Double> returnBigNumber(double inputNum, ArrayList<Number> resultArrayList){
        List<Double> filterList = resultArrayList.stream()
                .filter(n -> n.doubleValue() > inputNum)  // doubleValue()로 변환하여 비교
                .map(n -> n.doubleValue())  // 결과를 Double로 변환
                .collect(Collectors.toList());

        return filterList;
    }
}
