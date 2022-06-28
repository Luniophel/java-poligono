package jana60;

import java.text.DecimalFormat;

public class Triangolo implements Poligono {
	
	//IMPORTS
	DecimalFormat cm  = new DecimalFormat("#.00cm");
	DecimalFormat cm2 = new DecimalFormat("#.00cm\u00B2");
	
	//ATTRIBUTI
	private double base, altezza, lato1, lato2;
	
	//COSTRUTTORI
	public Triangolo(double base, double altezza, double lato1, double lato2) throws Exception 
	{
		boolean datiValidi = true; //Tengo traccia degli errori e dei rispettivi messaggi
		String mexErrore = "";
		
		try //Valido dati prima di salvarli
		{
			validaDato(base);
			validaDato(altezza);
			validaDato(lato1);
			validaDato(lato2);
		} 	
		catch (IllegalArgumentException iae) 
		{
			datiValidi = false;
			mexErrore += " " + iae.getMessage();
		}
		
		if (datiValidi) 
		{	
			this.altezza = altezza;
			this.base = base;
			this.lato1 = lato1;
			this.lato2 = lato2;
		} 
		else 
		{
			throw new Exception(mexErrore);
		}
		
		
	}
	
	//EXCEPTIONS
	private void validaDato(double dato) throws IllegalArgumentException
	{
		if (dato <= 0)
			throw new IllegalArgumentException("ATTENZIONE: Nessuno dei dati può essere minore/uguale a 0!");	
	}
	
	//METODI
	@Override
	public double calcolaPerimetro() 
	{
		return this.base + this.lato1 + this.lato2;
	}
	
	@Override
	public double calcolaArea() 
	{
		return this.base * this.altezza / 2.00;
	}
	
	@Override
	public String toString()
	{
		return 	"\n"	+ "Base: "		+ this.base						+
				"\n"	+ "Altezza:"	+ this.altezza					+
				"\n"	+ "Perimetro: "	+ cm.format(calcolaPerimetro())	+
				"\n"	+ "Area: "		+ cm2.format(calcolaArea())		;	
	}

}
