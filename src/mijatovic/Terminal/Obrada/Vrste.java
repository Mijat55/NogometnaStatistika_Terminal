package mijatovic.Terminal.Obrada;

import java.util.ArrayList;
import java.util.List;

import mijatovic.Terminal.Model.Vrsta;
import nogometnaStatistika.Pomocno;
import nogometnaStatistika.Start;

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
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("       " + "*Vrsta*");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1) Pregled Vrste-");
		System.out.println("2) Unos nove Vrste-");
		System.out.println("3) Izmjena Vrste-");
		System.out.println("4) Brisanje Vrste-");
		System.out.println("5) Povratak u glavni izbornik-");
		odabirVrstaIzbornik();
	}

	private void odabirVrstaIzbornik() {
		switch (Pomocno.unosBrojRaspon("Odabrana opcija: ", 1, 5)) {
		case 1:
			pregled(true);
			break;
		case 2:
			unosNoveVrste();
			break;
		case 3:
			if (vrste.size() == 0) {
				System.out.println("Nema vrste" + "koje " + "bi mjenjali!");
				vrstaIzbornik();
			} else {
				izmjena();
			}

			break;
		case 4:
			if (vrste.size() == 0) {
				System.out.println("Nema vrste " + "kojeg " + "bi brisali!");
				vrstaIzbornik();
			} else {
				brisanje();
			}
			break;
		case 5:
			System.out.println("Dobrodošli u glavni izbornik :)");
			start.glavniIzbornik();
			start.odabirGlavnogIzbornika();
		}
	}

	private void testPodaci() {

		vrste.add(new Vrsta(1, "Izmjena", (false)));
		vrste.add(new Vrsta(2, "Asistencija", (false)));
		vrste.add(new Vrsta(3, "Žuti Karton", (false)));
		vrste.add(new Vrsta(4, "Crveni Karton", (false)));
		vrste.add(new Vrsta(5, "Jedanaesterac", (false)));
		vrste.add(new Vrsta(6, "Ozljeda", (false)));
		vrste.add(new Vrsta(7, "Gol", (true)));

	}

	private void brisanje() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE VRSTU KOJI ŽELITE OBRISATI: ", 1, vrste.size());
		vrste.remove(rb - 1);
		vrstaIzbornik();
	}

	private void izmjena() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE VRSTU KOJU ŽELITE PROMIJENITI: ", 1, vrste.size());
		Vrsta v = vrste.get(rb - 1);
		v.setSifra(Pomocno.unosBrojRaspon("Unesite novu sifru pod kojom će se vrsta voditi:", 1, Integer.MAX_VALUE));
		v.setNaziv(Pomocno.unosTeksta("Unesite naziv vrste"));
		v.setGol(Pomocno.unosPotvrde("Za izmjenu gola unesite šifu 7 ", 7));

		vrstaIzbornik();
	}

	public void pregled(boolean prikaziVrstaIzbornik) {
		System.out.println("");
		System.out.println("\nDOSTUPNE VRSTE: ");
		System.out.println("");
		int rb = 1;
		for (Vrsta v : vrste) {
			System.out.println(rb++ + ". " + v);
		}
		System.out.println("");
		if (prikaziVrstaIzbornik) {
			vrstaIzbornik();
		}

	}

	private void unosNoveVrste() {
		vrste.add(unesiNovuVrstu());
		vrstaIzbornik();
	}

	private Vrsta unesiNovuVrstu() {
		Vrsta v = new Vrsta();
		v.setSifra(Pomocno.unosBrojRaspon("Unesi šifru vrste: ", 1, Integer.MAX_VALUE));
		v.setNaziv(Pomocno.unosTeksta("Unesite naziv vrste: "));
		v.setGol(Pomocno.unosPotvrde("Za gol unesite šifu 7", 7));
		return v;
	}

	public List<Vrsta> getVrste() {
		return vrste;
	}

	public void setVrste(List<Vrsta> vrste) {
		this.vrste = vrste;
	}

}
