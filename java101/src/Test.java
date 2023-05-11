import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Değişkenler oluşturuldu, Koşulların sağlanması için minimum sayıya maksimum, maksimum sayıya ise minimum sayı atandı.
        int count = 0, number;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count += i;
            }
        }
        if (count == number) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}

