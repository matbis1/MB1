import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Zadanie20 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytania: ");
        String nazwaPliku = input.nextLine();
        File mojPlik = new File(nazwaPliku);
        if (!mojPlik.exists()) {
            System.out.println(" Plik nie istnieje");
            System.exit(0);
        }
        Scanner czytelnikPlik = new Scanner(mojPlik);
        String linia = czytelnikPlik.nextLine();
        while (czytelnikPlik.hasNext()) {
            linia =  czytelnikPlik.nextLine();
            System.out.println("Kolejna linia pliku to " + linia);
        }
        czytelnikPlik.close();
        String b = "";
        while ( b.length() !=1 )
        {
            System.out.println("Podaj jeden znak z ciągu znaków: ");
            b = input.next();
        }
        int licznik = 0;
        for ( int i = 0; i < linia.length(); i++)
        {
            if (b.equals(linia.charAt(i) +""))
                licznik++;
        }
        System.out.println("Liczba wystąpień znaku: " +licznik);

    }

}