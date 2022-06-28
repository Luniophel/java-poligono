package jana60;

public class MainTest {

	public static void main(String[] args) {

		//Test Rettangolo
		System.out.println("Sono un rettangolo!");
		Rettangolo p1 = new Rettangolo(8.5, 5);
		System.out.println(p1.toString());
		
		//Test Triangolo
		System.out.println("Sono un triangolo!");
		Triangolo p2 = new Triangolo(7, 11, 5, 4);
		System.out.println(p2.toString());
	}

}
