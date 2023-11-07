import java.util.Scanner;

public class Zadanie24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liczba = 0;
        System.out.println("Podaj dodatnia liczbę różną od zera: ");
        int podana = input.nextInt();
        if (podana<0){
            System.out.println("Podałeś złą liczbę");
        }else {
            for (int i = 1; i<=podana; i++){
                liczba += i;
            }
        }
        System.out.println("Twój wynik to: " +liczba);
    }
}
