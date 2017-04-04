package Klase;

public class Promenljiva extends Izraz{

	private char ime;
	private double realna_vrednost = 0;
	
	public Promenljiva(char ime) {
		this.ime = ime;
	}
	public Promenljiva(char ime, double realna_vrednost) {
		this.ime = ime;
		this.realna_vrednost = realna_vrednost;
	}
	public char dohvati_ime(){
		return ime;
	}
	public void promeni_realnu_vrednost(double realna_vrednost){
		this.realna_vrednost = realna_vrednost;
	}
	@Override
	public double izracunavanje_vrednosti_realnog_tipa() {
		return realna_vrednost;
	}

	@Override
	public Izraz stvaranje_izraza_po_prvom_izvodu(Promenljiva diff) {
		if(diff.ime == ime){
			return new Konstanta(1);
		}
		return new Konstanta(0);
	}

	@Override
	public String toString() {
		return "" + ime;
	}

}
