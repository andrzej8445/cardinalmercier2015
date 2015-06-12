package tp11;

import java.util.ArrayList;

/**
 * La classe Etudiant permet de represante un edudiant
 * @author Andrzej Iwanowicz
 *
 */

public class Etudiant {
	private String nom;
	private int num;
	private static int nbEtu=0;
	/**
	 * La classe Etudiant permet de represante un edudiant
	 * @paraam args pas utiliser
	 *
	 */	
	public Etudiant(String nom){
		this.nom = nom;
		num = ++nbEtu;
	}
	public String toString(){
		return "nom : "+nom+"num : "+num;
	}
	public static void main(String[] args) {
		ArrayList<Etudiant> listeEtu = new ArrayList<Etudiant>();
		listeEtu.add(new Etudiant("toto"));
		listeEtu.add(new Etudiant("toto2"));
		listeEtu.add(new Etudiant("toto3"));
		listeEtu.add(new Etudiant("toto4"));
		System.out.println(listeEtu);
		

	}

}
