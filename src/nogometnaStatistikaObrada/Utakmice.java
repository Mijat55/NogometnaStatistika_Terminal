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
		
			utakmice.add(new Utakmica(1, "Rudeš", "Solin", "2022/10/02 15:30:00", "2000", "SC Rudes"));
			utakmice.add(new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"));
			utakmice.add(new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"));
			utakmice.add(new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"));
			utakmice.add(new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"));
			utakmice.add(new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"));
			utakmice.add(new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"));
			utakmice.add(new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"));
			utakmice.add(new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"));
		

	}

	public void utakmicaIzbornik() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("     "+"*Utakmica*");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1) Pregled utakmica-");
		System.out.println("2) Unos nove utakmice-");
		System.out.println("3) Izmjena utakmice-");
		System.out.println("4) Brisanje utakmice-");
		System.out.println("5) Povratak u glavni izbornik-");
		odabirUtakmicaIzbornik();

	}

	private void odabirUtakmicaIzbornik() {
		switch (Pomocno.unosBrojRaspon("ODABRANA OPCIJA: ", 1, 5)) {
		case 1:
			pregled(true);
			break;

		case 2:
			unosNoveUtakmice();
			break;
		case 3:
			if (utakmice.size() == 0) {
				System.out.println("Nema utakmica koje " + "bi mjenjali!");
				utakmicaIzbornik();
			} else {
				izmjena();
			}

			break;
		case 4:
			if (utakmice.size() == 0) {
				System.out.println("Nema utakmica " + "koje " + "bi brisali!");
				utakmicaIzbornik();
			} else {
				brisanje();
			}
			break;
		case 5:
			start.glavniIzbornik();

		}
	}

	private void brisanje() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE UTAKMICU KOJU ŽELITE OBRISATI: ", 1, utakmice.size());
		utakmice.remove(rb - 1);
		utakmicaIzbornik();
	}

	private void izmjena() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE UTAKMICU KOJU ŽELITE PROMIJENITI: ", 1, utakmice.size());
		Utakmica u = utakmice.get(rb - 1);
		u.setSifra(Pomocno.unosBrojRaspon("Unesite novu sifru pod kojom će se utakmica voditi:", 1, Integer.MAX_VALUE));
		u.setDomaciKlub(Pomocno.unosTeksta("Unesite novi naziv domaćeg kluba: "));
		u.setGostiKlub(Pomocno.unosTeksta("Unesite novi naziv gostujućeg kluba: "));
		u.setMaksimalanBrojNavijaca(Pomocno.unosTeksta("Unesite novi maksimalan broj navijača: "));
		u.setStadion(Pomocno.unosTeksta("Unesite novi naziv stadiona: "));
		u.setVrijemePocetka(Pomocno.unosTeksta("Unesite novo vrijeme pocetka utakmice: "));
		utakmicaIzbornik();
	}

	public void pregled(boolean prikaziUtakmicaIzbornik) {
		System.out.println("");
		System.out.println("\nDOSTUPNE UTAKMICE: ");
		System.out.println("");
		int rb = 1;
		for (Utakmica u : utakmice) {
			System.out.println(rb++ + ". " + u);
		}
		System.out.println("");
		if (prikaziUtakmicaIzbornik) {
			utakmicaIzbornik();
		}

	}

	private void unosNoveUtakmice() {
		utakmice.add(unesiNovuUtakmicu());
		utakmicaIzbornik();
	}

	private Utakmica unesiNovuUtakmicu() {
		Utakmica u = new Utakmica();
		u.setSifra(Pomocno.unosBrojRaspon("Unesi šifru utakmice: ", 1, Integer.MAX_VALUE));
		u.setDomaciKlub(Pomocno.unosTeksta("Unesite naziv domaćeg kluba: "));
		u.setGostiKlub(Pomocno.unosTeksta("Unesite naziv gostujućeg kluba: "));
		u.setMaksimalanBrojNavijaca(Pomocno.unosTeksta("Unesite maksimalan broj navijača: "));
		u.setStadion(Pomocno.unosTeksta("Unesite naziv stadiona: "));
		u.setVrijemePocetka(Pomocno.unosTeksta("Unesite vrijeme pocetka utakmice: "));
		return u;
	}

	public List<Utakmica> getUtakmice() {
		return utakmice;
	}

	public void setUtakmice(List<Utakmica> utakmice) {
		this.utakmice = utakmice;
	}

}
