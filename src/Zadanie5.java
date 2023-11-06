import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe sekund: ");
         int sekundy;
         sekundy = input.nextInt();
         if(sekundy<60){
             System.out.println(sekundy+ " sekund");
         } else if (sekundy>=60 && sekundy<3600) {
             int minuty = sekundy/60;
             System.out.println(sekundy +"sekund to "+minuty +" minut");
         } else if (sekundy>=3600 && sekundy<86400) {
             int godziny = sekundy/3600;
             System.out.println(sekundy + "sekund to "+ godziny +" godzin");
         } else if (sekundy>=86400) {
             int dni = sekundy/86400;
             System.out.println(sekundy + "sekund to "+ dni +" dni");
         }

    }
}
