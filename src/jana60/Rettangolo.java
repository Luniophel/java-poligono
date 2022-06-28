package jana60;

import java.text.DecimalFormat;

public class Rettangolo implements Poligono {
	
	//IMPORTS
	DecimalFormat cm  = new DecimalFormat("#.00cm");
	DecimalFormat cm2 = new DecimalFormat("#.00cm\u00B2");
	
	//ATTRIBUTI
	private double base, altezza;
	
	//COSTRUTTORI
	public Rettangolo(double base, double altezza) throws Exception
	{
		boolean datiValidi = true; //Tengo traccia degli errori e dei rispettivi messaggi
		String mexErrore = "";
		
		try //Valido dati prima di salvarli
		{
			validaDato(base);
			validaDato(altezza);
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
		} 
		else 
		{
			throw new Exception(mexErrore);
		}
	}
	
	//METODI
	private void validaDato(double dato) throws IllegalArgumentException
	{
		if (dato <= 0)
			throw new IllegalArgumentException("ATTENZIONE: Nessuno dei dati può essere minore/uguale a 0!");	
	}
	
	@Override
	public double calcolaPerimetro() 
	{
		return this.altezza * 2.00 + this.base * 2.00;
	}
	
	
	@Override
	public double calcolaArea() 
	{
		return this.altezza * this.base;
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
