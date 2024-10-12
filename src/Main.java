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

    }
}