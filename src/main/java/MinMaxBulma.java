import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = scanner.nextInt();


        System.out.println("1. sayıyı girin : ");
        int sayi = scanner.nextInt();
        int min = sayi;
        int max = sayi;


        for (int i = 2; i<=n;i++){ //Kaç tane sayı girdiğine bağlı olarak dönecek
            System.out.println(i + ". sayıyı giriniz");
            sayi = scanner.nextInt();

            if (sayi < min)  min = sayi;

            if (sayi > max)  max = sayi;

        }
        System.out.println("En küçük sayı : " + min);
        System.out.println("En büyük sayı : " + max);

        scanner.close();

    }
}
