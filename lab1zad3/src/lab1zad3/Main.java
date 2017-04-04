package lab1zad3;

import Greske.Greske;
import Klase.*;

public class Main {

	public static void main(String[] args) {
		
		Promenljiva x = new Promenljiva('x');
		
		Konstanta c1 = new Konstanta(3);
		Zbir x_plus_3 = new Zbir(x, c1);
		
		Konstanta c2 = new Konstanta(2);
		Razlika x_minus_2 = new Razlika(x, c2);
		
		Konstanta c3 = new Konstanta(1);
		Zbir x_plus_1 = new Zbir(x, c3);
		Proizvod x_minus_2_puta_x_plus_1 = new Proizvod(x_minus_2, x_plus_1);
		Kolicnik algebarski_izraz = new Kolicnik(x_plus_3, x_minus_2_puta_x_plus_1);
		Izraz prvi_izvod = algebarski_izraz.stvaranje_izraza_po_prvom_izvodu(x);
		System.out.println(algebarski_izraz);
		System.out.println(prvi_izvod);
		
		for(double i = -2.0; i <= 3.0 ; i += 0.25){
			System.out.print(i+ " : ");
			x.promeni_realnu_vrednost(i);
			try {
				double vrednost_algebarskog_izraza = algebarski_izraz.izracunavanje_vrednosti_realnog_tipa();
				System.out.print( vrednost_algebarskog_izraza + " ");
			}
			catch (Greske e) {
				System.out.print(e + " ");
			}
			try{
				double vrednost_prvog_izvoda = prvi_izvod.izracunavanje_vrednosti_realnog_tipa();
				System.out.println(vrednost_prvog_izvoda);
			} catch (Greske e) {
				System.out.println(e + " ");
			}
		}
	}

}
