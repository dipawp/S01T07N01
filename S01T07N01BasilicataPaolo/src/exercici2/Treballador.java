package exercici2;

public class Treballador {
	
	private String nom;
	private String cognom;
	private float preuHora;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public float getPreuHora() {
		return preuHora;
	}
	public void setPreuHora(float preuHora) {
		this.preuHora = preuHora;
	}
	
	public Treballador(String nom,String cognom,float preuHora) {
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}
	
	public float calcularSou(float horesTreballades) {
		return horesTreballades * preuHora;
	}
}
