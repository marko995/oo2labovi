package Klase;

import greske.Greske;

abstract class Artikal {
	private String naziv;
	private Jedinica jedinica;
	public Artikal(String naziv, String oznaka) throws Greske {
		jedinica = new Jedinica(oznaka);
		this.naziv = naziv;
	}
	
	public boolean jednaki_Artikli(Artikal a){
		if(naziv.equals(a.dohvati_naziv()))
			return true;
		
		return false;
	}
	
	public String toString(){
		return naziv;
	}
	
	public String dohvati_naziv(){
		return naziv;
	}
	public Jedinica dohvati_jedinicu(){
		return jedinica;
	}
}
