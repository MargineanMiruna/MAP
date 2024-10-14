import java.util.Arrays;

public class ElektronikShop {

    double[] tastatur;
    double[] usb;

    public ElektronikShop(double[] tastatur, double[] usb) {
        this.tastatur = tastatur;
        this.usb = usb;
    }

    double teuersteTastatur() {
        double max = tastatur[0];

        for (int i = 1; i < tastatur.length; i++)
            if (tastatur[i] > max)
                max = tastatur[i];

        return max;
    }

    double teuerstesUSB() {
        double max = usb[0];

        for (int i = 1; i < usb.length; i++)
            if (usb[i] > max)
                max = usb[i];

        return max;
    }

    public double billigsteTastatur() {
        double min = tastatur[0];

        for (int i = 1; i < tastatur.length; i++)
            if (tastatur[i] < min)
                min = tastatur[i];

        return min;
    }

    public double teuerstenGegenstand() {
        double max = usb[0];

        for (int i = 1; i < usb.length; i++)
            if (usb[i] > max)
                max = usb[i];

        for (int i = 0; i < tastatur.length; i++)
            if (tastatur[i] > max)
                max = tastatur[i];

        return max;
    }

    public double teuerstesUSB(double budget) {
        double max = 0;

        for (int i = 0; i < usb.length; i++)
            if (usb[i] > max && budget > usb[i])
                max = usb[i];

        return max;
    }

    public double maxGeldbetrag(double budget) {
        double sum = 0;
        double[] tast = Arrays.stream(tastatur).sorted().toArray();
        double[] usb1 = Arrays.stream(usb).sorted().toArray();

        int i = tast.length - 1, j = usb1.length - 1;

        while(tast[i] > budget) i--;
        while(usb1[j] > budget) j--;

        while(i >= 0) {
            int auxj = j;
            while(auxj >= 0) {
                if (tast[i] + usb1[auxj] > budget)
                    auxj--;
                else return tast[i] + usb1[auxj];
            }
            i--;
        }

        return -1;


    }
}
