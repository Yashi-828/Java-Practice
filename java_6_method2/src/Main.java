import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.println("1つ目の数字を入力してください");

        num1 = scanner.nextInt();

        System.out.println("2つ目の数字を入力してください");

        num2 = scanner.nextInt();

        int result = avg(num1,num2);

        System.out.println(result);


    }
    public static int avg(int num1,int num2){
        return (num1+num2)/2;
    }
}