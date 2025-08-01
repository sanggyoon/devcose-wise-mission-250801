package com.back;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = "";
        int idx = 0;
        WiseSaying[] ws = new WiseSaying[100];

        System.out.println("== 명언 ==");
        while (!order.equals("종료")){
            System.out.print("명령) ");
            order = sc.nextLine();
            switch (order) {
                case "등록":
                    System.out.print("명언 : ");
                    String content = sc.nextLine();
                    ws[idx].content = content;

                    System.out.print("작가 : ");
                    String author = sc.nextLine();
                    ws[idx].author = author;

                    System.out.printf("%d번 명언이 등록되었습니다.", idx+1);
                    idx++;
                    break;
                case "목록":
                    break;
            }

        }
    }
}

class WiseSaying {
    String content;
    String author;
}