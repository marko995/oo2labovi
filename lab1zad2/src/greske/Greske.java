package greske;

public class Greske extends Exception{
	
	public static final int OZNAKA = 0, INDEKS_NE_POSTOJI = 1, ZAPIS_POSTOJI = 2, ZAPIS_NE_POSTOJI = 3;
	private final int tip;
	private static final String[] poruka = {
		"Oznaka je zabranjena.",
		"Zadatak indeks ne postoji.",
		"Zapis vec postoji u skladistu.",
		"Zapis za zadatat naziv ne postoji."
	};
	
	public Greske(int tip){
		this.tip = tip;
	}
	@Override
	public String toString(){
		return "Greska: " + poruka[tip];
	}
}
