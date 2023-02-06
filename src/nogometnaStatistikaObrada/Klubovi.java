package nogometnaStatistikaObrada;

import java.util.ArrayList;
import java.util.List;

import nogometnaStatistika01.Klub;

public class Klubovi {
	private List<Klub> klubovi;
	

	public Klubovi() {
		super();
		klubovi = new ArrayList<>();
	}

	public Klubovi(List<Klub> klubovi) {
		super();
		this.klubovi = klubovi;
	}

	public List<Klub> getKlubovi() {
		return klubovi;
	}

	public void setKlubovi(List<Klub> klubovi) {
		this.klubovi = klubovi;
	}
	

}
