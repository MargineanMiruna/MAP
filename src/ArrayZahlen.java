public class ArrayZahlen {

    int[] ersteZahl, zweiteZahl;

    public ArrayZahlen(int[] ersteZahl, int[] zweiteZahl) {
        this.ersteZahl = ersteZahl;
        this.zweiteZahl = zweiteZahl;
    }

    public String toString(int[] zahl) {
        String arrayzahl = "[";
        int j = 0;
        while(zahl[j] == 0)
            j++;
        for(int i = j; i < zahl.length; i++)
            arrayzahl = arrayzahl + zahl[i] + " ";
        arrayzahl += "]";
        return arrayzahl;

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
        int[] grossereZahl, kleinereZahl;
        int j = 0;

        while(ersteZahl[j] == zweiteZahl[j])
            j++;
        if(ersteZahl[j] < zweiteZahl[j]) {
            kleinereZahl = ersteZahl;
            grossereZahl = zweiteZahl;
        }
        else {
            kleinereZahl = zweiteZahl;
            grossereZahl = ersteZahl;
        }

        int[] diff = new int[grossereZahl.length];
        int flag = 0;

        for(int i = grossereZahl.length - 1; i >= 0; i--) {
            if(grossereZahl[i] < kleinereZahl[i] + flag) {
                diff[i] = grossereZahl[i] + 10 - kleinereZahl[i] - flag;
                flag = 1;
            }
            else {
                diff[i] = grossereZahl[i] - kleinereZahl[i] - flag;
                flag = 0;
            }
        }

        return diff;
    }

    public int[] Mult(int ziffer) {
        int[] mult = new int[ersteZahl.length + 1];
        int flag = 0;

        for(int i = ersteZahl.length; i > 0; i--) {
            mult[i] = (ersteZahl[i - 1] * ziffer + flag) % 10;
            flag = (ersteZahl[i - 1] * ziffer + flag) / 10;
        }

        if(flag != 0) {
            mult[0] = flag;
        }

        return mult;
    }

    public int[] Div(int ziffer) {
        int[] div = new int[ersteZahl.length];
        int flag = 0;

        for(int i = 0; i < ersteZahl.length; i++) {
            div[i] = (flag  * 10 + ersteZahl[i]) / ziffer;
            flag = (flag  * 10 + ersteZahl[i]) % ziffer;
        }

        return div;
    }
}
