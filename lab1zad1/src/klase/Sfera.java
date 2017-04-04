package klase;

public final class Sfera extends Predmet implements Merljivim {
	
	private final double r;
	
	public Sfera(double r) {
		super('S');
		this.r = r;
	}

	@Override
	public double realna_velicina() {
		return 3.0/4.0 * Math.PI * Math.pow(r, 3);
	}
	@Override
	public String toString(){
		return super.toString() + "(" + r + ")";
	}
}
