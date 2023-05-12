public class Main {
    public static void main(String[] args) {
        //サイズを示す数値と、表示する文字を引数とし、三角形を表示するメソッドを作成しなさい。
        //このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
        //※ 	サイズを示す引数は int 型、表示する文字の引数は char 型にする。
        tria(4,'A');
        System.out.println();
        tria(5,'@');
        System.out.println();
        tria(6,'&');


    }
    public static void tria(int num,char c) {
        for ( int i=0 ; i<num ; i++ ){

            for (int j=0; j<=i ; j++ ){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}