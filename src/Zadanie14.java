import java.util.Scanner;
public class Zadanie14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;
        for(int i = 1; i<=7; i++){
            System.out.println("Podaj liczbe: ");
            int liczba;
            liczba = input.nextInt();
            suma += liczba;
        }
        System.out.println("suma wprowadzonych wartości to: " + suma);

    }
}
