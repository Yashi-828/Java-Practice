public class Main {
    public static void main(String[] args) {
        //九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
        //このメソッドを使用して、九九表を作成しなさい。
        for (int j =1; j < 10 ;j++){
            multi(j);
        }
    }

    public static void multi(int num){
        for(int i = 1; i<10 ;i++){
            System.out.print( num + "*" + i + "=" +(num*i)+" ");
        }
        System.out.println();
    }

}