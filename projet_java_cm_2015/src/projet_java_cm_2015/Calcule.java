package projet_java_cm_2015;
import javax.swing.JOptionPane;
import projet_java_cm_2015.Etudiant;
public class Calcule {

	public static void main(String[] args) {
		Etudiant et = new Etudiant();
		et.setNom(JOptionPane.showInputDialog("Quel est ton nom?"));
		int a,b,c,nbEtu,cpt;
		cpt = 0;
		String reponse;
		for(int i=0;i<3;i++){
			 a = (int)(Math.random()*100);
			 b = (int)(Math.random()*100);
			 c = a + b;
			 reponse = (JOptionPane.showInputDialog(a + "+" + b));
			 nbEtu = Integer.parseInt(reponse);
			 if(c==nbEtu){
				 JOptionPane.showMessageDialog(null, "Bravo", et.getNom(), 1);
				 cpt = cpt + 1;
			 }
			 else{
				 JOptionPane.showMessageDialog(null, a+"+"+b+"="+c, "Non", 2);
			 }
		}
		JOptionPane.showMessageDialog(null, et.getNom()+" tu as obtenu"+cpt+"/3", "Message", 1);
	}

}
