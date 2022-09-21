public class Main {
    public static void main(String[] args) {


        for(int i=2; i<10 ; i=i+2 ){
            System.out.println(i);
        }
            System.out.println("döngü bitti");

        int i=1;
        while(i<10) {
            System.out.println(i);
            i+=2;
        }

        System.out.println("while döngüsü the end");

        int j=100;
        do{
            System.out.println(j +"loglandı");
            j-=2;
        }while(j>10);

        System.out.println("do while döngüsü bitti");
    }
}