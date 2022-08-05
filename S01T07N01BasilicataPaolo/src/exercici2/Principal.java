package exercici2;


public class Principal {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Roger", "Garcia", 10.0f);
		TreballadorOnline treballadorOnline = new TreballadorOnline("Arnau","Gonzalez", 10.0f, 50.0f);
		
		System.out.println(treballadorPresencial.calcularSouExtra(184f,24f,16.5f));
		System.out.println(treballadorOnline.calcularSouExtra(176f,24f,13.5f));
		
		System.out.println(treballadorPresencial.calcularSouNet(176, 14));
		System.out.println(treballadorOnline.calcularSouNet(176, 12));
	}

}
