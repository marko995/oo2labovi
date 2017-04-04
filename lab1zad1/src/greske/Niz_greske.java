package greske;

public final class Niz_greske extends Exception{

	public static final int PUN = 0, PRAZAN = 1, NEPOSTOJECI_INDEKS = 2;
	private final int tip;
	private static final String[] poruka = {
		"Niz je pun.",
		"Niz je prazan",
		"Ne postoji element sa trazenim indeksom."
	};
	
	public Niz_greske(int tip){
		this.tip = tip;
	}
	@Override
	public String toString(){
		return "Greska: " + poruka[tip];
	}
	
}
