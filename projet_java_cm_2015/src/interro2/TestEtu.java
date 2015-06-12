package interro2;

import java.util.Arrays;

public class TestEtu {

	public static void main(String[] args) {
		
		Etudiant tabEtu[] = new Etudiant[3];
		tabEtu[0] = new Etudiant("nom", "prenom", 24, 10, 1985);
		tabEtu[1] = new Etudiant("nom", "prenom", 24, 9, 1986);
		tabEtu[2] = new Etudiant("nom", "prenom", 2, 10, 1987);
		System.out.println("avant le tri");
		for(Etudiant etudiant : tabEtu){
			System.out.println(etudiant);
		}
		Arrays.sort(tabEtu);
		System.out.println("apres le tri");
		for(Etudiant etudiant : tabEtu){
			System.out.println(etudiant);
		}
	}

}
