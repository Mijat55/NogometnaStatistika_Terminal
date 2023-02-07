package nogometnaStatistikaObrada;

import java.util.ArrayList;

import java.util.List;

import nogometnaStatistika.Pomocno;
import nogometnaStatistika.Start;
import nogometnaStatistika01.Utakmica;

public class Utakmice {
	private List<Utakmica> utakmice;
	private Start start;

	public Utakmice(Start start) {
		super();
		this.start = start;
		utakmice = new ArrayList<>();
		testPodaci();
	}

	public Utakmice(List<Utakmica> utakmice, Start start) {
		super();
		this.utakmice = utakmice;
		this.start = start;
		testPodaci();
	}

	private void testPodaci() {
		if (Pomocno.DEV) {
			utakmice.add(new Utakmica(1, "Cibalia", "Vukovar 91", "2022/05/05", "1000", "Gradski Vrt"));
			utakmice.add(new Utakmica());
		}

	}

	public void utakmicaIzbornik() {
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("*Utakmica*");
		System.out.println("1) Popis utakmica-");
		System.out.println("2) Pregled utakmica-");
		System.out.println("3) Unos nove utakmice-");
		System.out.println("4) Izmjena utakmice-");
		System.out.println("5) Brisanje utakmice-");
		System.out.println("6) Povratak u glavni izbornik-");
		odabirUtakmicaIzbornik();

	}

	private void odabirUtakmicaIzbornik() {
		switch (Pomocno.unosBrojRaspon("Odabrana opcija: ", 1, 6)) {
		case 1:
			popis(true);
			break;
		case 2:
			// grupe.izbornik();
			// break;
		case 3:
			// polaznici.izbornik();
			// break;
		case 6:
			start.glavniIzbornik();
			start.odabirGlavnogIzbornika();

		}
	}

	public void popis(boolean prikaziIzbornik) {
		System.out.println("\nUtakmice u aplikaciji");
		int rb = 1;
		for (Utakmica u : utakmice) {
			System.out.println(rb++ + ". " + u);
		}
		System.out.println("---------");
		if (prikaziIzbornik) {
			utakmicaIzbornik();
		}

	}

	public List<Utakmica> getUtakmice() {
		return utakmice;
	}

	public void setUtakmice(List<Utakmica> utakmice) {
		this.utakmice = utakmice;
	}

}
