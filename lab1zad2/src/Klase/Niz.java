package Klase;

import greske.Greske;

public class Niz {
	private Zapis[] zapis;
	private int kapacitet;
	private int broj_artikala;
	public Niz(int kapacitet){
		broj_artikala = 0;
		this.kapacitet = kapacitet;
		zapis = new Zapis[ kapacitet ];
	}
	
	public void dodaj_u_niz(Zapis zapis){
		if(niz_pun()){
			prosiri_niz();
		}
		this.zapis[ broj_artikala++ ] = zapis;
	}
	
	public Zapis dohvati_zapis(int index) throws Greske {
		if(index >= broj_artikala) throw new Greske(Greske.INDEKS_NE_POSTOJI);
		
		return zapis[index];
	}
	
	/////////////////////////////////////////////////////////////////////////
	//realloc niza zapis
	public void prosiri_niz(){
		int novi_kapacitet = kapacitet / 10  > 5 ? kapacitet + kapacitet / 10 : kapacitet + 5;
		Zapis[] zapis_pomocna = new Zapis[ novi_kapacitet ];
		for(int i = 0; i < kapacitet; i++){
			zapis_pomocna[i] = zapis[i];
		}
		kapacitet = novi_kapacitet;
		zapis = zapis_pomocna;
	}
	
	public boolean niz_pun(){
		return kapacitet == broj_artikala;
	}
	public int dohvati_broj_elemenata(){
		return broj_artikala;
	}
	
	public String toString(){
		String s = "";
		for(int i = 0; i < broj_artikala; i++){
			s += zapis[i].toString() + "\n";
		}
		return s;
	}
	
}
