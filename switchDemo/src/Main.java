public class Main {
    public static void main(String[] args) {

        char grade = 'T';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtin");
                break;
            case 'B':
                System.out.println("Çook Güzel : Geçtin");
                break;
            case 'C':
                System.out.println("Güzel : Geçtin");
                break;
            case 'D':
                System.out.println("Eh : Geçtin");
                break;
            case 'F':
                System.out.println("Kaldınız ");
                break;

            default:
                System.out.println("Geçersiz not");

        }

    }
}