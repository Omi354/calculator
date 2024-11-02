package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double firstInputNumber = 0;

    // 1番目の数を設定する
    for (; ; ) {
      try {
        System.out.println("1番目の数字を入力してください");
        firstInputNumber = scanner.nextDouble();
        break;
      } catch (InputMismatchException e) {
        e.printStackTrace();
        System.out.println("数字のみ入力可能です");
        scanner.next();
      }
    }

    // 演算子を設定する
    String operator = "";

    for (; ; ) {
      System.out.println("演算子を入力してください(+, -, *, /)");
      operator = scanner.next();
      if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals(
          "/")) {
        break;
      } else {
        System.out.println("+, -, *, /のみ入力可能です");
      }
    }

    // 2番目の数を設定する

    double secondInputNumber = 0;
    for (; ; ) {
      try {
        System.out.println("2番目の数字を入力してください");
        secondInputNumber = scanner.nextDouble();
        break;
      } catch (InputMismatchException e) {
        e.printStackTrace();
        System.out.println("数字のみ入力可能です");
        scanner.next();
      }
    }

    // 計算ロジック
    double result = 0;

    if (operator.equals("+")) {
      result = firstInputNumber + secondInputNumber;
    } else if (operator.equals("-")) {
      result = firstInputNumber - secondInputNumber;
    } else if (operator.equals("*")) {
      result = firstInputNumber * secondInputNumber;
    } else if (operator.equals("/")) {
      result = firstInputNumber / secondInputNumber;
    }

    System.out.println(result);

  }
}