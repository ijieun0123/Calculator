package com.sparta.calculator2;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> resultsArrayList;

    public ArrayList<Integer> getResultsArrayList() {
        return resultsArrayList;
    }

    public void setResultsArrayList(ArrayList<Integer> resultsArrayList) {
        this.resultsArrayList = resultsArrayList;
    }

    public int calculate(char operator, int firstNum, int secondNum){
        int result = 0;
        if(operator == '+') {
            result = firstNum + secondNum;
        } else if(operator == '-'){
            result = firstNum - secondNum;
        } else if(operator == '*'){
            result = firstNum * secondNum;
        } else if(operator == '/'){
            result = firstNum / secondNum;
        }
        return result;
    }

    public void removeResult(){
        resultsArrayList.remove(0);
    }
}
