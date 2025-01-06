package com.sparta.calculator1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
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

            int result = 0;
            switch(operator){
                case '+' :
                    result = firstNum + secondNum;
                    System.out.println("결과 : " + result);
                    break;
                case '-' :
                    result = firstNum - secondNum;
                    System.out.println("결과 : " + result);
                    break;
                case '*' :
                    result = firstNum * secondNum;
                    System.out.println("결과 : " + result);
                    break;
                case '/' :
                    if(secondNum == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        result = firstNum / secondNum;
                        System.out.println("결과 : " + result);
                    }
                    break;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String isEnd = sc.next();
            if(isEnd.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}
