import java.util.Random;

public class AutoGenerator {
     public static void main(String [] args){
        String [] Auto ={"Volkswagen", "Opel", "Toyota", "Opel"};
        String [] Motor ={"Diesel", "Benzin", "Hybrid"};
        String [] Hubraum={"2.0L", "1,6L", "1,4L", "1,8L"};
        String [] Variant={"Kombi", "Limousine"};
        String [] Farbe= {"Rot", "Weiß", "Schwarz", "Gelb"};
        String [] Zulassung= {"2016","2017","2018", "2015" };

        int lenghta = Auto.length;
        int lenghtm = Motor.length;
        int lenghth = Hubraum.length;
        int lenghtv = Variant.length;
        int lenghtf = Farbe.length;
        int lenghtz = Zulassung.length;

         Random rand = new Random();
         int kms = rand.nextInt(15000)+1;
         int tks = rand.nextInt(50)+1;
         int mdz = rand.nextInt(12)+1;

        int randa = (int) (Math.random()*lenghta);
        int randm = (int) (Math.random()*lenghtm);
        int randh = (int) (Math.random()*lenghth);
        int randv = (int) (Math.random()*lenghtv);
        int randf = (int) (Math.random()*lenghtf);
        int randz = (int) (Math.random()*lenghtz);


        System.out.println("Sie bekommen ein : " + Auto[randa]);
        System.out.println("Mit dem Motor : " + Motor[randm]);
        System.out.println("Farbe ist "+ Farbe[randf]);
        System.out.println("Erstzulassung : " + mdz +"."+Zulassung[randz]);
        System.out.println("Mit Hubraum : " + Hubraum[randh]);
        System.out.println("Als " + Variant[randv]);
        System.out.println("Das Auto hat " + kms + " KM");

        if (tks < 20 ) {
            tks = 15;
        }
         System.out.println("Das Auto hat "+tks+ "L im Tank");

    }
}
