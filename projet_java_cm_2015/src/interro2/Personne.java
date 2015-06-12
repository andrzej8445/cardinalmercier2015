package interro2;



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
	
	
	
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom
				+ ", dateDeNaissance=" + dateDeNaissance + "]";
	}
	
}
