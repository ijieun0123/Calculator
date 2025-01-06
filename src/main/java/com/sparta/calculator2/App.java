package com.sparta.calculator2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ArrayList<Integer> resultArrayList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            while (firstNum < 0){
                System.out.println("0 이나 양수를 입력하세요 !");
                firstNum = sc.nextInt();
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();
            while (secondNum < 0){
                System.out.println("0 이나 양수를 입력하세요 !");
                secondNum = sc.nextInt();
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            while(operator != '-' && operator != '+' && operator != '*' && operator != '/'){
                System.out.println("사칙연산 기호를 입력하세요: ");
                operator = sc.next().charAt(0);
            }

            // 요구사항에 맞게 소스 코드 수정
            if(operator == '/' && secondNum == 0){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else{
                int calculate = calculator.calculate(operator, firstNum, secondNum);
                System.out.println(calculate);
                resultArrayList.add(calculate);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String isEnd = sc.next();
            if(isEnd.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }


        calculator.setResultsArrayList(resultArrayList);

        System.out.println("결과값 모음 반환");
        System.out.println(calculator.getResultsArrayList());

        System.out.println("결과값을 하나 삭제하시겠습니까 ? ( yes / no )");
        String isRemove = sc.next();
        if(isRemove.equals("yes")){
            calculator.removeResult();
            System.out.println("결과값 하나 삭제 후 결과값 모음 반환");
            System.out.println(calculator.getResultsArrayList());
        }
    }
}
