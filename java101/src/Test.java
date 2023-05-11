import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

       
        int count = 0, number;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        number = input.nextInt();
        
        // Döngüde eğer girilen sayının çarpanı bulunursa count değişkenine ekleniyor.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count += i;
            }
        }
        
        // Eğer count toplamı sayının kendisine eşitse çıktı mükemmel sayıdır oluyor.
        if (count == number) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}

