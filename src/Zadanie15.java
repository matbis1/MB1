import java.util.Scanner;
public class Zadanie15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wartosc;
        System.out.println("Wypisz tak lub nie");
        wartosc = input.nextLine();
        if(wartosc.equals("tak") | wartosc.equals("nie")){
            System.out.println("Wpisałeś poprawną wartość");
        }else {
            System.out.println("Wpisałeś złą wartość");
        }
    }
}
