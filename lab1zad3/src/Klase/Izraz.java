package Klase;

import Greske.Greske;

public abstract class Izraz {
	public abstract double izracunavanje_vrednosti_realnog_tipa() throws Greske;
	public abstract Izraz stvaranje_izraza_po_prvom_izvodu(Promenljiva diff);
	public abstract String toString();
}
