package interro2;




	public class Etudiant extends Personne implements Comparable{

		private int num;
		private static int nbEtu = 0;
		
		
		@Override
		public String toString() {
			return "Etudiant [num=" + num + ", " + super.toString()
					
					+ "]";
		}
		public Etudiant(String nom, String prenom,int j,int m,int a){
			super(nom,prenom,j,m,a);
			nbEtu++;
			this.num = nbEtu;
			
			
			
		}
		public int compareTo(Object o){
			Etudiant autreEtu = (Etudiant) o;
			return ((autreEtu.getDateDeNaissance().getAnnee()*10000+autreEtu.getDateDeNaissance().getMois()*100+autreEtu.getDateDeNaissance().getJour()-this.getDateDeNaissance().getAnnee()*10000+this.getDateDeNaissance().getMois()*100+this.getDateDeNaissance().getJour())); 
			
		}
		public static void main(String[] args) {
			Etudiant et1 = new Etudiant("I","A",30,12,69);
			Etudiant et2 = new Etudiant("I","A",30,12,69);
			System.out.println(et1.getDateDeNaissance().getJour());
			System.out.println(et2);
		}
}
