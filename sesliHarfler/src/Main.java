public class Main {
    public static void main(String[] args) {

        char harf='U';

        switch (harf){

            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalın sesli");
                break;
            default:
                System.out.println("ince sesli");
        }
    }
}