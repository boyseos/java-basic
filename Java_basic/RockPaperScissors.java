/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */
import java.util.Scanner;
import java.util.Random;

class RockPaperScissors{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String myHand = "";
        int comHand = random.nextInt(3);
        System.out.print("안내면 술래 가위, 바위, 보!   ");
        myHand = scan.next();
        if(myHand.equals("가위")){
            if(comHand == 0){
                System.out.println("컴퓨터는 가위를 내고 당신도 가위를 내셧습니다. 비겼음!");
            }else if(comHand == 1){
                System.out.println("컴퓨터는 바위를 내고 당신은 가위를 내셧습니다. 패배!");
            }else{
                System.out.println("컴퓨터는 보를 내고 당신은 가위를 내셧습니다. 승리!");
            }
        }else if(myHand.equals("바위")){
            if(comHand == 0){
                System.out.println("컴퓨터는 가위를 내고 당신은 바위를 내셧습니다. 승리!");
            }else if(comHand == 1){
                System.out.println("컴퓨터는 바위를 내고 당신은 바위를 내셧습니다. 비겼음!");
            }else{
                System.out.println("컴퓨터는 보를 내고 당신은 바위를 내셧습니다. 패배!");
            }
        }else{
            if(comHand == 0){
                System.out.println("컴퓨터는 가위를 내고 당신도 보를 내셧습니다. 패배!");
            }else if(comHand == 1){
                System.out.println("컴퓨터는 바위를 내고 당신은 보를 내셧습니다. 승리!");
            }else{
                System.out.println("컴퓨터는 보를 내고 당신은 보를 내셧습니다. 비겼음!");
            }
        }
     }
 }