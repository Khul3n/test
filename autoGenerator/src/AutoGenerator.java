import java.util.ArrayList;
import java.util.List;

public class AutoGenerator {

    public List<Auto> getAutoGenerator() {
        List<Auto> Autos = new ArrayList();

        Auto a1 = new Auto();
        a1.setAuto("Volkswagen");
        a1.setVW("Golf");
        a1.setoO("Corsa");
        a1.setT("Auris");
        a1.setFarbe("Schwarz");
        a1.setMotor("TDI");
        a1.setHubraum("2.0L");
        a1.setVariant("Kombi");
        a1.setZulassung("06.2018");
        Autos.add(a1);

        Auto a2 = new Auto();
        a2.setAuto("Opel");
        a2.setFarbe("Gelb");
        a2.setMotor("Benzin");
        a2.setHubraum("1,4L");
        a2.setVariant("Limousine");
        a2.setZulassung("03.2009");
        Autos.add(a2);

        Auto a3 = new Auto();

        a3.setAuto("Toyota");
        a3.setFarbe("Weiß");
        a3.setMotor("Hybrid");
        a3.setHubraum("1,8L");
        a3.setVariant("Kombi");
        a3.setZulassung("08.2017");
        Autos.add(a3);

        return Autos;
    }


}
