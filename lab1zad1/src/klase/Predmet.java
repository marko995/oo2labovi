package klase;

public abstract class Predmet implements Merljivim{
	final private int id;
	private static int GEN_ID = 0;
	final private char vrsta;
	
	Predmet(char vrsta){
		id = GEN_ID++;
		this.vrsta = vrsta;
	}
	@Override
	public String toString(){
		return vrsta + " " + id;
	}
	
}
