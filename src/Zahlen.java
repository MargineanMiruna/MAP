public class Zahlen {

    public double[] zahlen;

    public Zahlen(double[] zahlen) {
        this.zahlen = zahlen;
    }

    public double maxZahl() {
        double max = zahlen[0];

        for(int i = 1; i < zahlen.length; i++)
            if(max < zahlen[i])
                max = zahlen[i];

        return max;
    }

    public double minZahl() {
        double min = zahlen[0];

        for(int i = 1; i < zahlen.length; i++)
            if(min > zahlen[i])
                min = zahlen[i];

        return min;
    }

    public double maxSumme() {
        double min = minZahl();
        double sum = 0;

        for(int i = 0; i < zahlen.length; i++)
            if(min != zahlen[i])
                sum += zahlen[i];

        return sum;
    }

    public double minSumme() {
        double max = maxZahl();
        double sum = 0;

        for (int i = 0; i < zahlen.length; i++)
            if (max != zahlen[i])
                sum += zahlen[i];

        return sum;
    }
}
