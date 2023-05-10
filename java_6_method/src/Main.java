import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;

        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.println("数字を入力してください");

        num = scanner.nextInt();

        int result = square(num);

        System.out.println(result);
    }

    public static int square(int num){
        return num*num;
    }
}