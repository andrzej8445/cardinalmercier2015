package tp4;

public class Personne {
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	
	public Personne(){
	}
	public Personne(String nom,String prenom,int jour,int mois,int annee){
		this.nom = nom;
		this.prenom = prenom;
		dateDeNaissance = new Date(jour,mois,annee);		
	}
	
	
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom
				+ ", dateDeNaissance=" + dateDeNaissance + "]";
	}
	public static void main(String[] args) {
		Personne p1 = new Personne("Iwanowicz","Andrzej",30,12,1969);
		Personne p2 = new Personne("Iwanowicz","Artur",30,12,1965);
		Personne p3 = new Personne();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
