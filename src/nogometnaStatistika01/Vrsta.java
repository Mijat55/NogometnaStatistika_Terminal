package nogometnaStatistika01;

public class Vrsta extends Entitet {
	private String naziv;
	private int gol;

	public Vrsta() {
		super();
	}

	public Vrsta(int sifra, String naziv, int gol) {
		super(sifra);
		this.naziv = naziv;
		this.gol = gol;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGol() {
		return gol;
	}

	public void setGol(int gol) {
		this.gol = gol;
	}

}
