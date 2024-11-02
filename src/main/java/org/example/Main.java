package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1番目の数字を入力してください");
    double firstInputNumber = scanner.nextInt();

    System.out.println("演算子を入力してください(+, -, *, /)");
    String operator = scanner.next();

    System.out.println("2番目の数字を入力してください");
    double secondInputNumber = scanner.nextInt();

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