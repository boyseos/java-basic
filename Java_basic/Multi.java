import java.util.Scanner;
class Multi{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numA , numB , numC = 0;
        String op = "";
        System.out.print("숫자 A를 입력하세요 : ");
        numA = scanner.nextInt();
        System.out.print("숫자 B를 입력하세요 : ");
        numB = scanner.nextInt();
        System.out.print("연산종류를 선택하세요 +, -, *, / = ");
        op = scanner.next();       
        if(op.equals("+")){// == equal연산자는 숫자에서만 사용한다.
            numC = numA + numB;
            System.out.print( String.format("%d %s %d = %d", numA , op, numB , numC));
        }
        else if(op.equals("-")){
            numC = numA - numB;
            System.out.print( String.format("%d %s %d = %d", numA , op, numB , numC));
        }
        else if(op.equals("*")){
            numC = numA * numB;
            System.out.print( String.format("%d %s %d = %d", numA , op, numB , numC));
        }
        else if(op.equals("/")){
            numC = numA / numB;
            System.out.print( String.format("%d %s %d = %d", numA , op, numB , numC));
        }
        else{
            System.out.println("사칙연산중에서 고르세요.");
        }
    }
}