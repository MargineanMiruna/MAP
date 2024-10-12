import java.util.Arrays;

public class ArrayZahlen {

    int[] ersteZahl, zweiteZahl;

    public ArrayZahlen(int[] ersteZahl, int[] zweiteZahl) {
        this.ersteZahl = ersteZahl;
        this.zweiteZahl = zweiteZahl;
    }

    public int[] Summe() {
        int[] summe = new int[ersteZahl.length + 1];
        int flag = 0;

        for(int i = ersteZahl.length; i > 0; i--) {
            summe[i] = (ersteZahl[i - 1] + zweiteZahl[i - 1] + flag) % 10;
            flag = (ersteZahl[i - 1] + zweiteZahl[i - 1] + flag) / 10;
        }

        if(flag != 0)
            summe[0] = flag;

        return summe;
    }

    public int[] Diff() {
        if(ersteZahl[0] < zweiteZahl[0]) {
            int[] aux = ersteZahl;
            ersteZahl = zweiteZahl;
            zweiteZahl = aux;
        }

        int[] diff = new int[ersteZahl.length];
        int flag = 0;

        for(int i = ersteZahl.length - 1; i >= 0; i--) {
            if(ersteZahl[i] < zweiteZahl[i] + flag) {
                diff[i] = ersteZahl[i] + 10 - zweiteZahl[i] - flag;
                flag++;
            }
            else {
                diff[i] = ersteZahl[i] - zweiteZahl[i] - flag;
                flag = 0;
            }
        }

        return diff;
    }

}
