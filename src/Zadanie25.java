import java.util.Scanner;

public class Zadanie25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int predkosc;
        System.out.println("Podaj predkosc: ");
        predkosc = input.nextInt();
        int czas;
        System.out.println("Podaj czas: ");
        czas = input.nextInt();

        for (int i=1; i<=czas; i++){
            int pokonane = predkosc*i;
            System.out.println(i + "." + pokonane);
        }
    }
}
