package nogometnaStatistika01;





public class Dogadjaj extends Entitet{
	private int minuta;
	private Igrac igrac;
	private Utakmica utakmica;
	private Vrsta vrsta;

	public Dogadjaj() {
		super();
	
	}

	public Dogadjaj(int sifra, int minuta, Igrac igrac, Utakmica utakmica, Vrsta vrsta) {
		super(sifra);
		this.minuta = minuta;
		this.igrac = igrac;
		this.utakmica = utakmica;
		this.vrsta = vrsta;
	}

	public int getMinuta() {
		return minuta;
	}

	public void setMinuta(int minuta) {
		this.minuta = minuta;
	}

	public Igrac getIgrac() {
		return igrac;
	}

	public void setIgrac(Igrac igrac) {
		this.igrac = igrac;
	}

	public Utakmica getUtakmica() {
		return utakmica;
	}

	public void setUtakmica(Utakmica utakmica) {
		this.utakmica = utakmica;
	}

	public Vrsta getVrsta() {
		return vrsta;
	}

	public void setVrsta(Vrsta vrsta) {
		this.vrsta = vrsta;
	}

	@Override
	public String toString() {
		return "~"+"Igrač"+"~"+"("+igrac +")"+"~"+"Utakmica"+"~"+"("+ utakmica +")"+"~"+"Događaj"+"~"+"("+ vrsta +")"+"~"+"Minut"+"~"+"("+ minuta +"'"+")";
	}

}
