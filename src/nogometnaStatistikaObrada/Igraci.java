package nogometnaStatistikaObrada;

import java.util.ArrayList;

import java.util.List;

import nogometnaStatistika.Pomocno;
import nogometnaStatistika.Start;
import nogometnaStatistika01.Igrac;

public class Igraci {
	private List<Igrac> igraci;
	private Start start;

	public Igraci(Start start) {
		super();
		this.start = start;
		igraci = new ArrayList<>();
		testPodaci();
	}

	public Igraci(List<Igrac> igraci, Start start) {
		super();
		this.igraci = igraci;
		this.start = start;
		testPodaci();
	}

	public void igračIzbornik() {
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("*Igrač*");
		System.out.println("1) Popis igrača-");
		System.out.println("2) Pregled igrača-");
		System.out.println("3) Unos novoga igrača-");
		System.out.println("4) Izmjena igrača-");
		System.out.println("5) Brisanje igrača-");
		System.out.println("6) Povratak u glavni izbornik-");
		odabirIgračaIzbornik();
	}

	private void odabirIgračaIzbornik() {
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
			igraci.add(new Igrac());
			igraci.add(new Igrac());
		}
	}

	public List<Igrac> getIgraci() {
		return igraci;
	}

	public void setIgraci(List<Igrac> igraci) {
		this.igraci = igraci;
	}

}
