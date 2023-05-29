import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k, total = 1;

        System.out.print("Üssü Alınacak Sayı: ");
        n = input.nextInt();
        System.out.print("Üssü Olacak Sayı: ");
        k = input.nextInt();

/*
        int i = 1;
        while (i<=k) {
            total *= n;
            i++;
        }
        System.out.println("Üssünün Cevabı: " + total);
*/


        for (int i = 1; i<=k; i++){
            total *=n;
        }
        System.out.println("Üssünün Cevabı: " + total);
    }
}