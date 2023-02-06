package nogometnaStatistikaObrada;

import java.util.ArrayList;
import java.util.List;

import nogometnaStatistika01.Igrac;

public class Igraci {
	private List<Igrac> igraci;
	

	public Igraci() {
		super();
		igraci = new ArrayList<>();
	}

	public Igraci(List<Igrac> igraci) {
		super();
		this.igraci = igraci;
	}

	public List<Igrac> getIgraci() {
		return igraci;
	}

	public void setIgraci(List<Igrac> igraci) {
		this.igraci = igraci;
	}
	
	

}
