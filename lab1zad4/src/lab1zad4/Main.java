package lab1zad4;

import Klase.*;
import Greske.Greske;
public class Main {

	public static void main(String[] args) {
		try{
			Frizider frizider = new Frizider(5);
			Cvrst_sastojak cvrst_sastojak1 = new Cvrst_sastojak("maslac", 5, 10, 1.1, 1);
			Element element1 = new Element(10, "Mg");
			Element element2 = new Element(11, "Fe");
			Jedinjenje jedinjenje = new Jedinjenje();
			Jedinjenje jedinjenje2 = new Jedinjenje();
			jedinjenje2.dodaj_element(element1, 300);
			jedinjenje.dodaj_element(element2, 10);
			cvrst_sastojak1.dodaj_jedinjenje(jedinjenje, 10);
			Tecan_sastojak tecan_sastojak = new Tecan_sastojak("mleko", 10, 10, 10, 10);
			tecan_sastojak.dodaj_jedinjenje(jedinjenje, 30);
			tecan_sastojak.dodaj_jedinjenje(jedinjenje2, 40);
			frizider.dodaj_sastojak(tecan_sastojak);
			frizider.dodaj_sastojak(cvrst_sastojak1);
			System.out.println(frizider.ukupna_cena() + "\n"+ frizider.ukupno_kalorija());
			
		}
		catch(Greske g){
			System.out.println("Greska: " + g);
		}
	}

}
