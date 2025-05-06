package s1d2;

import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una frase o una parola, digita :p per uscire");

        String a;

        while (true) {
            a = scanner.nextLine();

            if (a.equals(":p")) {
                System.out.println("Fine");
                break;
            }

            StringBuilder risultato = new StringBuilder();

            for (int i = 0; i < a.length(); i++) {
                risultato.append(a.charAt(i));
                if (i < a.length() - 1) {
                    risultato.append(", ");
                }
            }

            System.out.println("Separati da una virgola: " + risultato.toString());
        }

        scanner.close();
    }
}

