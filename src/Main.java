public class Main {
    public static void main(String[] args) {

        //Aufgabe2
        int n = 5;
        double[] zahlen = {4, 8, 3, 10, 17};

        Zahlen z = new Zahlen(zahlen);

        System.out.println("Maximale Zahl: " + z.maxZahl());
        System.out.println("Minimale Zahl: " + z.minZahl());
        System.out.println("Maximale Summe von n-1 Zahlen: " + z.maxSumme());
        System.out.println("Minimale Summe von n-1 Zahlen: " + z.minSumme());

        //Aufgabe3
        int[] ersteZahl = {2, 5, 9, 9};
        int[] zweiteZahl = {1, 4, 0, 0};

        ArrayZahlen az = new ArrayZahlen(ersteZahl, zweiteZahl);

        System.out.println("Summe: " + az.toString(az.Summe()));
        System.out.println("Differenz: " + az.toString(az.Diff()));
        System.out.println("Multiplikation: " + az.toString(az.Mult(2)));
        System.out.println("Division: " + az.toString(az.Div(2)));
    }
}