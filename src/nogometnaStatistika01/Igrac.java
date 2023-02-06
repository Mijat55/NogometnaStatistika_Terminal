package nogometnaStatistika01;

import java.util.Date;

public class Igrac extends Entitet{
	private String ime;
	private String prezime;
	private Date datumRodjenja;
	private int oib;
	private double trenutnaVrijednost;
	private String pozicija;
	private Klub klub;

	public Igrac() {
		//Lista za igrace??
		super();
	}

	public Igrac(int sifra, String ime, String prezime, Date datumRodjenja, int oib, double trenutnaVrijednost,
			String pozicija, Klub klub) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.oib = oib;
		this.trenutnaVrijednost = trenutnaVrijednost;
		this.pozicija = pozicija;
		this.klub = klub;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Date getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public int getOib() {
		return oib;
	}

	public void setOib(int oib) {
		this.oib = oib;
	}

	public double getTrenutnaVrijednost() {
		return trenutnaVrijednost;
	}

	public void setTrenutnaVrijednost(double trenutnaVrijednost) {
		this.trenutnaVrijednost = trenutnaVrijednost;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public Klub getKlub() {
		return klub;
	}

	public void setKlub(Klub klub) {
		this.klub = klub;
	}

}



