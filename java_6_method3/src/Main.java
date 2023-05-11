import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y,z;

        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.println("数字を３つ入力してください");

        x=scanner.nextInt();
        y=scanner.nextInt();
        z=scanner.nextInt();

        int result = big(x,y);
        result = big(result,z);

        System.out.println("一番大きい数字は"+result);

    }

    public static int big(int num1, int num2){
        if (num1<num2){
            return num2;
        }else {
            return num1;
        }
    }
}