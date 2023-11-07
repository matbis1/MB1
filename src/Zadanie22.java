import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj początkową liczbę organizów: ");
        int organizmy = input.nextInt();
        System.out.println("Podaj średni dzienny przyrost populacji (w %): ");
        double procent = input.nextDouble();
        System.out.println("Podaj liczbę dni, przez jakie organizmy się rozmnażają: ");
        int dni = input.nextInt();
        int i = 1;
        double procenty = procent /100;


        if (organizmy>=2 && procent>=0 && dni>=1 ){
            do {
                double ostatnia;
                ostatnia = procenty * organizmy;
                organizmy += ostatnia;
                double koniec = Math.round(ostatnia);
                System.out.println("Dzień " + i + " populacja " + koniec);
                i++;
            }while (i<=dni);
        }else {
            System.out.println("Podano błędne dane");
        }
    }
}
