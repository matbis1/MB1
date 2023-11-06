import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Proszę podać imię, drugie imię i nazwisko: ");
        String firstName = input.nextLine();
        String middleName = input.nextLine();
        String lastName = input.nextLine();
        System.out.println(firstName + middleName + lastName);


    }
}
