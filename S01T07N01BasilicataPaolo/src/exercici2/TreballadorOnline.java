package exercici2;


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
	
	@Deprecated
	public float calcularSouExtra(float horesTreballades,float horesExtra, float preuHoresExtra) {
		return super.calcularSou(horesTreballades) + (horesExtra * preuHoresExtra);
				
	}
	
	@Deprecated
	public float calcularSouNet(float horesTreballades,float irpf) {
		float souBrut,souNet;
		souBrut = super.calcularSou(horesTreballades);
		souNet = souBrut - ((souBrut * irpf / 100));
		return souNet;
	}
	

}
