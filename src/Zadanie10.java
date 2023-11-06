import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ponownie;
        System.out.println("Czy wykonać operację ponownie?");
        ponownie = input.nextLine();
        do {
        if(ponownie.equals("tak")){
            int liczba1;
            System.out.println("Podaj liczbe: ");
            liczba1 = input.nextInt();
            int liczba2;
            System.out.println("Podaj liczbe: ");
            liczba2 = input.nextInt();
            int liczba3;
            System.out.println("Podaj liczbe: ");
            liczba3 = input.nextInt();
            int dodawanie = liczba1 + liczba2 + liczba3;
            System.out.println("Wynik to " +dodawanie);
            ponownie = input.next();
        }else {break;}

    }while (ponownie.equals("tak"));
}
}
