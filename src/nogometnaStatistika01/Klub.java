package nogometnaStatistika01;

public class Klub extends Entitet {
	private String naziv;

	public Klub() {
		super();
	}

	public Klub(int sifra, String naziv) {
		super(sifra);
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "⚽" + naziv;
	}
	

}

