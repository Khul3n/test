import java.util.Random;

public class auto {

    public static void main (String[] args){

        AutoGenerator variable = new AutoGenerator();

        int lenghta = variable.getAuto().length;
        int lenghtm = variable.getMotor().length;
        int lenghth = variable.getHubraum().length;
        int lenghtv = variable.getVariant().length;
        int lenghtf = variable.getFarbe().length;
        int lenghtz = variable.getZulassung().length;
        int lenghtvw = variable.getAutoVW().length;
        int lenghto = variable.getAutoO().length;
        int lenghtt = variable.getAutoT().length;



        Random rand = new Random();
        int kms = rand.nextInt(150000) + 1;
        int tks = rand.nextInt(50) + 1;
        int mdz = rand.nextInt(12) + 1;
        int kkms = rand.nextInt(10000) + 1;


        int randa = (int) (Math.random() * lenghta);
        int randm = (int) (Math.random() * lenghtm);
        int randh = (int) (Math.random() * lenghth);
        int randv = (int) (Math.random() * lenghtv);
        int randf = (int) (Math.random() * lenghtf);
        int randz = (int) (Math.random() * lenghtz);
        int randvw = (int) (Math.random() * lenghtvw);
        int rando = (int) (Math.random() * lenghto);
        int randt = (int) (Math.random() * lenghtt);

        /*File dir = new File("C:/tmp/");

        if (!dir.exists()) {
            dir.mkdirs();
        } else {
            try {

                File file = new File(dir.getAbsolutePath().concat("/" + variable.getAuto()[randa] + (".txt")));
                PrintWriter pw = new PrintWriter(new FileOutputStream(file));*/


                if (variable.getAuto()[randa] == "Volkswagen") {
                    String autom = variable.getAutoVW()[randvw];
                    System.out.println("Sie bekommen ein : " + variable.getAuto()[randa] + " " + autom + " " + variable.getVariant()[randv]);
                } else if (variable.getAuto()[randa] == "Opel") {
                    String autom = variable.getAutoO()[rando];
                    System.out.println("Sie bekommen ein : " + variable.getAuto()[randa] + " " + autom + " " + variable.getVariant()[randv]);
                } else if (variable.getAuto()[randa] == "Toyota") {
                    String autom = variable.getAutoT() [randt];
                    System.out.println("Sie bekommen ein : " + variable.getAuto()[randa] + " " + autom + " " + variable.getVariant()[randv]);
                }

                System.out.println("Mit dem Motor : " + variable.getMotor()[randm]);
                System.out.println("Mit Hubraum : " + variable.getHubraum()[randh]);
                System.out.println("Farbe: " + variable.getFarbe()[randf]);


                if (variable.getZulassung()[randz].equals("2018")) {
                    kms = kkms;
                }
                if (mdz < 10) {
                    System.out.println("Erstzulassung : 0" + mdz + "." + variable.getZulassung()[randz]);
                } else {
                    System.out.println("Erstzulassung : " + mdz + "." + variable.getZulassung()[randz]);
                }
                     System.out.println("Das Auto hat " + kms + " KM");

                if (tks < 20) {
                    tks = 15;
                }
                    System.out.println("Das Auto hat " + tks + "L im Tank");

                /*pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();*/



    }
}
