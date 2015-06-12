package interro;

public class Etudiant extends Personne {

	private int num;
	private static int nbEtu = 0;
	
	public Etudiant(String nom, String prenom,int j,int m,int a){
		super(nom,prenom,j,m,a);
		nbEtu++;
		this.num = nbEtu;
				
	}
	public String toString() {
		return "Etudiant [num=" + num + ", " + super.toString()
				
				+ "]";
	}
}
