package Greske;

public class Greske extends Exception{
	
	public static int KAPACITET_OPISA_SASTOJKA = 0, KAPACITET_SASTOJAKA_U_FRIZIDERU = 1, NEPOSTOJACI_INDEKS = 2;
	private int index;
	private static String[] poruke = {
		"Prepunjen kapacitet sastojaka",
		"Frizider je pun, jedi malo, osusi se sav.",
		"Daj jedi nesto sto ima."
	};
	
	public Greske(int index){
		this.index = index;
	}
	
	public String toString(){
		return "***" + poruke[index] + "***";
	}
	
}
