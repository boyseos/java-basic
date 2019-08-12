import java.util.Scanner;
class Multi{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numA = 0;
        int numB = 0;
        
        System.out.print("숫자 A를 입력하세요 : ");
        numA = scanner.nextInt();
        System.out.print("숫자 B를 입력하세요 : ");
        numB = scanner.nextInt();
        int numC = numA * numB;
        System.out.print( String.format("%d + %d = %d", numA , numB , numC));
    }
}