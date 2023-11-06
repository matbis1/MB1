import java.util.Scanner;
public class Zadanie16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String litera;
        System.out.println("Wpisz jedną z tych liter: T, t, N, n");
        litera= input.nextLine();
        if(litera.equals("t") | litera.equals("t") | litera.equals("N") | litera.equals("n")){
            System.out.println("Podałeś dobrą literę");
        }else {
            System.out.println("Podałeś złą literę");
        }
    }
}
