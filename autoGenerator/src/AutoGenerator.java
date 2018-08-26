public class AutoGenerator {
     public static void main(String [] args){
        String [] Autos ={"Volkswagen", "Opel", "Toyota", "Opel"};
        String [] Motor ={"Diesel", "Benzin", "Hybrid"};
        String [] Hubraum={"2.0L", "1,6L", "1,4L", "1,8L"};
        String [] Variant={"Kombi", "Limousine"};

        int lenghta = Autos.length;
        int lenghtm = Motor.length;
        int lenghth = Hubraum.length;
        int lenghtv = Variant.length;


        int randa = (int) (Math.random()*lenghta);
        int randm = (int) (Math.random()*lenghtm);
        int randh = (int) (Math.random()*lenghth);
        int randv = (int) (Math.random()*lenghtv);

        System.out.println("Sie bekommen ein : " + Autos[randa]);
        System.out.println("Mit dem Motor : " + Motor[randm]);
        System.out.println("Mit Hubraum : " + Hubraum[randh]);
        System.out.println("Als " + Variant[randv] + " Virant" );


    }
}
