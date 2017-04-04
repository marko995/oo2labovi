package Klase;

import Greske.Greske;

public class Kolicnik extends Binarni{
	public Kolicnik(Izraz a, Izraz b){
		super('/', a, b);
		try{
		if(b.izracunavanje_vrednosti_realnog_tipa() == 0.0)
			throw new Greske();
		}
		catch(Greske g){
			System.out.println(g + "\n");
			System.exit(1);
		}
	}
	@Override
	public double izracunavanje_vrednosti_realnog_tipa() throws Greske {
		if(dohvati_izraz_b().izracunavanje_vrednosti_realnog_tipa() == 0.0)
			throw new Greske();
		
		return dohvati_izraz_a().izracunavanje_vrednosti_realnog_tipa() / dohvati_izraz_b().izracunavanje_vrednosti_realnog_tipa();	
	}
	@Override
	public Izraz stvaranje_izraza_po_prvom_izvodu(Promenljiva diff) {
		return new Kolicnik(gornji_izraz(diff), new Proizvod(dohvati_izraz_b(),dohvati_izraz_b()));
	}
	
	private Izraz gornji_izraz(Promenljiva diff){
		return new Razlika(new Proizvod(dohvati_izraz_a().stvaranje_izraza_po_prvom_izvodu(diff), dohvati_izraz_b()),new Proizvod(dohvati_izraz_a(), dohvati_izraz_b().stvaranje_izraza_po_prvom_izvodu(diff)));
	}
}
