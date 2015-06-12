package be.cardinalmercier.tp15;
import javax.swing.JOptionPane;
/**
@author Andrzej Iwanowicz
 */
public class TestEtu {
	
		public static String getMenu(){
			StringBuffer sb = new StringBuffer();
			sb.append("1. Ajouter un etudiant\n");
			sb.append("2. Ajouter un nouveau resultat a tous les etudiants\n");
			sb.append("3. Afficher les etudiants et leur moyenne.\n");
			sb.append("4. Supprimer un etudiant\n");
			sb.append("0. Quitter\n");
			sb.append("Votre choix : \n");
			String s = new String(sb);
			return s;
		}
	
	
	
	public static void main(String[] args) {
		char choix;
		do{
			choix = (JOptionPane.showInputDialog(getMenu())).charAt(0);
			switch(choix){
				case '1':
					String nom = JOptionPane.showInputDialog("Nom de l'etudiant : ");
					Etudiant etu = new Etudiant(nom);
					Etudiant.ajouteEtu(etu);
					break;
				case '2':
					for(Etudiant etud : Etudiant.listeEtu){
						int points = Integer.parseInt(JOptionPane.showInputDialog(
								etud.toString()+"\nNouveux points de cet etudiant:"));
						etud.ajoutePoint(points);
					}
					break;
				case '3' : 
					JOptionPane.showMessageDialog(null, Etudiant.toStringAll());
					break;
			}
		}while(choix!='0');

	}

}
