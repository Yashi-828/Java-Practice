public class Main {
    public static void main(String[] args) {

        tria(3);
        System.out.println();
        tria(4);
        System.out.println();
        tria(5);
        System.out.println();
        tria(10);

    }

    public static void tria(int num){
        for ( int i=0 ; i<num ; i++ ){

            for (int j=0; j<=i ; j++ ){
           System.out.print("*");
            }
            System.out.println();
        }
    }
}