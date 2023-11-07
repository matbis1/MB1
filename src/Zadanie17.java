import java.util.Scanner;
public class Zadanie17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "";
        String b = "";
        System.out.println("Podaj łańcuch znaków: ");
        a = input.nextLine();
        while ( b.length() !=1 )
        {
            System.out.println("Podaj jeden znak z ciągu znaków: ");
            b = input.next();
        }
        int licznik = 0;
        for ( int i = 0; i < a.length(); i++)
        {
            if (b.equals(a.charAt(i) +""))
                licznik++;
        }
        System.out.println("Liczba wystąpień znaku: " +licznik);
    }
}
