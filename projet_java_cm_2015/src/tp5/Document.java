package tp5;

public class Document {
	private int numRegistre;
	private String titre;
	public Document(){
		
	}
	public Document(int numR,String titre){
		numRegistre = numR;
		this.titre = titre;
	}
	@Override
	public String toString() {
		return "Document [numRegistre=" + numRegistre + ", titre=" + titre
				+ "]";
	}
	public int getNumRegistre() {
		return numRegistre;
	}
	public void setNumRegistre(int numRegistre) {
		this.numRegistre = numRegistre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
}
