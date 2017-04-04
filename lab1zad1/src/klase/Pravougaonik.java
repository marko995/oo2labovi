package klase;

public final class Pravougaonik extends Predmet implements Merljivim {

	final private double a, b;
	
	public Pravougaonik(double a, double b) {
		super('P');
		this.a = a;
		this.b = b;
	}

	@Override
	public double realna_velicina() {
		return a*b;
	}
	@Override
	public String toString(){
		return super.toString() + "(" + a + ", " + b + ")";
	}
	
}
