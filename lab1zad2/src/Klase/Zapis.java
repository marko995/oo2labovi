package Klase;

public class Zapis implements Vrednost {

	private Artikal artikal;
	private int kolicina;
	private double cena_po_komadu;
	
	public Zapis(Artikal artikal, int kolicina, int cena_po_komadu){
		this.artikal = artikal;
		this.kolicina = kolicina;
		this.cena_po_komadu = cena_po_komadu;
	}
	
	public Artikal dokvati_artikal(){
		return artikal;
	}
	public int dohvati_kolicnu(){
		return kolicina;
	}
	public double dohvati_cenu_po_komadu(){
		return cena_po_komadu;
	}
	
	public void promeni_kolicinu(int kolicina){
		this.kolicina = kolicina;
	}
	public void promeni_cenu_po_komadu(double cena_po_komadu){
		this.cena_po_komadu = cena_po_komadu;
	}
	
	@Override
	public double vrednost() {
		return kolicina*cena_po_komadu;
	}

	public String toString(){
		return artikal.toString() + " " + kolicina + " " + artikal.dohvati_jedinicu() + " " + cena_po_komadu + " " + vrednost();
	}
}
