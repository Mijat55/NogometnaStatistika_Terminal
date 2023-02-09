package nogometnaStatistika;

import java.util.Scanner;

import nogometnaStatistikaObrada.Dogadjaji;
import nogometnaStatistikaObrada.Igraci;
import nogometnaStatistikaObrada.Klubovi;
import nogometnaStatistikaObrada.Utakmice;
import nogometnaStatistikaObrada.Vrste;

public class Start {
	private Utakmice utakmice;
	private Klubovi klubovi;
	private Igraci igraci;
	private Dogadjaji dogadjaji;
	private Vrste vrste;

	public Start() {
		Pomocno.ulaz = new Scanner(System.in);
		klubovi = new Klubovi(this);
		utakmice = new Utakmice(this);
		igraci = new Igraci(this);
		dogadjaji = new Dogadjaji(this);
		vrste = new Vrste(this);
		ulaznaPoruka();
		glavniIzbornik();

	}

	public void glavniIzbornik() {
		System.out.println("⚽~~~~~~~~~~~~~~~~~~~~~⚽~~~~~~~~~~~~~~~~~~~~~⚽");
		System.out.println("ODABERITE JEDNU OD DOSTUPNIH OPCIJA:");
		System.out.println("1) Utakmica-");
		System.out.println("2) Klub-");
		System.out.println("3) Igrač-");
		System.out.println("4) Događaj-");
		System.out.println("5) Vrsta-");
		System.out.println("6) Izlaz iz aplikacije :(");
		odabirGlavnogIzbornika();
	}

	public void odabirGlavnogIzbornika() {
		switch (Pomocno.unosBrojRaspon("ODABRANA OPCIJA: ", 1, 6)) {
		case 1:
			utakmice.utakmicaIzbornik();
			break;
		case 2:
			klubovi.klubIzbornik();
			break;
		case 3:
			igraci.igračIzbornik();
			break;
		case 4:
			dogadjaji.događajIzbornik();
			break;
		case 5:
			vrste.vrstaIzbornik();
			break;
		case 6:
			System.out.println("Vidimo se uskoro :)");

		}

	}

	private void ulaznaPoruka() {
		System.out.println("⚽~~~~~~~~~~~~~~~~~~~~~⚽~~~~~~~~~~~~~~~~~~~~~⚽");
		System.out.println("*Dobrodošli u aplikaciju Nogometna Statistika*");

	}

	public Utakmice getUtakmice() {
		return utakmice;
	}

	public Igraci getIgraci() {
		return igraci;
	}

	public Klubovi getKlubovi() {
		return klubovi;
	}

	public Dogadjaji getDogadjaji() {
		return dogadjaji;
	}

	public Vrste getVrste() {
		return vrste;
	}

	public static void main(String[] args) {
		if (args.length == 1) {
			Pomocno.DEV = true;
		} else {
			Pomocno.DEV = false;
		}
		new Start();
	}
}
