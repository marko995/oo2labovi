package lab1zad1;

import java.util.Scanner;
import greske.Niz_greske;
import klase.*;


public class Main {
	
	private Niz niz;
	Scanner in;
	
	private void menu(){
		in = new Scanner(System.in);
		
		int duzina = in.nextInt();
		niz = new Niz(duzina);
		
		while(true){
			System.out.println("\nBiraj opciju:");
			System.out.println("1. za dodavanje pravougaonika.");
			System.out.println("2. za dodavanje sfere.");
			System.out.println("3. dohvatanje elementa.");
			System.out.println("4. dohvatanje broj elemenata.");
			System.out.println("5. dohvatanje velicine.");
			System.out.println("0. za izaci.");
			int opcija = in.nextInt();
			if(opcija == 0) break;
			try{
				switch(opcija){
				case 1:
					System.out.println("dimenzije pravougaonika a,b: ");
					double a = in.nextDouble();
					double b = in.nextDouble();
					Pravougaonik pravougaonik = new Pravougaonik(a, b);
					niz.niz_ubaci(pravougaonik);
					System.out.println("Napravljeno.");
					break;
				case 2:
					System.out.println("dimenzije sfere r:");
					double r = in.nextDouble();
					Sfera sfera = new Sfera(r);
					niz.niz_ubaci(sfera);
					System.out.println("Napravljeno.");
					break;
				case 3:
					System.out.println("Indeks elementa:");
					int index = in.nextInt();
					Predmet m = niz.niz_dohvati(index);
					System.out.println(m + "\n\n");
					break;
				case 4:
					System.out.println(niz.Broj_predmeta());
					break;
				case 5:
					System.out.println(niz.Ukupna_kolicina());
					break;
				
				default: 
					System.out.println("Biraj opet."); 
					break;
				}
			}
			catch(Niz_greske g){
				System.out.println(g + "\n");
			}
			catch(OutOfMemoryError g){
				System.out.println("Memorija je puna");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.menu();
	}

}
