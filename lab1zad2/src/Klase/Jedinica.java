package Klase;

import greske.*;

public class Jedinica {
	private String oznaka;
	
	public Jedinica(String oznaka) throws Greske {
		if(!dozvoljena_oznaka(oznaka)){
			throw new Greske(Greske.OZNAKA);
		}
		this.oznaka = oznaka;
	}
	
	
	private boolean dozvoljena_oznaka(String oznaka){
		if(oznaka.equals("kom") || oznaka.equals("l") || oznaka.equals("m") || oznaka.equals("kg")){
			return true;
		}
		
		return false;
	}
	
	public String dohvati_oznaku(){
		return oznaka;
	}
	
	public String toString(){
		return oznaka;
	}
}
