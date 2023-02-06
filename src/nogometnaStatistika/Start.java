package nogometnaStatistika;

import java.util.Scanner;

import nogometnaStatistikaObrada.Igraci;
import nogometnaStatistikaObrada.Klubovi;
import nogometnaStatistikaObrada.Utakmice;

public class Start {
	private Utakmice utakmice;
	private Klubovi klubovi;
	private Igraci igraci;
	public Start() {
		Pomocno.ulaz = new Scanner(System.in);
		klubovi = new Klubovi();
		utakmice = new Utakmice();
		igraci = new Igraci();
		ulaznaPoruka();
		glavniIzbornik();
		
	}
private void glavniIzbornik() {
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("Odaberite jednu od dostupnih opcija :");
		System.out.println("1) Utakmica-");
		System.out.println("2) Klub-");
		System.out.println("3) Igrač-");
		System.out.println("4) Događaj-");
		System.out.println("5) Vrsta-");
		System.out.println("6) Izlaz iz aplikacije :(");
		odabirGlavnogIzbornika();
}
		
		private void odabirGlavnogIzbornika() {
			switch(Pomocno.unosBrojRaspon("Odabrana opcija: ",1,6)) {
			case 1:
				utakmicaIzbornik();
				break;
			case 2:
				klubIzbornik();
				break;
			case 3:
				igracIzbornik();
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("Vidimo se uskoro :)");
			}
			
		}
		private void utakmicaIzbornik() {
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
			switch(Pomocno.unosBrojRaspon("Odabrana opcija: ",1,6)) {
			case 1:
				//utakmicaIzbornik();
				//break;
			case 2:
				//grupe.izbornik();
				//break;
			case 3:
				//polaznici.izbornik();
				//break;
			case 6:
				System.out.println("Dobrodošli u glavni izbornik :)");
				glavniIzbornik();
				odabirGlavnogIzbornika();
			}
		}
		
		private void klubIzbornik() {
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
			switch(Pomocno.unosBrojRaspon("Odabrana opcija: ",1,6)) {
			case 1:
				//utakmicaIzbornik();
				//break;
			case 2:
				//grupe.izbornik();
				//break;
			case 3:
				//polaznici.izbornik();
				//break;
			case 6:
				System.out.println("Glavni izbornik :)");
				glavniIzbornik();
				odabirGlavnogIzbornika();
			}
		}
		
		private void igracIzbornik() {
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
			switch(Pomocno.unosBrojRaspon("Odabrana opcija: ",1,6)) {
			case 1:
				//utakmicaIzbornik();
				//break;
			case 2:
				//grupe.izbornik();
				//break;
			case 3:
				//polaznici.izbornik();
				//break;
			case 6:
				System.out.println("Glavni izbornik :)");
				glavniIzbornik();
				odabirGlavnogIzbornika();
			}
		}
	
private void ulaznaPoruka() {
		System.out.println("*Dobrodošli u aplikaciju Nogometna Statistika*");
		
	}
public static void main(String[] args) {
	new Start();
}
}
