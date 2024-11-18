package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("携帯電話番号を入力してください: ");
    String phoneNumber = scanner.next();
//    070/080/090/060から始まる
//    残りは8桁で合計11桁
//    ハイフンで3桁-4桁-4桁で区切る
    if (phoneNumber.matches("^(070|080|090|060)-\\d{4}-\\d{4}$")) {
      System.out.println(phoneNumber + "は有効な携帯電話番号です。");
    } else {
      System.out.println(phoneNumber + "は無効な携帯電話番号です。");
    }
  }
}