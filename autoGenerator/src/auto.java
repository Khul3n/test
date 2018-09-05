import java.util.ArrayList;
import java.util.List;

public class Auto {

    public List<AutoGenerator> getAutoGenerator() {
        List<AutoGenerator> Autos = new ArrayList();

        AutoGenerator a1 = new AutoGenerator();
        a1.setAuto("Volkswagen");
        a1.setAutoVW("Golf");
        a1.setFarbe("Schwarz");
        a1.setMotor("TDI");
        a1.setHubraum("2.0L");
        a1.setVariant("Kombi");
        a1.setZulassung("06.2018");
        Autos.add(a1);

        AutoGenerator a2 = new AutoGenerator();
        a2.setAuto("Opel");
        a2.setAutoO("Corsa");
        a2.setFarbe("Gelb");
        a2.setMotor("Benzin");
        a2.setHubraum("1,4L");
        a2.setVariant("Limousine");
        a2.setAuto("03.2009");
        Autos.add(a2);

        AutoGenerator a3 = new AutoGenerator();

        a3.setAuto("Toyota");
        a3.setAutoT("Auris");
        a3.setFarbe("Weiß");
        a3.setMotor("Hybrid");
        a3.setHubraum("1,8L");
        a3.setVariant("Kombi");
        a3.setZulassung("08.2017");
        Autos.add(a3);

        return Autos;
    }

    public void printData(){
            List<AutoGenerator> autos = getAutoGenerator();

            for(AutoGenerator a : autos)
                System.out.println(a.getAuto());
            for(AutoGenerator a : autos)
                System.out.println(a.getAutoO());
            for(AutoGenerator a : autos)
                System.out.println(a.getAutoT());
            for(AutoGenerator a : autos)
                System.out.println(a.getAutoVW());
            for(AutoGenerator a : autos)
                System.out.println(a.getFarbe());
            for(AutoGenerator a : autos)
                System.out.println(a.getMotor());
            for(AutoGenerator a : autos)
                System.out.println(a.getZulassung());
            for(AutoGenerator a : autos)
                System.out.println(a.getVariant());
            for(AutoGenerator a : autos)
                System.out.println(a.getHubraum());
    }
}
