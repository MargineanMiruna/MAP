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
        int[] ersteZahl = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zweiteZahl = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        ArrayZahlen az = new ArrayZahlen(ersteZahl, zweiteZahl);
        System.out.print("Summe: ");
        if(az.Summe()[0] != 0)
            System.out.print(az.Summe()[0]);
        for(int i = 1; i < az.Summe().length; i++)
            System.out.print(az.Summe()[i]);
        System.out.println();

        System.out.print("Differenz: ");
        for(int i = 0; i < az.Diff().length; i++)
            System.out.print(az.Diff()[i]);
    }
}