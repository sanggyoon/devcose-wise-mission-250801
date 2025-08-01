package com.back;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String order = "";
        while (!order.equals("종료")){
            System.out.println("== 명언 ==");
            Scanner sc = new Scanner(System.in);

            System.out.print("명령) ");
            order = sc.nextLine();

            switch (order) {
                case "등록":
                    System.out.print("명언 : ");
                    String content = sc.nextLine();

                    System.out.print("작가 : ");
                    String author = sc.nextLine();
                    break;
                case "":
                    break;
            }

        }
    }
}
