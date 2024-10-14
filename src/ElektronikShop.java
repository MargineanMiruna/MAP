public class ElektronikShop {

    double[] tastatur;
    double[] usb;

    public ElektronikShop(double[] tastatur, double[] usb) {
        this.tastatur = tastatur;
        this.usb = usb;
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
}
