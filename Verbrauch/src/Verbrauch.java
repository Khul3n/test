import java.text.DecimalFormat;
import java.util.Scanner;

public class Verbrauch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Wie viel Liter wurde getankt: ");
        double n = reader.nextDouble();
        System.out.println("Wie viel KM wurde zurückgelegt: ");
        double m = reader.nextDouble();
        System.out.println("Wie viel kostet ein Liter Sprit: ");
        double k = reader.nextDouble();
        System.out.println("wie viel km möchten sie fahren: ");
        int w = reader.nextInt();
        System.out.println("Wie groß ist der Tank von dem Auto: ");
        int g = reader.nextInt();
        reader.close();

        verbrauchRechnen(n, m, k, w, g);
            }
    public static double verbrauchRechnen(double n, double m, double k, int w, double g){


        double verbrauch = n *100 / m;
        double kosten = n*k;
        double liter = w / 100 * verbrauch;
        double strecke = liter * k;
        double tanken = w / 100 * verbrauch;
        double tankens = tanken / g;
        double whtanken= tankens + 1;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String erste = decimalFormat.format(verbrauch);
        String zweite = decimalFormat.format(kosten);
        String dritte = decimalFormat.format(tanken);
        String vierte = decimalFormat.format(strecke);
        String sechste = decimalFormat.format(whtanken);

        System.out.println("Ihrer Verbrauch ist : " + erste + " Liter");
        System.out.println("Tanken hat " + zweite + " € gekostet");
        System.out.println("Sie muessen " + dritte + " Liter tanken damit Sie " + w + "km fahren koennen");
        System.out.println("Die Strecke kostet " + vierte + "€");
        System.out.println("Sie muessen "+ sechste + " mal tanken");
        return 0;
    }

}