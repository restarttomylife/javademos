public class Main {
    public static void main(String[] args) {

        int number = 13;

        int remainder = number % 2; // number mod 2
        System.out.println(remainder);

        boolean isPrime = true; //sayıyı önce asal kabul ediyoruz

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("Sayı asaldır!");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }
}