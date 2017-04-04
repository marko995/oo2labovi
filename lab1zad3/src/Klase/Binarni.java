package Klase;

abstract class Binarni extends Izraz{

	private char operacija;
	private Izraz a, b;
	public Binarni(char operacija, Izraz a, Izraz b){
		this.operacija = operacija;
		this.a = a;
		this.b = b;
	}
	
	public Izraz dohvati_izraz_a(){
		return a;
	}
	public Izraz dohvati_izraz_b(){
		return b;
	}
	
	@Override
	public String toString() {
		return "(" + a.toString() + operacija + b.toString() + ")";
	}

}
