package nogometnaStatistikaObrada;

import java.util.ArrayList;
import java.util.List;

import nogometnaStatistika.Pomocno;
import nogometnaStatistika.Start;

import nogometnaStatistika01.Vrsta;

public class Vrste {
	private List<Vrsta> vrste;
	private Start start;

	public Vrste(Start start) {
		super();
		this.start = start;
		vrste = new ArrayList<>();
		testPodaci();
	}

	public Vrste(List<Vrsta> vrste, Start start) {
		super();
		this.vrste = vrste;
		this.start = start;
		testPodaci();
	}

	public void vrstaIzbornik() {
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("*Vrsta*");
		System.out.println("1) Popis Vrste-");
		System.out.println("2) Pregled Vrste-");
		System.out.println("3) Unos nove Vrste-");
		System.out.println("4) Izmjena Vrste-");
		System.out.println("5) Brisanje Vrste-");
		System.out.println("6) Povratak u glavni izbornik-");
		odabirVrstaIzbornik();
	}

	private void odabirVrstaIzbornik() {
		switch (Pomocno.unosBrojRaspon("Odabrana opcija: ", 1, 6)) {
		case 1:
			// utakmicaIzbornik();
			// break;
		case 2:
			// grupe.izbornik();
			// break;
		case 3:
			// polaznici.izbornik();
			// break;
		case 6:
			System.out.println("Dobrodošli u glavni izbornik :)");
			start.glavniIzbornik();
			start.odabirGlavnogIzbornika();
		}
	}

	private void testPodaci() {
		if (Pomocno.DEV) {
			vrste.add(new Vrsta());
			vrste.add(new Vrsta());
		}

	}

	public List<Vrsta> getVrste() {
		return vrste;
	}

	public void setVrste(List<Vrsta> vrste) {
		this.vrste = vrste;
	}

}
