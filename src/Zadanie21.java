import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytania: ");
        String nazwaPliku = input.nextLine();
        File mojPlik = new File(nazwaPliku);
        if (!mojPlik.exists()) {
            System.out.println(" Plik nie istnieje");
            System.exit(0);
        }
        Scanner fileScanner = new Scanner (mojPlik);
        String linia;

        linia = fileScanner.nextLine();

        System.out.println("Pierwsza linia pliku to: " + linia);

        String linia2 = fileScanner.nextLine();
        System.out.println("Druga lina pliku to: " + linia2);

        String linia3 = fileScanner.nextLine();
        System.out.println("Trzecia lina pliku to: " + linia3);

        String linia4 = fileScanner.nextLine();
        System.out.println("Czwarta lina pliku to: " + linia4);

        String linia5 = fileScanner.nextLine();
        System.out.println("Piąta lina pliku to: " + linia5);

        fileScanner.close();
    }

}
