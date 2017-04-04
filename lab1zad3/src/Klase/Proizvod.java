package Klase;

import Greske.Greske;

public class Proizvod extends Binarni{
	public Proizvod(Izraz a, Izraz b){
		super('*', a, b);
	}
	@Override
	public double izracunavanje_vrednosti_realnog_tipa() throws Greske {
		return dohvati_izraz_a().izracunavanje_vrednosti_realnog_tipa() * dohvati_izraz_b().izracunavanje_vrednosti_realnog_tipa();	
	}
	@Override
	public Izraz stvaranje_izraza_po_prvom_izvodu(Promenljiva diff) {
		return new Zbir(new Proizvod(dohvati_izraz_a().stvaranje_izraza_po_prvom_izvodu(diff), dohvati_izraz_b()),new Proizvod(dohvati_izraz_a(), dohvati_izraz_b().stvaranje_izraza_po_prvom_izvodu(diff)));
	}
}