package nogometnaStatistikaObrada;

import java.util.ArrayList;
import java.util.List;

import nogometnaStatistika.Pomocno;
import nogometnaStatistika.Start;
import nogometnaStatistika01.Dogadjaj;


public class Dogadjaji {
	private List<Dogadjaj> dogadjaji;
	private Start start;
	

	public Dogadjaji(Start start) {
		super();
		this.start= start;
		dogadjaji = new ArrayList<>();
		testPodaci();
	}

	public Dogadjaji(List<Dogadjaj> dogadjaji,Start start) {
		super();
		this.dogadjaji = dogadjaji;
		this.start=start;
		testPodaci();
	}
	public void događajIzbornik() {
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("*Događaj*");
		System.out.println("1) Popis događaja-");
		System.out.println("2) Pregled događaja-");
		System.out.println("3) Unos novoga događaja-");
		System.out.println("4) Izmjena događaja-");
		System.out.println("5) Brisanje događaja-");
		System.out.println("6) Povratak u glavni izbornik-");
		odabirDogađajaIzbornik();
	}

	private void odabirDogađajaIzbornik() {
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
			dogadjaji.add(new Dogadjaj());
			dogadjaji.add(new Dogadjaj());
		}

	}

	public List<Dogadjaj> getDogadjaji() {
		return dogadjaji;
	}

	public void setDogadjaji(List<Dogadjaj> dogadjaji) {
		this.dogadjaji = dogadjaji;
	}
	
	

}
