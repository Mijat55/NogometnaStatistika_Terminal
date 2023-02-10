package nogometnaStatistikaObrada;

import java.util.ArrayList;

import java.util.List;

import nogometnaStatistika.Pomocno;
import nogometnaStatistika.Start;
import nogometnaStatistika01.Dogadjaj;
import nogometnaStatistika01.Igrac;
import nogometnaStatistika01.Klub;
import nogometnaStatistika01.Utakmica;
import nogometnaStatistika01.Vrsta;

public class Dogadjaji {
	private List<Dogadjaj> dogadjaji;
	private Start start;

	public Dogadjaji(Start start) {
		super();
		this.start = start;
		dogadjaji = new ArrayList<>();
		testPodaci();
	}

	public Dogadjaji(List<Dogadjaj> dogadjaji, Start start) {
		super();
		this.dogadjaji = dogadjaji;
		this.start = start;
		testPodaci();
	}

	public void događajIzbornik() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("     " + "*Događaj*");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1) Pregled događaja-");
		System.out.println("2) Unos novoga događaja-");
		System.out.println("3) Izmjena događaja-");
		System.out.println("4) Brisanje događaja-");
		System.out.println("5) Povratak u glavni izbornik-");
		odabirDogađajaIzbornik();
	}

	private void odabirDogađajaIzbornik() {
		switch (Pomocno.unosBrojRaspon("Odabrana opcija: ", 1, 6)) {
		case 1:
			pregled(true);
			break;
		case 2:
			unesiNoviDogadjaj();
			break;
		case 3:
			if (dogadjaji.size() == 0) {
				System.out.println("Nema događaja koje " + "bi mjenjali!");
				događajIzbornik();
			} else {
				izmjena();
			}
		case 4:
			if (dogadjaji.size() == 0) {
				System.out.println("Nema događaja " + "kojeg " + "bi brisali!");
				događajIzbornik();
			} else {
				brisanje();
			}
		case 5:
			System.out.println("Glavni izbornik :)");
			start.glavniIzbornik();

		}
	}

	private void testPodaci() {
		
dogadjaji.add(new Dogadjaj(1,10,new Igrac(6,"Tomislav","Srbljinović","1999/12/27","69385715377","270.000€","Sredina",new Klub(1,"Rudes")),new Utakmica(1, "Rudeš", "Solin", "2022/10/02 15:30:00", "2000", "SC Rudes"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(2,12,new Igrac(20,"Ivan","Markota","1998/12/06","65969432001","155.000€","Veza",new Klub(2,"Solin")),new Utakmica(1, "Rudeš", "Solin", "2022/10/02 15:30:00", "2000", "SC Rudes"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(3,30,new Igrac(19,"Ivan","Dominić","2003/01/07","98184533294","20.000€","Sredina",new Klub(2,"Solin")),new Utakmica(1, "Rudeš", "Solin", "2022/10/02 15:30:00", "2000", "SC Rudes"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(4,65,new Igrac(9,"Tomislav","Gudelj","1998/05/01","90905715396","370.000€","Veza",new Klub(1,"Rudes")),new Utakmica(1, "Rudeš", "Solin", "2022/10/02 15:30:00", "2000", "SC Rudes"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(5,74,new Igrac(18,"Duje","Ninčević","1997/05/03","51388394203","145.000€","Sredina",new Klub(2,"Solin")),new Utakmica(1, "Rudeš", "Solin", "2022/10/02 15:30:00", "2000", "SC Rudes"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(6,76,new Igrac(18,"Duje","Ninčević","1997/05/03","51388394203","145.000€","Sredina",new Klub(2,"Solin")),new Utakmica(1, "Rudeš", "Solin", "2022/10/02 15:30:00", "2000", "SC Rudes"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(7,82,new Igrac(22,"Sylvanus","Nimely","1998/09/04","13432948854","240.000€","Napad",new Klub(2,"Solin")),new Utakmica(1, "Rudeš", "Solin", "2022/10/02 15:30:00", "2000", "SC Rudes"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(8,74,new Igrac(20,"Ivan","Markota","1998/12/06","65969432001","155.000€","Veza",new Klub(2,"Solin")),new Utakmica(1, "Rudeš", "Solin", "2022/10/02 15:30:00", "2000", "SC Rudes"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(9,45,new Igrac(49,"Filip","Mekić","2002/09/13","78654987612","165.000€","Obrana",new Klub(5,"Dugopolje")),new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(10,46,new Igrac(31,"Edis","Smajić","1999/09/10","23459285412","240.000€","Veza",new Klub(3,"Cibalia")),new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(11,55,new Igrac(53,"Filip","Ambroz","2003/12/01","36547812348","52.000€","Veza",new Klub(5,"Dugopolje")),new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(12,65,new Igrac(27,"Dario","Rugašević","1991/01/29","11929382213","145.000€","Obrana",new Klub(3,"Cibalia")),new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(13,77,new Igrac(48,"Roko","Kurtović","1999/01/24","12345643243","155.000€","Obrana",new Klub(5,"Dugopolje")),new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(14,77,new Igrac(49,"Filip","Mekić","2002/09/13","78654987612","165.000€","Obrana",new Klub(5,"Dugopolje")),new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(15,81,new Igrac(33,"Ivan","Mihaljević","1999/06/29","65438596523","340.000€","Napad",new Klub(3,"Cibalia")),new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(16,81,new Igrac(27,"Dario","Rugašević","1991/01/29","11929382213","145.000€","Obrana",new Klub(3,"Cibalia")),new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(17,90,new Igrac(46,"Gregor","Gulisija","2002/01/04","87654329123","52.000€","Obrana",new Klub(5,"Dugopolje")),new Utakmica(2, "Cibalia", "Dugopolje", "2022/10/15 15:00:00", "5000", "HNK Cibalia"),new Vrsta(6, "Ozljeda", (false))));
dogadjaji.add(new Dogadjaj(18,02,new Igrac(43,"Vanja","Pelko","2002/03/25","52232320976","10.000€","Veza",new Klub(4,"Vukovar_91")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(19,02,new Igrac(41,"Jakov","Biljan","1995/08/02","11030214931","52.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(20,06,new Igrac(42,"Robin","Ruiz","1998/11/26","86954328545","15.000€","Veza",new Klub(4,"Vukovar_91")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(21,06,new Igrac(39,"Zinedin","Mustedanagić","1998/08/01","23987654962","210.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(22,07,new Igrac(61,"Marijan","Jukičić","1999/06/22","87643090432","52.000€","Sredina",new Klub(6,"Orijent")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(23,29,new Igrac(41,"Jakov","Biljan","1995/08/02","11030214931","52.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(24,29,new Igrac(38,"Dominik","Mihaljević","1994/08/27","82837410499","205.000€","Obrana",new Klub(4,"Vukovar_91")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(25,41,new Igrac(39,"Zinedin","Mustedanagić","1998/08/01","23987654962","210.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(26,41,new Igrac(46,"Gregor","Gulisija","2002/01/04","87654329123","52.000€","Obrana",new Klub(5,"Dugopolje")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(27,60,new Igrac(65,"Dzemal","Ibishi","12001/01/18","88765434356","330.000€","Veza",new Klub(6,"Orijent")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(28,63,new Igrac(65,"Dzemal","Ibishi","12001/01/18","88765434356","330.000€","Veza",new Klub(6,"Orijent")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(29,73,new Igrac(41,"Jakov","Biljan","1995/08/02","11030214931","52.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(30,89,new Igrac(66,"Emanuel","Črnko","1999/04/07","88876437463","90.000€","Napad",new Klub(6,"Orijent")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(5, "Jedanaesterac", (false))));
dogadjaji.add(new Dogadjaj(31,89,new Igrac(66,"Emanuel","Črnko","1999/04/07","88876437463","90.000€","Napad",new Klub(6,"Orijent")),new Utakmica(3,"Orijent","Vukovar 91","2022/10/22 15:00:00","3500","Krimeja"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(32,18,new Igrac(49,"Filip","Mekić","2002/09/13","78654987612","165.000€","Obrana",new Klub(5,"Dugopolje")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(33,37,new Igrac(53,"Filip","Ambroz","2003/12/01","36547812348","52.000€","Veza",new Klub(5,"Dugopolje")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(34,43,new Igrac(60,"Filip","Braut","2002/06/05","10293738384","210.000€","Sredina",new Klub(6,"Orijent")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(35,43,new Igrac(63,"Filip","Dujmović","2001/08/04","59822223146","540.000€","Sredina",new Klub(6,"Orijent")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(36,56,new Igrac(54,"Ivan","Rodić","1985/11/11","98372637451","52.000€","Veza",new Klub(5,"Dugopolje")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(37,61,new Igrac(55,"Carlos","Torres","2002/10/20","65648976123","53.000€","Napad",new Klub(5,"Dugopolje")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(38,69,new Igrac(63,"Filip","Dujmović","2001/08/04","59822223146","540.000€","Sredina",new Klub(6,"Orijent")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(39,86,new Igrac(48,"Roko","Kurtović","1999/01/24","12345643243","155.000€","Obrana",new Klub(5,"Dugopolje")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(40,86,new Igrac(52,"Marin","Ljubičić","1988/06/15","55464325789","135.000€","Sredina",new Klub(5,"Dugopolje")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(41,88,new Igrac(63,"Filip","Dujmović","2001/08/04","59822223146","540.000€","Sredina",new Klub(6,"Orijent")),new Utakmica(4,"Dugopolje","Orijent","2022/09/17 16:30:00","4000","Hrvatski Vitezovi"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(42,10,new Igrac(26,"Marijan","Oršolić","1998/04/07","48392859328","210.000€","Obrana",new Klub(3,"Cibalia")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(43,27,new Igrac(39,"Zinedin","Mustedanagić","1998/08/01","23987654962","210.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(44,27,new Igrac(42,"Robin","Ruiz","1998/11/26","86954328545","15.000€","Veza",new Klub(4,"Vukovar_91")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(45,46,new Igrac(43,"Vanja","Pelko","2002/03/25","52232320976","10.000€","Veza",new Klub(4,"Vukovar_91")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(46,60,new Igrac(31,"Edis","Smajić","1999/09/10","23459285412","240.000€","Veza",new Klub(3,"Cibalia")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(47,63,new Igrac(38,"Dominik","Mihaljević","1994/08/27","82837410499","205.000€","Obrana",new Klub(4,"Vukovar_91")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(48,65,new Igrac(41,"Jakov","Biljan","1995/08/02","11030214931","52.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(4, "Crveni Karton", (false))));
dogadjaji.add(new Dogadjaj(49,70,new Igrac(32,"Andrija","Bubnjar","1997/01/29","55569483431","140.000€","Veza",new Klub(3,"Cibalia")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(50,70,new Igrac(30,"Gerald","Diyoke","1996/03/11","84739956871","190.000€","Veza",new Klub(3,"Cibalia")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(51,71,new Igrac(33,"Ivan","Mihaljević","1999/06/29","65438596523","340.000€","Napad",new Klub(3,"Cibalia")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(5, "Jedanaesterac", (false))));
dogadjaji.add(new Dogadjaj(52,71,new Igrac(33,"Ivan","Mihaljević","1999/06/29","65438596523","340.000€","Napad",new Klub(3,"Cibalia")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(53,79,new Igrac(40,"Tomislav","Baltić","1992/10/13","79485420392","145.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(54,87,new Igrac(33,"Ivan","Mihaljević","1999/06/29","65438596523","340.000€","Napad",new Klub(3,"Cibalia")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(55,90,new Igrac(40,"Tomislav","Baltić","1992/10/13","79485420392","145.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(56,90,new Igrac(35,"Kristijan","Pavičić","1999/03/06","39215409652","10.000€","Obrana",new Klub(4,"Vukovar_91")),new Utakmica(5,"Vukovar 91","Cibalia","2022/11/19 13:30:00","1800","Gradski Stadion"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(57,18,new Igrac(19,"Ivan","Dominić","2003/01/07","98184533294","20.000€","Sredina",new Klub(2,"Solin")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(58,42,new Igrac(17,"Dino","Klarić","2002/04/06","99284571229","68.000€","Sredina",new Klub(2,"Solin")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(59,56,new Igrac(21,"Stephen","Chinedu","2000/01/06","19283754542","160.000€","Veza",new Klub(2,"Solin")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(60,56,new Igrac(22,"Sylvanus","Nimely","1998/09/04","13432948854","240.000€","Napad",new Klub(2,"Solin")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(61,76,new Igrac(21,"Stephen","Chinedu","2000/01/06","19283754542","160.000€","Veza",new Klub(2,"Solin")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(62,86,new Igrac(13,"Luka","Džaja","2001/02/01","22364715886","48.000€","Obrana",new Klub(2,"Solin")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(63,32,new Igrac(63,"Filip","Dujmović","2001/08/04","59822223146","540.000€","Sredina",new Klub(6,"Orijent")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(64,35,new Igrac(57,"Mario","Tadejević","1989/08/28","20594832345","52.000€","Obrana",new Klub(6,"Orijent")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(65,57,new Igrac(58,"Marko","Putnik","2001/02/27","98734632834","92.000€","Obrana",new Klub(6,"Orijent")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(66,70,new Igrac(59,"Ennio","Travaglia","1997/04/04","98765232345","24.000€","Obrana",new Klub(6,"Orijent")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(67,90,new Igrac(66,"Emanuel","Črnko","1999/04/07","88876437463","90.000€","Napad",new Klub(6,"Orijent")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(68,90,new Igrac(64,"Mateo","Monjac","1996/06/20","54121347867","275.000€","Veza",new Klub(6,"Orijent")),new Utakmica(6,"Solin","Orijent","2022/10/29 15:00:00","1500","Pokraj Jadra"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(69,15,new Igrac(5,"Festim","Shatri","2003/11/28","29385710023","52.000€","Obrana",new Klub(1,"Rudes")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(70,46,new Igrac(11,"Krešimir","Kovačević","1994/08/07","29385009945","260.000€","Napad",new Klub(1,"Rudes")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(71,78,new Igrac(9,"Tomislav","Gudelj","1998/05/01","90905715396","370.000€","Veza",new Klub(1,"Rudes")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(72,87,new Igrac(10,"Roko","Brajković","2003/07/13","11232715396","47.000€","Veza",new Klub(1,"Rudes")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(73,87,new Igrac(4,"Miguel","Campos","1996/08/19","29888715396","84.000€","Obrana",new Klub(1,"Rudes")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(74,88,new Igrac(8,"Aleksa","Latković","2000/10/30","29385715666","465.000€","Veza",new Klub(1,"Rudes")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(5, "Jedanaesterac", (false))));
dogadjaji.add(new Dogadjaj(75,88,new Igrac(8,"Aleksa","Latković","2000/10/30","29385715666","465.000€","Veza",new Klub(1,"Rudes")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(76,04,new Igrac(43,"Vanja","Pelko","2002/03/25","52232320976","10.000€","Veza",new Klub(4,"Vukovar_91")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(77,39,new Igrac(40,"Tomislav","Baltić","1992/10/13","79485420392","145.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(78,39,new Igrac(39,"Zinedin","Mustedanagić","1998/08/01","23987654962","210.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(79,49,new Igrac(39,"Zinedin","Mustedanagić","1998/08/01","23987654962","210.000€","Sredina",new Klub(4,"Vukovar_91")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(80,60,new Igrac(37,"Patrik","Periša","1996/03/25","84730294852","145.000€","Obrana",new Klub(4,"Vukovar_91")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(6, "Ozljeda", (false))));
dogadjaji.add(new Dogadjaj(81,60,new Igrac(37,"Patrik","Periša","1996/03/25","84730294852","145.000€","Obrana",new Klub(4,"Vukovar_91")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(82,89,new Igrac(42,"Robin","Ruiz","1998/11/26","86954328545","15.000€","Veza",new Klub(4,"Vukovar_91")),new Utakmica(7,"Vukovar","Rudeš","2022/10/08 15:00:00","1800","Gradski Stadion"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(83,02,new Igrac(55,"Carlos","Torres","2002/10/20","65648976123","53.000€","Napad",new Klub(5,"Dugopolje")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(84,10,new Igrac(50,"Dominik","Balić","1996/05/04","53535478612","105.000€","Sredina",new Klub(5,"Dugopolje")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(85,37,new Igrac(54,"Ivan","Rodić","1985/11/11","98372637451","52.000€","Veza",new Klub(5,"Dugopolje")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(4, "Crveni Karton", (false))));
dogadjaji.add(new Dogadjaj(86,61,new Igrac(51,"Mihael","Mlinarić","2000/01/16","87629365418","205.000€","Sredina",new Klub(5,"Dugopolje")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(87,61,new Igrac(55,"Carlos","Torres","2002/10/20","65648976123","53.000€","Napad",new Klub(5,"Dugopolje")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(88,73,new Igrac(51,"Mihael","Mlinarić","2000/01/16","87629365418","205.000€","Sredina",new Klub(5,"Dugopolje")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(89,81,new Igrac(55,"Carlos","Torres","2002/10/20","65648976123","53.000€","Napad",new Klub(5,"Dugopolje")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(90,57,new Igrac(18,"Duje","Ninčević","1997/05/03","51388394203","145.000€","Sredina",new Klub(2,"Solin")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(91,63,new Igrac(13,"Luka","Džaja","2001/02/01","22364715886","48.000€","Obrana",new Klub(2,"Solin")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(92,84,new Igrac(17,"Dino","Klarić","2002/04/06","99284571229","68.000€","Sredina",new Klub(2,"Solin")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(93,90,new Igrac(14,"Mateo","Tomić","1997/12/20","68463066721","94.000€","Obrana",new Klub(2,"Solin")),new Utakmica(8,"Dugopolje","Solin","2022/10/22 13:00:00","4000","Hrvatski Vitezovi"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(94,31,new Igrac(10,"Roko","Brajković","2003/07/13","11232715396","47.000€","Veza",new Klub(1,"Rudes")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(95,31,new Igrac(11,"Krešimir","Kovačević","1994/08/07","29385009945","260.000€","Napad",new Klub(1,"Rudes")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(96,51,new Igrac(10,"Roko","Brajković","2003/07/13","11232715396","47.000€","Veza",new Klub(1,"Rudes")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(97,76,new Igrac(10,"Roko","Brajković","2003/07/13","11232715396","47.000€","Veza",new Klub(1,"Rudes")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(7, "Gol", (true))));
dogadjaji.add(new Dogadjaj(98,76,new Igrac(9,"Tomislav","Gudelj","1998/05/01","90905715396","370.000€","Veza",new Klub(1,"Rudes")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(2, "Asistencija", (false))));
dogadjaji.add(new Dogadjaj(99,80,new Igrac(7,"Bruno","Brajković","2001/04/16","44385715292","435.000€","Sredina",new Klub(1,"Rudes")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(100,85,new Igrac(3,"Luka","Pavković","1993/02/18","34565715397","24.000€","Obrana",new Klub(1,"Rudes")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(101,44,new Igrac(33,"Ivan","Mihaljević","1999/06/29","65438596523","340.000€","Napad",new Klub(3,"Cibalia")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(3, "Žuti Karton", (false))));
dogadjaji.add(new Dogadjaj(102,57,new Igrac(31,"Edis","Smajić","1999/09/10","23459285412","240.000€","Veza",new Klub(3,"Cibalia")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(103,75,new Igrac(25,"Josip","Gačić","1998/03/02","99848329432","53.000€","Obrana",new Klub(3,"Cibalia")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(4, "Crveni Karton", (false))));
dogadjaji.add(new Dogadjaj(104,77,new Igrac(30,"Gerald","Diyoke","1996/03/11","84739956871","190.000€","Veza",new Klub(3,"Cibalia")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(1, "Izmjena", (false))));
dogadjaji.add(new Dogadjaj(105,83,new Igrac(29,"Karlo","Isasegi","2000/08/24","78434321965","185.000€","Veza",new Klub(3,"Cibalia")),new Utakmica(9,"Cibalia","Rudeš","2022/11/12 13:00:00","5000","HNK Cibalia"),new Vrsta(1, "Izmjena", (false))));	
		}

	

	private void brisanje() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE DOGAĐAJ KOJI ŽELITE OBRISATI: ", 1, dogadjaji.size());
		dogadjaji.remove(rb - 1);
		događajIzbornik();
	}

	private void izmjena() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE DOGAĐAJ KOJI ŽELITE PROMIJENITI: ", 1, dogadjaji.size());
		Dogadjaj d = dogadjaji.get(rb - 1);
		d.setSifra(Pomocno.unosBrojRaspon("Unesite novu sifru pod kojom će se događaj voditi:", 1, Integer.MAX_VALUE));
		d.setMinuta(Pomocno.unosBrojRaspon("Unesi minutu događaja: ", 1, 90));
		start.getUtakmice().pregled(false);
		int a = Pomocno.unosBrojRaspon("Unesite na koju utakmicu želite dodati novoi događaj: ", 1,
				start.getUtakmice().getUtakmice().size());
		d.setUtakmica(start.getUtakmice().getUtakmice().get(a - 1));
		start.getIgraci().pregled(false);
		int b = Pomocno.unosBrojRaspon("Unesite na kojeg igrača želite dodati novoi događaj: ", 1,
				start.getIgraci().getIgraci().size());
		d.setIgrac(start.getIgraci().getIgraci().get(b - 1));
		start.getVrste().pregled(false);
		int c = Pomocno.unosBrojRaspon("Unesite na koju vrstu želite dodati novoi događaj: ", 1,
				start.getVrste().getVrste().size());
		d.setVrsta(start.getVrste().getVrste().get(c - 1));
		dogadjaji.add(d);
		događajIzbornik();

		događajIzbornik();
	}

	public void pregled(boolean prikaziDogađajIzbornik) {
		System.out.println("");
		System.out.println("\nDOSTUPNI DOGAĐAJI: ");
		System.out.println("");
		int rb = 1;
		for (Dogadjaj d : dogadjaji) {
			System.out.println(rb++ + ". " + d);
		}
		System.out.println("");
		if (prikaziDogađajIzbornik) {
			događajIzbornik();
		}

	}

	private void unesiNoviDogadjaj() {
		Dogadjaj d = new Dogadjaj();
		d.setSifra(Pomocno.unosBrojRaspon("Unesi šifru događaja: ", 1, Integer.MAX_VALUE));
		d.setMinuta(Pomocno.unosBrojRaspon("Unesi minutu događaja: ", 1, 90));
		start.getUtakmice().pregled(false);
		int a = Pomocno.unosBrojRaspon("Unesite na koju utakmicu želite dodati novoi događaj: ", 1,
				start.getUtakmice().getUtakmice().size());
		d.setUtakmica(start.getUtakmice().getUtakmice().get(a - 1));
		start.getIgraci().pregled(false);
		int b = Pomocno.unosBrojRaspon("Unesite na kojeg igrača želite dodati novoi događaj: ", 1,
				start.getIgraci().getIgraci().size());
		d.setIgrac(start.getIgraci().getIgraci().get(b - 1));
		start.getVrste().pregled(false);
		int c = Pomocno.unosBrojRaspon("Unesite na koju vrstu želite dodati novoi događaj: ", 1,
				start.getVrste().getVrste().size());
		d.setVrsta(start.getVrste().getVrste().get(c - 1));
		dogadjaji.add(d);
		događajIzbornik();

	}

	public List<Dogadjaj> getDogadjaji() {
		return dogadjaji;
	}

	public void setDogadjaji(List<Dogadjaj> dogadjaji) {
		this.dogadjaji = dogadjaji;
	}

}
