import java.util.Scanner;
public class Zadanie12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartość sprzedaży dla sklepu nr1: ");
        int sklep1 = input.nextInt();
        System.out.println("Podaj wartość sprzedaży dla sklepu nr2: ");
        int sklep2 = input.nextInt();
        System.out.println("Podaj wartość sprzedaży dla sklepu nr3: ");
        int sklep3 = input.nextInt();
        System.out.println("Podaj wartość sprzedaży dla sklepu nr4: ");
        int sklep4 = input.nextInt();
        System.out.println("Podaj wartość sprzedaży dla sklepu nr5: ");
        int sklep5 = input.nextInt();

        int gwiazdka = 100;
        int iloscGwiazdekSklepu1 = sklep1/gwiazdka;
        int iloscGwiazdekSklepu2 = sklep2/gwiazdka;
        int iloscGwiazdekSklepu3 = sklep3/gwiazdka;
        int iloscGwiazdekSklepu4 = sklep4/gwiazdka;
        int iloscGwiazdekSklepu5 = sklep5/gwiazdka;
        System.out.print("Sklep nr 1: ");
        for (int i=iloscGwiazdekSklepu1; i>=1; i--){
                System.out.print("*");
        }
        System.out.println();
        System.out.print("Sklep nr 2: ");
        for (int i=iloscGwiazdekSklepu2; i>=1; i--){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Sklep nr 3: ");
        for (int i=iloscGwiazdekSklepu3; i>=1; i--){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Sklep nr 4: ");
        for (int i=iloscGwiazdekSklepu4; i>=1; i--){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Sklep nr 5: ");
        for (int i=iloscGwiazdekSklepu5; i>=1; i--){
            System.out.print("*");
        }

    }
}
