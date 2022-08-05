package exercici1;

public class TreballadorOnline extends Treballador {
	
	public final float tarifaPlanaInternet;

	public TreballadorOnline(String nom, String cognom, float preuHora,float tarifaPlana) {
		super(nom, cognom, preuHora);
		this.tarifaPlanaInternet = tarifaPlana;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularSou(float horesTreballades) {
		// TODO Auto-generated method stub
		return super.calcularSou(horesTreballades) + tarifaPlanaInternet;
	}
	
	
	
	
	

}
