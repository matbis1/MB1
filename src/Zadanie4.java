import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wage w kilogramach: ");
        int waga = input.nextInt();
        System.out.println("Podaj wzrost w metrach");
        double wzrost = input.nextDouble();

        double BMI = waga/(wzrost*wzrost);
        System.out.println(BMI);

    }
}
