package lab1zad2;

import Klase.*;
import greske.Greske;

public class Main {

	public static void main(String[] args) {
		Skladiste skladiste = new Skladiste("adresa","naziv");
		
		try{
			Mleko mleko = new Mleko();
			Secer secer = new Secer();
			Mleko mleko_2 = new Mleko();
			
			Zapis zapis_mleko = new Zapis(mleko, 10, 10);
			Zapis zapis_secer = new Zapis(secer, 10, 10);
			Zapis zapis_mleko_2 = new Zapis(mleko_2, 20, 20);
			
			skladiste.dodaj_zapis(zapis_mleko);
			skladiste.dodaj_zapis(zapis_secer);
			/////////////////////////////////////////
			//ovo se nece dodati jer vec postoji mleko
			//skladiste.dodaj_zapis(zapis_mleko_2);
			
			double vrednost = skladiste.ukupna_vrednost();
			System.out.println("Ukupna vrednost je: "+ vrednost);
		}
		catch(Greske g){
			System.out.println(g + "\n");
		}
	}

}
