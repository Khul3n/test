import java.util.List;

public class Auto {
	private	String auto = null;
	private	String motor =  null;
	private	String hubraum =  null;
	private	String variant =  null;
	private	String farbe =  null;
	private	String zulassung =  null;
	private	String VW = null;
	private	String oO =  null;
	private	String T =  null;

	public String getAuto() {return auto;}
	public void setAuto(String auto){
		this.auto = auto;
	}

	public String getoO() {
		return oO;
	}
	public void setoO(String autoO){
		this.oO = autoO;
	}

	public String getT() {
		return T;
	}
	public void setT(String autoT){
		this.T = autoT;
	}


	public String getVW() {
		return VW;
	}
	public void setVW(String autoVW){
		this.VW = autoVW;
	}

	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe){
		this.farbe = farbe;
	}

	public String getHubraum() {
		return hubraum;
	}
	public void setHubraum(String hubraum){
		this.hubraum = hubraum;
	}

	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor){
		this.motor =  motor;
	}

	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant){
		this.variant =  variant;
	}

	public String getZulassung() {
		return zulassung;
	}
	public void setZulassung(String zulassung){
		this.zulassung = zulassung;
	}

	public static void main(String[] args){
		AutoGenerator generator= new AutoGenerator();
		List<Auto> autos = generator.getAutoGenerator();

		for(Auto a : autos)
			System.out.println(a.getAuto());
		for(Auto a : autos)
			System.out.println(a.getoO());
		for(Auto a : autos)
			System.out.println(a.getVW());
		for(Auto a : autos)
		    System.out.println(a.getT());
		for (Auto a : autos)
			System.out.println(a.getFarbe());
		for(Auto a : autos)
			System.out.println(a.getMotor());
		for(Auto a : autos)
			System.out.println(a.getZulassung());
		for(Auto a : autos)
			System.out.println(a.getVariant());
		for(Auto a : autos)
			System.out.println(a.getHubraum());
	}

}




