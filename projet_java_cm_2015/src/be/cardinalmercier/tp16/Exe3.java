package be.cardinalmercier.tp16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Exe3 extends JFrame implements ActionListener{
	public Exe3(){
		setTitle("Essais Etiquettes");
		setSize(300,120);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		bouton = new JButton("COMPTEUR");
		bouton.addActionListener(this);
		contenu.add(bouton);
		nbClics = 0;
		compte = new JLabel ("nombre de clics sur COMPTEUR = "+ nbClics);
		contenu.add(compte);	
	}
	
	public void actionPerformed(ActionEvent e){
		nbClics++;
		compte.setText("nombre de clics sur COMPTEUR="+nbClics);
		
	}
	private JButton bouton;
	private JLabel compte;
	private int nbClics;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exe3 fen = new Exe3();
		fen.setVisible(true);
	}

}
