package s1d2;
import java.util.Scanner;
public class es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola");
        String a = scanner.nextLine();

        if (a.length() % 2 == 0) {
            System.out.println("la lunghezza è pari");
        } else {
            System.out.println("la lunghezza è dispari");
        }
        System.out.println("inserisci un anno");
        int b = scanner.nextInt();
        if ((b % 4 == 0 && b % 100 != 0) || (b % 400 == 0)) {
            System.out.println("anno bisestile");
        } else {
            System.out.println("anno non bisestile");

        }
    }
}
