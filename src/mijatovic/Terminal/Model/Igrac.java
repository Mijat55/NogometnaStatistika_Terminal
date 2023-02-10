package mijatovic.Terminal.Model;




public class Igrac extends Entitet{
	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String oib;
	private String trenutnaVrijednost;
	private String pozicija;
	private Klub klub;

	public Igrac() {
		super();
	
		
		
	}

	public Igrac(int sifra, String ime, String prezime, String datumRodjenja, String oib, String trenutnaVrijednost,
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

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}

	public String getTrenutnaVrijednost() {
		return trenutnaVrijednost;
	}

	public void setTrenutnaVrijednost(String trenutnaVrijednost) {
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

	@Override
	public String toString() {
		return ime +" "+ prezime +" "+datumRodjenja +" "+ trenutnaVrijednost +" "+ pozicija +" "+klub ;
	}
	

}



