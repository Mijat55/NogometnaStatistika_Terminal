package nogometnaStatistika01;





public class Utakmica extends Entitet {
	private String domaciKlub;
	private String gostiKlub;
	private String vrijemePocetka;
	private String maksimalanBrojNavijaca;
	private String stadion;

	public Utakmica() {
		super();
	}

	public Utakmica(int sifra, String domaciKlub, String gostiKlub, String vrijemePocetka, String maksimalanBrojNavijaca,
			String stadion) {
		super(sifra);
		this.domaciKlub = domaciKlub;
		this.gostiKlub = gostiKlub;
		this.vrijemePocetka = vrijemePocetka;
		this.maksimalanBrojNavijaca = maksimalanBrojNavijaca;
		this.stadion = stadion;
	}

	public String getDomaciKlub() {
		return domaciKlub;
	}

	public void setDomaciKlub(String domaciKlub) {
		this.domaciKlub = domaciKlub;
	}

	public String getGostiKlub() {
		return gostiKlub;
	}

	public void setGostiKlub(String gostiKlub) {
		this.gostiKlub = gostiKlub;
	}

	public String getVrijemePocetka() {
		return vrijemePocetka;
	}

	public void setVrijemePocetka(String vrijemePocetka) {
		this.vrijemePocetka = vrijemePocetka;
	}

	public String getMaksimalanBrojNavijaca() {
		return maksimalanBrojNavijaca;
	}

	public void setMaksimalanBrojNavijaca(String maksimalanBrojNavijaca) {
		this.maksimalanBrojNavijaca = maksimalanBrojNavijaca;
	}

	public String getStadion() {
		return stadion;
	}

	public void setStadion(String stadion) {
		this.stadion = stadion;
	}

	@Override
	public String toString() {
		return "⚽"+domaciKlub +" "+"vs"+" "+ "⚽"+gostiKlub +" "+ "*"+vrijemePocetka +"*";
	}
	

}
