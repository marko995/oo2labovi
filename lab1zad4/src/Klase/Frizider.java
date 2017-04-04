package Klase;

import Greske.Greske;

public class Frizider {
	
	private Sastojak[] sastojci;
	private int duzina;
	private int napunjeno;
	
	public Frizider(int duzina){
		sastojci = new Sastojak[duzina];
		napunjeno = 0;
		this.duzina = duzina;
	}
	
	public Frizider dodaj_sastojak(Sastojak sastojak) throws Greske{
		if(duzina == napunjeno) throw new Greske(Greske.KAPACITET_SASTOJAKA_U_FRIZIDERU);
		sastojci[napunjeno++] = sastojak;
		return this;
	}
	public Sastojak uzmi_sastojak(int indeks) throws Greske{
		if(indeks > napunjeno - 1) throw new Greske(Greske.NEPOSTOJACI_INDEKS);
		
		Sastojak sastojak = sastojci[indeks];
		
		for(int i = indeks; i < napunjeno-1; i++){
			sastojci[i] = sastojci[i+1];
		}
		napunjeno--;
		return sastojak;
		
	}
	
	public double ukupna_cena(){
		double cena = 0;
		for(int i = 0; i < napunjeno; i++){
			cena += sastojci[i].ukupna_cena();
		}
		return cena;
	}
	public double ukupno_kalorija(){
		double kalorija = 0;
		for(int i = 0; i < napunjeno; i++){
			kalorija += sastojci[i].kalorijska_vrednost();
		}
		return kalorija;
	}
	
}
