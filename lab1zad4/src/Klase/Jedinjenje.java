package Klase;

public class Jedinjenje {

	private class Elem {
		Element element;
		int broj_atoma;
		Elem sledeci = null;
		Elem(Element element, int broj_atoma){
			this.element = element;
			this.broj_atoma = broj_atoma;
		}
	}
	
	private Elem prvi = null, poslednji = null;
	
	public Jedinjenje dodaj_element(Element element, int broj_atoma){
		if(prvi == null){
			prvi = new Elem(element, broj_atoma);
			poslednji = prvi;
		} else {
			poslednji.sledeci = new Elem(element, broj_atoma);
			poslednji = poslednji.sledeci;
		}
		return this;
	}
	
	public String toString(){
		String jedinjenje = "";
		Elem pomocna = prvi;
		while(pomocna != null){
			jedinjenje += pomocna.element.toString() + (pomocna.broj_atoma > 1 ? pomocna.broj_atoma : "");
		}
		return jedinjenje;
	}
	
}
