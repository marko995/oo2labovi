package Klase;

import Greske.Greske;
public abstract class Sastojak implements Cloneable {
	
	private class Opis {
		Jedinjenje jedinjenje;
		int procenat;
		Opis(Jedinjenje jedinjenje, int procenat){
			this.jedinjenje = jedinjenje;
			this.procenat = procenat;
		}
	}
	
	private String ime;
	private Opis[] opis;
	private int duzina;
	private int napunjeno;
	private double kolicina;
	private String jedinica_mere;
	private double cena_jedinicne_kolicine;
	private int kalorijska_vrednost_jedinicne_kolicine;
	public Sastojak(String ime, int duzina, double kolicina, String jedinica_mere,
			double cena_jedinicne_kolicine, int kalorijska_vrednost_jedinicne_kolicine) {
		this.ime = ime;
		this.opis = new Opis[duzina];
		this.duzina = duzina;
		this.kolicina = kolicina;
		this.jedinica_mere = jedinica_mere;
		this.cena_jedinicne_kolicine = cena_jedinicne_kolicine;
		this.kalorijska_vrednost_jedinicne_kolicine = kalorijska_vrednost_jedinicne_kolicine;
		napunjeno = 0;
	}
	
	public double ukupna_cena(){
		return kolicina * cena_jedinicne_kolicine;
	}
	public double kalorijska_vrednost(){
		return kolicina * kalorijska_vrednost_jedinicne_kolicine;
	}
	public String dohvati_jedinicu_mere(){
		return jedinica_mere;
	}
	public Sastojak dodaj_jedinjenje(Jedinjenje jedinjenje, int procenat) throws Greske{
		if(napunjeno == duzina) throw new Greske(Greske.KAPACITET_OPISA_SASTOJKA);
		this.opis[napunjeno++] = new Opis(jedinjenje, procenat);
		return this;
	}
	
//	public Sastojak clone() throws CloneNotSupportedException{
//		Sastojak sastojak = (Sastojak) super.clone();
//		
//		return sastojak;
//	}
	
	
	
	public Sastojak napravi_kopiju() {
		Sastojak sastojak;
		try {
			sastojak = (Sastojak) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Doslo je do greske prilikom kopiranja.");
			return null;
		}
		
		sastojak.duzina = duzina;
		sastojak.cena_jedinicne_kolicine = cena_jedinicne_kolicine;
		sastojak.ime = new String(ime);
		sastojak.jedinica_mere = new String(jedinica_mere);
		sastojak.kolicina = kolicina;
		sastojak.kalorijska_vrednost_jedinicne_kolicine = kalorijska_vrednost_jedinicne_kolicine;
		sastojak.opis = new Opis[duzina];
		sastojak.napunjeno = napunjeno;
		
		for(int i = 0; i < napunjeno; i++){
			sastojak.opis[i].jedinjenje = opis[i].jedinjenje;
			sastojak.opis[i].procenat = opis[i].procenat;
		}
		
		return sastojak;
	}
	
	public String toString(){
		return ime + " " + kolicina + " "+ jedinica_mere + " " + cena_jedinicne_kolicine + " " + kalorijska_vrednost_jedinicne_kolicine;
	}
	
}
