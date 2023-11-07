import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liczbaPieter;
        System.out.println("Podaj liczbę pięter: ");
        liczbaPieter = input.nextInt();
        if(liczbaPieter >= 1){
            for (int i  = 1; 1<= liczbaPieter; i++){
                double liczbaPokoi;
                System.out.println("Podaj liczbe pokoi: ");
                liczbaPokoi = input.nextDouble();
                double zajete;
                System.out.println("Podaj liczbe zajętych pokoi: ");
                zajete = input.nextDouble();
                if (liczbaPokoi >= 10){
                    double oblozenie = zajete / liczbaPokoi;
                    System.out.println(oblozenie);
                }else {
                    System.out.println("Błędne dane");
                    break;
                }
            }
        }else {
            System.out.println("Błędne dane");
        }
    }
}
