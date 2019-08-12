import java.util.Scanner;
import java.util.Random;
class Dice{/*
    컴퓨터가 던진 주사위가 홀인지 짝인지 사용자가 맞추는게임
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dice = 0;
        String com = "";
        dice = random.nextInt(6) + 1;
        if(dice % 2 == 0){
            com = "짝";
        }else{
            com = "홀";
        }
        //System.out.println(String.format("랜덤으로 나온 수는 %d이며 %s 입니다", dice, com));
        System.out.println("홀이나 짝을 선택하세요 : ");
        String num = scanner.next();
        if(num.equals(com)){
            System.out.println(String.format("컴퓨터의 주사위는 %d이고 %s입니다. 정답입니다.", dice, com));
        }else if(num.equals("짝") || num.equals("홀")){
            System.out.println(String.format("컴퓨터의 주사위는 %d이고 %s입니다. 틀렸습니다.", dice, com));
        }else{
            System.out.println("홀짝만 고르세요.");
        }
    }
}