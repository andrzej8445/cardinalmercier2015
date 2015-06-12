package projet_java_cm_2015;

public class Etudiant {
	private String nom;
	private String prenom;
	private int nbExercicesTotal;
	private int nbExcericReussis;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNbExercicesTotal() {
		return nbExercicesTotal;
	}
	public void setNbExercicesTotal(int nbExercicesTotal) {
		this.nbExercicesTotal = nbExercicesTotal;
	}
	public int getNbExcericReussis() {
		return nbExcericReussis;
	}
	public void setNbExcericReussis(int nbExcericReussis) {
		this.nbExcericReussis = nbExcericReussis;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom
				+ ", nbExercicesTotal=" + nbExercicesTotal
				+ ", nbExcericReussis=" + nbExcericReussis + "]";
	}
	public double moyenne(){
		return (double)nbExcericReussis/nbExercicesTotal;
		
	}
	
}
