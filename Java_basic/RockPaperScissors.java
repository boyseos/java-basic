import java.util.Scanner;
class RockPaperScissors{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hand = 0;
        System.out.println("가위 바위 보..! \n1.가위 2.바위 3.보");
        hand = scanner.nextInt();

        //컴퓨터가 바위를 냈어요.
        if( hand == 1)
        {
            System.out.println("졌습니다.");
        }
        else if( hand == 2){
            System.out.println("비겼습니다.");
        }
        else if( hand == 3){
            System.out.println("이겼습니다.");
        }
        else{
            System.out.println("3개중에 하나만 내세요..");
        }
    }
}