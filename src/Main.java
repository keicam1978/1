import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println();
        System.out.print("Do ilu szukać? : ");

        Scanner odczyt = new Scanner(System.in);
        long ile = odczyt.nextLong();
        System.out.println(1);

        for (long liczba=2;liczba<=ile;liczba++ ) {
            boolean pierwsza = true;
            for (long i = 2; i < liczba; i++)
                if (liczba%i == 0) {
                    pierwsza = false;
                    i = liczba-1;
                }
            if (pierwsza) System.out.print(" " + liczba);
        }


    }
}
