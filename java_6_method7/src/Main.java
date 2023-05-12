public class Main {
    public static void main(String[] args) {
        //ある数が素数かどうかを判定するメソッドを作成しなさい。
        //このメソッドを使用して 10000 以上 10100 未満の素数をすべて表示するプログラムを作成しなさい。
        for(int j =0 ;j<10100;j++)
            if (primNum(j)==true){
                System.out.println(j);
            }


    }

    public static boolean primNum(int num){
        if (num < 2) {
            /* 2未満の場合は素数でない */
            return false;
        }

        /* nが2〜n-1で割り切れるかどうかを確認 */
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                /* 2〜n-1で割り切れる場合はnは素数でない */
                return false;
            }
        }

        return true;
    }
}