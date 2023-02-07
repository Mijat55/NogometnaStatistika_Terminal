package nogometnaStatistikaObrada;

import java.util.ArrayList;

import java.util.List;

import nogometnaStatistika.Pomocno;
import nogometnaStatistika.Start;
import nogometnaStatistika01.Klub;


public class Klubovi {
	private List<Klub> klubovi;
	private Start start;
	

	public Klubovi(Start start) {
		super();
		this.start= start;
		klubovi = new ArrayList<>();
		testPodaci();
	}

	public Klubovi(List<Klub> klubovi,Start start) {
		super();
		this.klubovi = klubovi;
		this.start = start;
		testPodaci();
	}
	public void klubIzbornik() {
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("*Klub*");
		System.out.println("1) Popis klubova-");
		System.out.println("2) Pregled klubova-");
		System.out.println("3) Unos novoga kluba-");
		System.out.println("4) Izmjena kluba-");
		System.out.println("5) Brisanje kluba-");
		System.out.println("6) Povratak u glavni izbornik-");
		odabirKlubaIzbornik();
	}

	private void odabirKlubaIzbornik() {
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
			System.out.println("Glavni izbornik :)");
			start.glavniIzbornik();
			start.odabirGlavnogIzbornika();
		}
	}
	private void testPodaci() {
		if (Pomocno.DEV) {
			klubovi.add(new Klub());
			klubovi.add(new Klub());
		}

	}

	public List<Klub> getKlubovi() {
		return klubovi;
	}

	public void setKlubovi(List<Klub> klubovi) {
		this.klubovi = klubovi;
	}
	

}
