package klase;

import greske.Niz_greske;

public final class Niz {
	private int kapacitet;
	private int broj_predmeta;
	private Predmet[] niz;
	public Niz(int kapacitet){
		this.kapacitet = kapacitet;
		niz = new Predmet[kapacitet];
		broj_predmeta = 0;
	}
	
	public void niz_ubaci(Predmet stvar) throws Niz_greske {
		
		if(niz_pun()){
			throw new Niz_greske(Niz_greske.PUN);
		}
		int pozicija = broj_predmeta;
		double mera = stvar.realna_velicina();
		////////////////////////////////////////////////////////
		// for kraja i ide u nazad, tazi poziciju gde da se uglavi
		for(int i = broj_predmeta; i < 0; i--){
			if(mera < niz[i-1].realna_velicina()){
				niz[i] = niz[i-1];
				pozicija--;
			} else {
				break;
			}
		}
		broj_predmeta++;
		niz[pozicija] = stvar;
	}
	
	
	public Predmet niz_dohvati(int index) throws Niz_greske {

		if(niz_prazan()){
			throw new Niz_greske(Niz_greske.PRAZAN);
		}
		
		if(index >= broj_predmeta){
			throw new Niz_greske(Niz_greske.NEPOSTOJECI_INDEKS);
		}
		
		Predmet m = niz[index];
		
		//////////////////////////////////////////////////////////////
		//brise element iz niza, tacnije prebacuje sledeci element u trenutni
		for(int i = index; i < broj_predmeta - 1; i++){
			niz[i] = niz[i+1];
		}
		broj_predmeta--;
		
		return m;
	}
	
	
	private boolean niz_prazan(){
		return broj_predmeta == 0;
	}
	
	private boolean niz_pun(){
		return broj_predmeta == kapacitet;
	}
	
	public int Broj_predmeta(){
		return broj_predmeta;
	}
	
	public double Ukupna_kolicina(){
		
		if(niz_prazan()) return 0.0;
		double ukupno = 0;
		
		for(int i = 0; i < broj_predmeta; i++){
			ukupno += niz[i].realna_velicina();
		}
		
		return ukupno;
	}
	
	public String toString(){
		if(niz_prazan()) return "Niz je prazan";
		
		String poruka = "";
		
		for(int i = 0; i < broj_predmeta; i++){
			poruka += i + ") " + niz[i].toString() + " "+ niz[i].realna_velicina() + "\n";
		}
		
		
		return poruka;
	}
	
}
