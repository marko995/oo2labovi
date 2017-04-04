package Klase;

public class Konstanta extends Izraz {

	private final double konstanta;
	
	public Konstanta(double konstanta){
		this.konstanta = konstanta;
	}
	
	@Override
	public double izracunavanje_vrednosti_realnog_tipa() {
		return konstanta;
	}

	@Override
	public Izraz stvaranje_izraza_po_prvom_izvodu(Promenljiva diff) {
		return new Konstanta(0);
	}

	@Override
	public String toString() {
		return "" + konstanta;
	}

}
