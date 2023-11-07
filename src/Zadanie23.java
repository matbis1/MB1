import java.util.Random;
import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int saldo = 0;
        do {
            System.out.println("Podaj kwotę wejściową: ");
            int kwota = input.nextInt();
            if (kwota<=0){
                System.out.println("Podaj kwotę większą od zera");
                continue;
            }
            String[] pola = {"wiśnie", "pomarańcze", "śliwki", "dzwonki", "melony", "bary"};
            String[] wylosowane = new String[3];
            for (int i=0; i<3; i++){
                int randomowe = random.nextInt(pola.length);
                wylosowane[i] = pola[randomowe];
                System.out.println(wylosowane[i] + " ");
            }
            System.out.println();
            if (wylosowane[0].equals(wylosowane[1]) && wylosowane[1].equals(wylosowane[2])){
                int wygrana = kwota*3;
                saldo += wygrana;
                System.out.println("Gratulacje wygrałeś " + wygrana + " złotych");
            }else {
                System.out.println("Niestety przegrałeś");
            }
            System.out.println("Obecnie masz " + saldo + " złotych");
            System.out.println("Grasz ponownie?");
            String ponownie = input.next();
            if (ponownie.equalsIgnoreCase("nie")){
                break;
            }
        }while(true);
        System.out.println("Dziękujemy za twoją grę twoje saldo wynosi: " + saldo + " złotych");
    }
}
