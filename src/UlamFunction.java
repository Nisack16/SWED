public class UlamFunction {

    public static void main(String[] args) {
        final int LIMIT = 1_000_000;
        for (int n = 1; n < LIMIT; n++) {
            if (!endsWithOne(n)) {
                System.out.println("Die Folge für " + n + " endet NICHT bei 1!");
                return;
            }
        }
        System.out.println("Für alle Zahlen < 1.000.000 endet die Ulam-Funktion bei 1.");
    }
/** Methode berechnet die Collatz -Folge für eine gegebene Zahl n **/
    public static boolean endsWithOne(long n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return true;
    }
}

