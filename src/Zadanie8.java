import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wyniki trzech ostatnich testow: ");
        double test1 = input.nextDouble();
        double test2 = input.nextDouble();
        double test3 = input.nextDouble();

        double srednia = (test1 + test2 + test3) / 3;
        if (srednia < 60) {
            System.out.println("twoj wynik to: " + srednia + " ocena niedostateczna");
        } else if (srednia >= 60 && srednia <= 69) {
            System.out.println("twoj wynik to: " + srednia + " ocena dopuszczajaca");
        } else if (srednia >= 70 && srednia <= 79) {
            System.out.println("twoj wynik to: " + srednia + " ocena dostateczna");
        } else if (srednia >= 80 && srednia <= 89) {
            System.out.println("twoj wynik to: " + srednia + " ocena dobra");
        } else if (srednia >= 90 && srednia <= 100) {
            System.out.println("twoj wynik to: " + srednia + " ocena bardzo dobra");
        }
    }
}
