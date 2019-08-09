import java.util.Scanner;
class WhatName{
    public static void main(String[] args){
        System.out.println("이름이 뭐니");
        String name = "xxx"; //변수선언

        //값을 입력받는 지점
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.print("나는 " + name +"라고 해...!!!\n");
        System.out.println("어르신 연세가...");
        int age = 0;
        age = scanner.nextInt();
        System.out.print("나이는 "+ age + "라구..");
    }
}