package nogometnaStatistika01;

public class Vrsta extends Entitet {
	private String naziv;
	private boolean gol;

	public Vrsta() {
		super();
	}

	public Vrsta(int sifra, String naziv, boolean gol) {
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

	public boolean getGol() {
		return gol;
	}

	public void setGol(boolean gol) {
		this.gol = gol;
	}

	@Override
	public String toString() {
		return naziv;
	}

}
