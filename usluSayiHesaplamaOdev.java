import java.util.Scanner;

public class usluSayiHesaplamaOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, n;
        System.out.print("üssü alınacak sayı :");
        n = input.nextInt();
        System.out.print("üs olacak sayı :");
        k = input.nextInt();


        int total = 1;
        for (int i = 1; i <= k; i++) {


            total *= n;


        }
        System.out.println(total);
    }
}
