import java.util.Scanner;

class Add{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numA = 0;
        int numB = 0;
        System.out.print("A는 몇입니까?");
        numA = scan.nextInt();
        System.out.print("B는 몇입니까?");
        numB = scan.nextInt();
        int numC = numA + numB;
        System.out.println("A + B = "+ numC);
    }
}