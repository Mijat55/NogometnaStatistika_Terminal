package nogometnaStatistikaObrada;

import java.util.ArrayList;
import java.util.List;

import nogometnaStatistika.Start;
import nogometnaStatistika01.Utakmica;

public class Utakmice {
	private List<Utakmica> utakmice;

	
	public Utakmice() {
		super();
		utakmice = new ArrayList<>();
	}
	public List<Utakmica> getUtakmice() {
		return utakmice;
	}
	public void setUtakmice(List<Utakmica> utakmice) {
		this.utakmice = utakmice;
	}
	public Utakmice(List<Utakmica> utakmice) {
		super();
		this.utakmice = utakmice;
	}

}
