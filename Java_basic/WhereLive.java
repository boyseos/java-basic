import java.util.Scanner;

class WhereLive{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String spot = "";
        System.out.println("어디에 살고있나요.");
        spot = scanner.nextLine();
        System.out.print(spot + "에 살고있습니다.");
    }
}