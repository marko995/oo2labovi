package Klase;

import greske.Greske;

public class Skladiste {

	private Niz niz;
	private String adresa, naziv;
	
	public Skladiste(String adresa, String naziv){
		this.adresa = adresa;
		this.naziv = naziv;
		
		niz = new Niz(5);
	}
	
	public void dodaj_zapis(Zapis zapis) throws Greske {
		boolean postoji_zapis = false;
		for(int i = 0; i < niz.dohvati_broj_elemenata(); i++){
			if(niz.dohvati_zapis(i).dokvati_artikal().jednaki_Artikli(zapis.dokvati_artikal())){
				postoji_zapis = true;
				break;
			}
		}
		if(postoji_zapis) throw new Greske(Greske.ZAPIS_POSTOJI);
		niz.dodaj_u_niz(zapis);
	}
	
	public Zapis dohvati_zapis_po_nazivu_artikla(String naziv) throws Greske{
		boolean postoji_zapis = false;
		Zapis zapis_pomocna = null;
		for(int i = 0; i < niz.dohvati_broj_elemenata(); i++){
			if(niz.dohvati_zapis(i).dokvati_artikal().dohvati_naziv().equals(naziv)){
				postoji_zapis = true;
				zapis_pomocna = niz.dohvati_zapis(i);
				break;
			}
		}
		if(! postoji_zapis){
			throw new Greske(Greske.ZAPIS_NE_POSTOJI);
		}
		
		return zapis_pomocna;
	}
	
	public double ukupna_vrednost() throws Greske{
		double pomocna = 0;
		for(int i = 0; i < niz.dohvati_broj_elemenata(); i++){
			pomocna += niz.dohvati_zapis(i).vrednost();
		}
		return pomocna;
	}
	
}
