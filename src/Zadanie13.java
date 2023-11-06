import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe dodatnia nie wieksza niz 15: ");
        int liczba = input.nextInt();

        if (liczba >= 1 && liczba <= 15) {
            for (int i = liczba; i > 1; i--){
                for (int j=1; j<=i; j++)
                System.out.print("X");
                System.out.println();
            }
        } else {
            System.out.println("Podałeś złą liczbę!!!");
        }
    }
}
