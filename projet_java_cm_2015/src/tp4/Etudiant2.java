package tp4;

public class Etudiant2 {
	private String nom;
	private String prenom;
	private int num;
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", num=" + num
				+ "]";
	}
	private static int nbEtu = 0;
	
	public Etudiant2(String nom, String prenom, int num){
		this.num = num;
		this.prenom = prenom;
		this.nom = nom;
		nbEtu++;
	}	
	public Etudiant2(String nom, String prenom){
		nbEtu++;
		this.num = nbEtu;
		this.prenom = prenom;
		this.nom = nom;
		
		
	}
	public static void main(String[] args) {
		Etudiant2 et1 = new Etudiant2("Iwanowicz","Andrzej",1);
		Etudiant2 et2 = new Etudiant2("Iwanowicz","Artur");
		Etudiant2 et3 = new Etudiant2("Iwanowicz","Artur",3);
		Etudiant2 et4 = new Etudiant2("Iwanowicz","Artur");
		
		
		System.out.println(et1);
		System.out.println(et2);
		System.out.println(et3);
		System.out.println(et4);
		System.out.println(et1.nom.compareTo(et2.nom));
		System.out.println(et1.prenom.compareTo(et2.prenom));
		int a = 5;
		String b = String.valueOf(a);
		String c = "abc";
		
		System.out.println(b+c);
	}

}
