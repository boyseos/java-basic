import java.util.Scanner;
class WhatName{
    public static void main(String[] args){
        System.out.println("이름이 뭐니");
        String name = "xxx"; //변수선언

        //값을 입력받는 지점
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println(String.format("나는 %s라고 한다....!!!", name));
        System.out.println("어르신 연세가...");
        int age = 0;
        age = scanner.nextInt();
        System.out.print(String.format("나는 %d살이야....!!", age));
    }
}