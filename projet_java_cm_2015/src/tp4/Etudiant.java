package tp4;

public class Etudiant extends Personne {

	private int num;
	private static int nbEtu = 0;
	
	
	@Override
	public String toString() {
		return "Etudiant [num=" + num + ", toString()=" + super.toString()
				
				+ "]";
	}
	public Etudiant(String nom, String prenom,int j,int m,int a){
		super(nom,prenom,j,m,a);
		nbEtu++;
		this.num = nbEtu;
		
		
		
	}	
	public static void main(String[] args) {
		Etudiant et1 = new Etudiant("I","A",30,12,69);
		System.out.println(et1);
	}

}
