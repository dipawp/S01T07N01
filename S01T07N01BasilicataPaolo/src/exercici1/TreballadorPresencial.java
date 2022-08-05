package exercici1;

public class TreballadorPresencial extends Treballador{

	public static float benzina = 100.0f;

	public TreballadorPresencial(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularSou(float horesTreballades) {
		// TODO Auto-generated method stub
		return super.calcularSou(horesTreballades) + benzina;
	}
	
	
}
