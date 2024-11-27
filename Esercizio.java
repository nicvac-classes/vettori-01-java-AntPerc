package Esercizio;
import java.util.Scanner;
class Esercizio {
    public static void main(String args[]) {
        Scanner in = new Scanner( System.in );
        String[] v = new String[5];
        v[0] = "Matt";
        v[1] = "Chris";
        v[2] = "Dom";
        v[3] = "Adele";
        v[4] = "Celine";
        String[] w = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il nome di un cantante: ");
            w[i] = scanner.nextLine();
        }
        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = i + 1;
        }
        int[] y = new int[10];
        for (int i = 0; i < 10; i++) {
            y[i] = (i + 1) * 2;
        }
        System.out.println("Visualizzare solo 3 elementi del vettore V: " + v[0] + " " + v[2] + " " + v[4]);
        // - Visualizzare tutti gli elementi dei vettori V, W, X, Y usando i cicli.
        System.out.println("Visualizzare tutti gli elementi dei vettori V, W, X, Y");
        System.out.print("V: ");
        for (String name : v) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.print("W: ");
        for (String name : w) {
        System.out.print(name + " ");
        }
        System.out.println();
        System.out.print("X: ");
        for (int num : x) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Y: ");
        for (int num : y) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("X, solo indici pari: ");
        for (int i = 0; i < x.length; i += 2) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.print("X, solo indici dispari: ");
        for (int i = 1; i < x.length; i += 2) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.print("X, solo valori pari: ");
        for (int num : x) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}