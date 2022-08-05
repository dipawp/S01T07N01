package exercici1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreballadorPresencial tp = new TreballadorPresencial("Roger", "Garcia", 10.0f);
		TreballadorOnline to = new TreballadorOnline("Arnau","Gonzalez", 10.0f, 50.0f);
		System.out.println("El sou de un d'aquest treballador presencial es: " + tp.calcularSou(176.0f));
		System.out.println("El sou de un d'aquest treballador online es: " + to.calcularSou(176.0f));
	}

}
