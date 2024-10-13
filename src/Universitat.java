import java.text.DecimalFormat;

public class Universitat {

    public String toString(int[] noten) {
        String str = "[";
        int j = 0;

        while(j < noten.length && noten[j] != 0 ) {
            str = str + noten[j] + " ";
            j++;
        }
        str += "]";

        return str;
    }

    public String toString(double nr) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(nr);
    }

    boolean istAusreichend(int note) {
        return note >= 40;
    }

    int aufrunden(int note) {
        int dif, aux;

        if(note < 38)
            return note;
        else {
            dif = 0;
            aux = note;
            while(aux % 5 != 0) {
                dif++;
                aux++;
            }

            if(dif < 3)
                return aux;
            else
                return note;
        }
    }

    public int[] nichtAusreichend(int[] noten) {
        int[] nichtAusreichend = new int[noten.length];

        for(int i = 0; i < noten.length; i++)
           if(!istAusreichend(noten[i]))
               nichtAusreichend[i] = noten[i];

        return nichtAusreichend;
    }

    public double durchschnittswert(int[] noten) {
        double ds = 0;

        for(int i = 0; i < noten.length; i++)
            ds += noten[i];
        ds /= noten.length;

        return ds;
    }

    public int[] aufgerundeteNoten(int[] noten) {
        int[] aufgerundeteNoten = new int[noten.length];

        for(int i = 0; i < noten.length; i++)
            aufgerundeteNoten[i] = aufrunden(noten[i]);

        return aufgerundeteNoten;
    }

    public int maxAufgerundeteNoten(int[] noten) {
        int max = this.aufgerundeteNoten(noten)[0];

        for (int i = 1; i < aufgerundeteNoten(noten).length; i++) {
            if(max < aufgerundeteNoten(noten)[i])
                max = aufgerundeteNoten(noten)[i];
        }

        return max;
    }

}
