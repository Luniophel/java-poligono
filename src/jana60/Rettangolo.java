package jana60;

import java.text.DecimalFormat;

public class Rettangolo implements Poligono {
	
	//IMPORTS
	DecimalFormat cm  = new DecimalFormat("#.00cm");
	DecimalFormat cm2 = new DecimalFormat("#.00cm\u00B2");
	
	//ATTRIBUTI
	private double base, altezza;
	
	//COSTRUTTORI
	public Rettangolo(double base, double altezza) {
		
		this.altezza = altezza;
		this.base = base;
		
	}
	
	//METODI
	@Override
	public double calcolaPerimetro() {
		return this.altezza * 2.00 + this.base * 2.00;
	}
	
	
	@Override
	public double calcolaArea() {
		return this.altezza * this.base;
	}
	
	@Override
	public String toString(){
		
		return 	"\n"	+ "Base: "		+ this.base						+
				"\n"	+ "Altezza:"	+ this.altezza					+
				"\n"	+ "Perimetro: "	+ cm.format(calcolaPerimetro())	+ 
				"\n"	+ "Area: "		+ cm2.format(calcolaArea())		;
		
	}

}
