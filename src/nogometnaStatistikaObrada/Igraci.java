package nogometnaStatistikaObrada;


import java.util.ArrayList;

import java.util.List;

import nogometnaStatistika.Pomocno;
import nogometnaStatistika.Start;
import nogometnaStatistika01.Igrac;
import nogometnaStatistika01.Klub;

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
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("       " + "*Igrač*");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1) Pregled igrača-");
		System.out.println("2) Unos novoga igrača-");
		System.out.println("3) Izmjena igrača-");
		System.out.println("4) Brisanje igrača-");
		System.out.println("5) Povratak u glavni izbornik-");
		odabirIgračaIzbornik();
	}

	private void odabirIgračaIzbornik() {
		switch (Pomocno.unosBrojRaspon("ODABRANA OPCIJA: ", 1, 5)) {
		case 1:
			pregled(true);
			break;
		case 2:
			unesiNovogIgraca();
			break;
		case 3:
			if (igraci.size() == 0) {
				System.out.println("Nema igrača koje " + "bi mjenjali!");
				igračIzbornik();
			} else {
				izmjena();
			}
		case 4:
			if (igraci.size() == 0) {
				System.out.println("Nema igrača " + "kojeg " + "bi brisali!");
				igračIzbornik();
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
		
			
igraci.add(new Igrac(1,"Karlo","Kralj","2001/06/16","29385715396","49.000€","Golman",new Klub(1,"Rudes")));
igraci.add(new Igrac(2,"Antonio","Boršić","1995/09/19","29382997391","310.000€","Obrana",new Klub(1,"Rudes")));
igraci.add(new Igrac(3,"Luka","Pavković","1993/02/18","34565715397","24.000€","Obrana",new Klub(1,"Rudes")));
igraci.add(new Igrac(4,"Miguel","Campos","1996/08/19","29888715396","84.000€","Obrana",new Klub(1,"Rudes")));
igraci.add(new Igrac(5,"Festim","Shatri","2003/11/28","29385710023","52.000€","Obrana",new Klub(1,"Rudes")));
igraci.add(new Igrac(6,"Tomislav","Srbljinović","1999/12/27","69385715377","270.000€","Sredina",new Klub(1,"Rudes")));
igraci.add(new Igrac(7,"Bruno","Brajković","2001/04/16","44385715292","435.000€","Sredina",new Klub(1,"Rudes")));
igraci.add(new Igrac(8,"Aleksa","Latković","2000/10/30","29385715666","465.000€","Veza",new Klub(1,"Rudes")));
igraci.add(new Igrac(9,"Tomislav","Gudelj","1998/05/01","90905715396","370.000€","Veza",new Klub(1,"Rudes")));
igraci.add(new Igrac(10,"Roko","Brajković","2003/07/13","11232715396","47.000€","Veza",new Klub(1,"Rudes")));
igraci.add(new Igrac(11,"Krešimir","Kovačević","1994/08/07","29385009945","260.000€","Napad",new Klub(1,"Rudes")));
igraci.add(new Igrac(12,"Ante","Topić","1990/01/07","89385714444","73.000€","Golman",new Klub(2,"Solin")));
igraci.add(new Igrac(13,"Luka","Džaja","2001/02/01","22364715886","48.000€","Obrana",new Klub(2,"Solin")));
igraci.add(new Igrac(14,"Mateo","Tomić","1997/12/20","68463066721","94.000€","Obrana",new Klub(2,"Solin")));
igraci.add(new Igrac(15,"Marko","Novak","2003/06/13","66943050222","145.000€","Obrana",new Klub(2,"Solin")));
igraci.add(new Igrac(16,"Rokas","Pukstas","2004/08/25","22958398753","580.000€","Sredina",new Klub(2,"Solin")));
igraci.add(new Igrac(17,"Dino","Klarić","2002/04/06","99284571229","68.000€","Sredina",new Klub(2,"Solin")));
igraci.add(new Igrac(18,"Duje","Ninčević","1997/05/03","51388394203","145.000€","Sredina",new Klub(2,"Solin")));
igraci.add(new Igrac(19,"Ivan","Dominić","2003/01/07","98184533294","20.000€","Sredina",new Klub(2,"Solin")));
igraci.add(new Igrac(20,"Ivan","Markota","1998/12/06","65969432001","155.000€","Veza",new Klub(2,"Solin")));
igraci.add(new Igrac(21,"Stephen","Chinedu","2000/01/06","19283754542","160.000€","Veza",new Klub(2,"Solin")));
igraci.add(new Igrac(22,"Sylvanus","Nimely","1998/09/04","13432948854","240.000€","Napad",new Klub(2,"Solin")));
igraci.add(new Igrac(23,"Filip","Kovačević","2002/03/22","54583499231","115.000€","Golman",new Klub(3,"Cibalia")));
igraci.add(new Igrac(24,"Bruno","Unušić","2002/02/09","22943958441","155.000€","Obrana",new Klub(3,"Cibalia")));
igraci.add(new Igrac(25,"Josip","Gačić","1998/03/02","99848329432","53.000€","Obrana",new Klub(3,"Cibalia")));
igraci.add(new Igrac(26,"Marijan","Oršolić","1998/04/07","48392859328","210.000€","Obrana",new Klub(3,"Cibalia")));
igraci.add(new Igrac(27,"Dario","Rugašević","1991/01/29","11929382213","145.000€","Obrana",new Klub(3,"Cibalia")));
igraci.add(new Igrac(28,"Simun","Mikolčić","2004/01/24","38594304954","105.000€","Sredina",new Klub(3,"Cibalia")));
igraci.add(new Igrac(29,"Karlo","Isasegi","2000/08/24","78434321965","185.000€","Veza",new Klub(3,"Cibalia")));
igraci.add(new Igrac(30,"Gerald","Diyoke","1996/03/11","84739956871","190.000€","Veza",new Klub(3,"Cibalia")));
igraci.add(new Igrac(31,"Edis","Smajić","1999/09/10","23459285412","240.000€","Veza",new Klub(3,"Cibalia")));
igraci.add(new Igrac(32,"Andrija","Bubnjar","1997/01/29","55569483431","140.000€","Veza",new Klub(3,"Cibalia")));
igraci.add(new Igrac(33,"Ivan","Mihaljević","1999/06/29","65438596523","340.000€","Napad",new Klub(3,"Cibalia")));
igraci.add(new Igrac(34,"Franko","Kolić","2003/02/07","39483234565","180.000€","Golman",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(35,"Kristijan","Pavičić","1999/03/06","39215409652","10.000€","Obrana",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(36,"Tino","Jukić","2001/10/10","55496584324","15.000€","Obrana",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(37,"Patrik","Periša","1996/03/25","84730294852","145.000€","Obrana",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(38,"Dominik","Mihaljević","1994/08/27","82837410499","205.000€","Obrana",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(39,"Zinedin","Mustedanagić","1998/08/01","23987654962","210.000€","Sredina",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(40,"Tomislav","Baltić","1992/10/13","79485420392","145.000€","Sredina",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(41,"Jakov","Biljan","1995/08/02","11030214931","52.000€","Sredina",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(42,"Robin","Ruiz","1998/11/26","86954328545","15.000€","Veza",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(43,"Vanja","Pelko","2002/03/25","52232320976","10.000€","Veza",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(44,"Josip","Barišić","1986/11/14","34890984321","210.000€","Napad",new Klub(4,"Vukovar_91")));
igraci.add(new Igrac(45,"Toni","Silić","2004/05/07","93847562834","105.000€","Golman",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(46,"Gregor","Gulisija","2002/01/04","87654329123","52.000€","Obrana",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(47,"Igor","Cerina","1988/09/30","54546787569","140.000€","Obrana",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(48,"Roko","Kurtović","1999/01/24","12345643243","155.000€","Obrana",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(49,"Filip","Mekić","2002/09/13","78654987612","165.000€","Obrana",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(50,"Dominik","Balić","1996/05/04","53535478612","105.000€","Sredina",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(51,"Mihael","Mlinarić","2000/01/16","87629365418","205.000€","Sredina",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(52,"Marin","Ljubičić","1988/06/15","55464325789","135.000€","Sredina",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(53,"Filip","Ambroz","2003/12/01","36547812348","52.000€","Veza",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(54,"Ivan","Rodić","1985/11/11","98372637451","52.000€","Veza",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(55,"Carlos","Torres","2002/10/20","65648976123","53.000€","Napad",new Klub(5,"Dugopolje")));
igraci.add(new Igrac(56,"Mislav","Zadro","2003/04/22","48394857234","270.000€","Golman",new Klub(6,"Orijent")));
igraci.add(new Igrac(57,"Mario","Tadejević","1989/08/28","20594832345","52.000€","Obrana",new Klub(6,"Orijent")));
igraci.add(new Igrac(58,"Marko","Putnik","2001/02/27","98734632834","92.000€","Obrana",new Klub(6,"Orijent")));
igraci.add(new Igrac(59,"Ennio","Travaglia","1997/04/04","98765232345","24.000€","Obrana",new Klub(6,"Orijent")));
igraci.add(new Igrac(60,"Filip","Braut","2002/06/05","10293738384","210.000€","Sredina",new Klub(6,"Orijent")));
igraci.add(new Igrac(61,"Marijan","Jukičić","1999/06/22","87643090432","52.000€","Sredina",new Klub(6,"Orijent")));
igraci.add(new Igrac(62,"Nino","Mohorovičić","2000/04/25","98794638111","215.000€","Sredina",new Klub(6,"Orijent")));
igraci.add(new Igrac(63,"Filip","Dujmović","2001/08/04","59822223146","540.000€","Sredina",new Klub(6,"Orijent")));
igraci.add(new Igrac(64,"Mateo","Monjac","1996/06/20","54121347867","275.000€","Veza",new Klub(6,"Orijent")));
igraci.add(new Igrac(65,"Dzemal","Ibishi","12001/01/18","88765434356","330.000€","Veza",new Klub(6,"Orijent")));
igraci.add(new Igrac(66,"Emanuel","Črnko","1999/04/07","88876437463","90.000€","Napad",new Klub(6,"Orijent")));

		}
	

	private void brisanje() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE KLUB KOJI ŽELITE OBRISATI: ", 1, igraci.size());
		igraci.remove(rb - 1);
		igračIzbornik();
	}

	private void izmjena() {
		pregled(false);
		int rb = Pomocno.unosBrojRaspon("ODABERITE IGRAČA KOJEG ŽELITE PROMIJENITI: ", 1, igraci.size());
		Igrac i = igraci.get(rb - 1);
		i.setSifra(Pomocno.unosBrojRaspon("Unesite novu sifru pod kojom će se igrač voditi:", 1, Integer.MAX_VALUE));
		i.setIme(Pomocno.unosTeksta("Unesi novo ime igrača: "));
		i.setPrezime(Pomocno.unosTeksta("Unesi novo prezime igrača: "));
		i.setDatumRodjenja(Pomocno.unosTeksta("Unesi novi datum rođenja igrača: "));
		i.setOib(Pomocno.unosTeksta("Unesi novi oib igrača: "));
		i.setPozicija(Pomocno.unosTeksta("Unesi novu poziciju igrača: "));
		i.setTrenutnaVrijednost(Pomocno.unosTeksta("Unesi novu vrijednost igrača: "));
		start.getKlubovi().pregled(false);
		int a = Pomocno.unosBrojRaspon("Unesite na koji klub želite dodati izmjenjenog igrača: ", 1,
				start.getKlubovi().getKlubovi().size());
		i.setKlub(start.getKlubovi().getKlubovi().get(a - 1));
		igraci.add(i);
		igračIzbornik();

	}

	private void unesiNovogIgraca() {
		Igrac i = new Igrac();
		i.setSifra(Pomocno.unosBrojRaspon("Unesi šifru igrača: ", 1, Integer.MAX_VALUE));
		i.setIme(Pomocno.unosTeksta("Unesi ime igrača: "));
		i.setPrezime(Pomocno.unosTeksta("Unesi prezime igrača: "));
		i.setDatumRodjenja(Pomocno.unosTeksta("Unesi datum rođenja igrača: "));
		i.setOib(Pomocno.unosTeksta("Unesi oib igrača: "));
		i.setPozicija(Pomocno.unosTeksta("Unesi poziciju igrača: "));
		i.setTrenutnaVrijednost(Pomocno.unosTeksta("Unesi trenutnu vrijednost igrača"));
		start.getKlubovi().pregled(false);
		int a = Pomocno.unosBrojRaspon("Unesite na koji klub želite dodati novog igrača: ", 1,
				start.getKlubovi().getKlubovi().size());
		i.setKlub(start.getKlubovi().getKlubovi().get(a - 1));
		igraci.add(i);
		igračIzbornik();
	}

	public void pregled(boolean prikaziIgračIzbornik) {
		System.out.println("");
		System.out.println("\nDOSTUPNI IGRAČI: ");
		System.out.println("");
		int rb = 1;
		for (Igrac i : igraci) {
			System.out.println(rb++ + ". " + i);
		}
		System.out.println("---------");
		if (prikaziIgračIzbornik) {
			igračIzbornik();
		}

	}

	public List<Igrac> getIgraci() {
		return igraci;
	}

	public void setIgraci(List<Igrac> igraci) {
		this.igraci = igraci;
	}

}
