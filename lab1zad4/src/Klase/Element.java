package Klase;

public class Element {
	
	private int redni_broj;
	private String simbol;
	
	public Element(int redni_broj, String simbol){
		this.redni_broj = redni_broj;
		this.simbol = simbol;
	}
	public int getRedni_broj() {
		return redni_broj;
	}

	public String getSimbol() {
		return simbol;
	}

	public String toString(){
		return simbol;
	}
}
