package jana60;

import java.text.DecimalFormat;

public class Triangolo implements Poligono {
	
	//IMPORTS
	DecimalFormat cm  = new DecimalFormat("#.00cm");
	DecimalFormat cm2 = new DecimalFormat("#.00cm\u00B2");
	
	//ATTRIBUTI
	private double base, altezza, lato1, lato2;
	
	//COSTRUTTORI
	public Triangolo(double base, double altezza, double lato1, double lato2) {
		
		this.altezza = altezza;
		this.base = base;
		this.lato1 = lato1;
		this.lato2 = lato2;
		
	}
	
	//METODI
	@Override
	public double calcolaPerimetro() {
		return this.base + this.lato1 + this.lato2;
	}
	
	
	@Override
	public double calcolaArea() {
		return this.base * this.altezza / 2.00;
	}
	
	@Override
	public String toString(){
		
		return 	"\n"	+ "Base: "		+ this.base						+
				"\n"	+ "Altezza:"	+ this.altezza					+
				"\n"	+ "Perimetro: "	+ cm.format(calcolaPerimetro())	+ 
				"\n"	+ "Area: "		+ cm2.format(calcolaArea())		;
		
	}

}
