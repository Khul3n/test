import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class AutoGenerator {
	public static void main(String[] args) {
		String[] Auto = { "Volkswagen", "Opel", "Toyota" };
		String[] Motor = { "Diesel", "Benzin", "Hybrid" };
		String[] Hubraum = { "2.0L", "1,6L", "1,4L", "1,8L" };
		String[] Variant = { "Kombi", "Limousine" };
		String[] Farbe = { "Rot", "Weiß", "Schwarz", "Gelb" };
		String[] Zulassung = { "2016", "2017", "2018", "2015" };
		String[] AutoVW = { "Golf", "Passat", "Polo" };
		String[] AutoO = { "Corsa", "Astra", "Insignia" };
		String[] AutoT = { "Auris", "Yaris", "Corolla" };

		int lenghta = Auto.length;
		int lenghtm = Motor.length;
		int lenghth = Hubraum.length;
		int lenghtv = Variant.length;
		int lenghtf = Farbe.length;
		int lenghtz = Zulassung.length;
		int lenghtvw = AutoVW.length;
		int lenghto = AutoO.length;
		int lenghtt = AutoT.length;

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

		File dir = new File("C:/tmp/");

		if (!dir.exists()) {
			dir.mkdirs();
		} else {
			try {

				File file = new File(dir.getAbsolutePath().concat("/" +("Auto.txt")));
				PrintWriter pw = new PrintWriter(new FileOutputStream(file));



				if (Auto[randa] == "Volkswagen") {
					String autom = AutoVW[randvw];
					pw.println("Sie bekommen ein : " + Auto[randa] + " " + autom + " " + Variant[randv]);
				}

				else if (Auto[randa] == "Opel") {
					String autom = AutoO[rando];
					pw.println("Sie bekommen ein : " + Auto[randa] + " " + autom + " " + Variant[randv]);
				}

				else if (Auto[randa] == "Toyota") {
					String autom = AutoT[randt];
					pw.println("Sie bekommen ein : " + Auto[randa] + " " + autom + " " + Variant[randv]);
				}

				pw.println("Mit dem Motor : " + Motor[randm]);
				pw.println("Mit Hubraum : " + Hubraum[randh]);
				pw.println("Farbe ist " + Farbe[randf]);


				if (Zulassung[randz].equals("2018")) {
					kms = kkms;
				}
				pw.println("Erstzulassung : " + mdz + "." + Zulassung[randz]);

				pw.println("Das Auto hat " + kms + " KM");
				;

				if (tks < 20) {
					tks = 15;
				}
				pw.println("Das Auto hat " + tks + "L im Tank");

				pw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

}
