package jana60;

public class MainTest {

	public static void main(String[] args) {

		try 
		{
			//Test Rettangolo
			System.out.println("\nSono un rettangolo!");
			Rettangolo p1 = new Rettangolo(8.5, 5);
			System.out.println(p1.toString());
			
			//Test Triangolo
			System.out.println("\nSono un triangolo!");
			Triangolo p2 = new Triangolo(7, 11, 5, 4);
			System.out.println(p2.toString());
			
			//Test Triangolo con Eccezione
			System.out.println("\nSono un triangolo che rompe il codice!");
			Triangolo p3 = new Triangolo(7, -11, 5, 4);
			System.out.println(p3.toString());	
		} 
		catch (Exception e) 
		{
			System.out.println("\nQualcosa è andato storto:");
			System.out.println(	e.getMessage());
		}
		
	}

}
