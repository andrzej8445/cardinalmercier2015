package projet_java_cm_2015;
import javax.swing.JOptionPane;
import projet_java_cm_2015.Etudiant;

public class Anglais {

	public static void main(String[] args) {
		Etudiant et = new Etudiant();
		int cpt = 0;
		et.setNom(JOptionPane.showInputDialog("Quel est ton nom?"));
		String verbe = (JOptionPane.showInputDialog("Quel est la traduction(en francais) de to have ?"));
		if(verbe.compareTo("avoir")==0){
			JOptionPane.showMessageDialog(null, "Bravo", et.getNom(), 1);
			 cpt = cpt + 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "Dommage la bonne reponse etait : avoir", et.getNom(), 1);
		}
		verbe = (JOptionPane.showInputDialog("simple past de to have ?"));
		if(verbe.compareTo("had")==0){
			JOptionPane.showMessageDialog(null, "Bravo", et.getNom(), 1);
			 cpt = cpt + 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "Dommage la bonne reponse etait : had", et.getNom(), 1);
		}
		verbe = (JOptionPane.showInputDialog("participlet de to have ?"));
		if(verbe.compareTo("had")==0){
			JOptionPane.showMessageDialog(null, "Bravo", et.getNom(), 1);
			 cpt = cpt + 1;
		}
		else{
			JOptionPane.showMessageDialog(null, "Dommage la bonne reponse etait : had", et.getNom(), 1);
		}
		JOptionPane.showMessageDialog(null, et.getNom()+" tu as obtenu"+cpt+"/3", "Message", 1);
	}


}
