import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.UUID;

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
		int kms = rand.nextInt(15000) + 1;
		int tks = rand.nextInt(50) + 1;
		int mdz = rand.nextInt(12) + 1;
		int kkms = rand.nextInt(10000) + 1;
		int kmdz = rand.nextInt(8) + 1;

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

				File file = new File(dir.getAbsolutePath().concat("/" + UUID.randomUUID()).concat(".txt"));
				PrintWriter pw = new PrintWriter(new FileOutputStream(file));

				pw.println("Sie bekommen ein : " + Auto[randa]);

				if (Auto[randa] == "Volkswagen") {
					String autom = AutoVW[randvw];
					System.out.println("Modelle : " + autom);
				}

				else if (Auto[randa] == "Opel") {
					String autom = AutoO[rando];
					System.out.println("Modelle : " + autom);
				}

				else if (Auto[randa] == "Toyota") {
					String autom = AutoT[randt];
					System.out.println("Modelle: " + autom);
				}

				pw.println("Mit dem Motor : " + Motor[randm]);
				pw.println("Farbe ist " + Farbe[randf]);
				pw.println("Erstzulassung : " + mdz + "." + Zulassung[randz]);
				pw.println("Mit Hubraum : " + Hubraum[randh]);
				pw.println("Als " + Variant[randv]);

				if (Zulassung[randz] == "2018") {
					kms = kkms;
				}

				pw.println("Das Auto hat " + kms + " KM");

				if (tks < 20) {
					tks = 15;
				}
				pw.println("Das Auto hat " + tks + "L im Tank");
				pw.close();
				pw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

}
