package com.sparta.calculator3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 제네릭 타입을 Double로 고정
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();
        ArrayList<Double> resultArrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double firstNum = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double secondNum = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operatorChar = sc.next().charAt(0);

            // 사칙연산 기호 유효성 검증
            while (operatorChar != '+' && operatorChar != '-' && operatorChar != '*' && operatorChar != '/') {
                System.out.println("유효한 사칙연산 기호를 입력하세요: ");
                operatorChar = sc.next().charAt(0);
            }

            // 연산자 매핑
            OperatorType operator = mapOperator(operatorChar);

            if (operator == OperatorType.DIVIDE && secondNum == 0) {
                System.out.println("나눗셈 연산에서 분모(두 번째 숫자)에 0이 입력될 수 없습니다.");
            } else {
                Double calculate = calculator.calculate(operator, firstNum, secondNum);
                System.out.println("결과: " + calculate);
                resultArrayList.add(calculate);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String isEnd = sc.next();
            if (isEnd.equals("exit")) {
                break;
            }
        }

        calculator.setResultsArrayList(resultArrayList);

        System.out.println("결과값 모음 반환");
        System.out.println(calculator.getResultsArrayList());

        System.out.println("결과값을 하나 삭제하시겠습니까? (yes / no)");
        String isRemove = sc.next();
        if (isRemove.equals("yes")) {
            calculator.removeResult();
            System.out.println("결과값 하나 삭제 후 결과값 모음 반환");
            System.out.println(calculator.getResultsArrayList());
        }

        System.out.println("숫자를 하나 입력하세요.");
        double inputNum = sc.nextDouble();
        System.out.println("해당 숫자보다 큰 결과값 모음:");
        System.out.println(calculator.returnBigNumber(inputNum, resultArrayList));

        System.out.println("계산기를 종료합니다.");
    }

    private static OperatorType mapOperator(char operatorChar) {
        switch (operatorChar) {
            case '+':
                return OperatorType.ADD;
            case '-':
                return OperatorType.SUBSTRACT;
            case '*':
                return OperatorType.MULTIPLY;
            case '/':
                return OperatorType.DIVIDE;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operatorChar);
        }
    }
}
