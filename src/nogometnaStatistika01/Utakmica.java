package nogometnaStatistika01;

import java.util.Date;



public class Utakmica extends Entitet {
	private Entitet domaciKlub;
	private Entitet gostiKlub;
	private Date vrijemePocetka;
	private int maksimalanBrojNavijaca;
	private String stadion;

	public Utakmica() {
		super();
	}

	public Utakmica(int sifra, Entitet domaciKlub, Entitet gostiKlub, Date vrijemePocetka, int maksimalanBrojNavijaca,
			String stadion) {
		super(sifra);
		this.domaciKlub = domaciKlub;
		this.gostiKlub = gostiKlub;
		this.vrijemePocetka = vrijemePocetka;
		this.maksimalanBrojNavijaca = maksimalanBrojNavijaca;
		this.stadion = stadion;
	}

	public Entitet getDomaciKlub() {
		return domaciKlub;
	}

	public void setDomaciKlub(Entitet domaciKlub) {
		this.domaciKlub = domaciKlub;
	}

	public Entitet getGostiKlub() {
		return gostiKlub;
	}

	public void setGostiKlub(Entitet gostiKlub) {
		this.gostiKlub = gostiKlub;
	}

	public Date getVrijemePocetka() {
		return vrijemePocetka;
	}

	public void setVrijemePocetka(Date vrijemePocetka) {
		this.vrijemePocetka = vrijemePocetka;
	}

	public int getMaksimalanBrojNavijaca() {
		return maksimalanBrojNavijaca;
	}

	public void setMaksimalanBrojNavijaca(int maksimalanBrojNavijaca) {
		this.maksimalanBrojNavijaca = maksimalanBrojNavijaca;
	}

	public String getStadion() {
		return stadion;
	}

	public void setStadion(String stadion) {
		this.stadion = stadion;
	}

}
