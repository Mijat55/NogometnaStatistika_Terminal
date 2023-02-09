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
		this.start = start;
		klubovi = new ArrayList<>();
		testPodaci();
	}

	public Klubovi(List<Klub> klubovi, Start start) {
		super();
		this.klubovi = klubovi;
		this.start = start;
		testPodaci();
	}

	public void klubIzbornik() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("       "+"*Klub*");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1) Pregled klubova-");
		System.out.println("2) Unos novoga kluba-");
		System.out.println("3) Izmjena kluba-");
		System.out.println("4) Brisanje kluba-");
		System.out.println("5) Povratak u glavni izbornik-");
		odabirKlubaIzbornik();
	}

	private void odabirKlubaIzbornik() {
		switch (Pomocno.unosBrojRaspon("ODABRANA OPCIJA: ", 1, 5)) {
		case 1:
			pregled(true);
			break;
		case 2:
			unosNovogaKluba();
			 break;
		case 3:
			if (klubovi.size() == 0) {
				System.out.println("Nema kluba" + "kojeg " + "bi mjenjali!");
				klubIzbornik();
			} else {
				izmjena();
			}

			break;
		case 4:
			if (klubovi.size() == 0) {
				System.out.println("Nema kluba " + "kojeg " + "bi brisali!");
				klubIzbornik();
			} else {
				brisanje();
			}
			break;
			
		case 5:
			System.out.println("Glavni izbornik :)");
			start.glavniIzbornik();
			
		}
	}
	

	private void testPodaci() {
		
			klubovi.add(new Klub(1,"Rudes"));
			klubovi.add(new Klub(2,"Solin"));
			klubovi.add(new Klub(3,"Cibalia"));
			klubovi.add(new Klub(4,"Vukovar_91"));
			klubovi.add(new Klub(5,"Dugopolje"));
			klubovi.add(new Klub(6,"Orijent"));
		}

	
	private void brisanje() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE KLUB KOJI ŽELITE OBRISATI: ", 1, klubovi.size());
		klubovi.remove(rb - 1);
		klubIzbornik();
	}
	private void izmjena() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE UTAKMICU KOJU ŽELITE PROMIJENITI: ", 1, klubovi.size());
		Klub k = klubovi.get(rb - 1);
		k.setSifra(Pomocno.unosBrojRaspon("Unesite novu sifru pod kojom će se utakmica voditi:", 1, Integer.MAX_VALUE));
		k.setNaziv(Pomocno.unosTeksta("Unesite naziv kluba"));
		
		klubIzbornik();
	}
	public void pregled(boolean prikaziKlubIzbornik) {
		System.out.println("");
		System.out.println("\nDOSTUPNI KLUBOVI: ");
		System.out.println("");
		int rb = 1;
		for (Klub k : klubovi) {
			System.out.println(rb++ + ". " + k);
		}
		System.out.println("");
		if (prikaziKlubIzbornik) {
			klubIzbornik();
		}

	}
	private void unosNovogaKluba() {
		klubovi.add(unesiNoviKlub());
		klubIzbornik();
	}

	private Klub unesiNoviKlub() {
		Klub k = new Klub();
		k.setSifra(Pomocno.unosBrojRaspon("Unesi šifru utakmice: ", 1, Integer.MAX_VALUE));
		k.setNaziv(Pomocno.unosTeksta("Unesite naziv kluba: "));
	    return k;
	}

	public List<Klub> getKlubovi() {
		return klubovi;
	}

	public void setKlubovi(List<Klub> klubovi) {
		this.klubovi = klubovi;
	}

}
