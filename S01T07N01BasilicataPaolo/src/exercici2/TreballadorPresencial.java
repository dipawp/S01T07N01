package exercici2;

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
	
	
	@Deprecated
	public float calcularSouExtra(float horesTreballades,float horesExtra, float preuHoresExtra) {
		return super.calcularSou(horesTreballades) + (horesExtra * preuHoresExtra);
				
	}
	@Deprecated
	public float calcularSouNet(float horesTreballades, float irpf) {
		float souBrut,souNet;
		souBrut = super.calcularSou(horesTreballades);
		souNet = souBrut - ((souBrut * irpf / 100));
		return souNet;
	}
	
	
}