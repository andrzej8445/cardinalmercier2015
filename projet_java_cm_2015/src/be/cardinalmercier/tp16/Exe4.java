package be.cardinalmercier.tp16;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Exe4 extends JFrame implements ActionListener{
	public Exe4(){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Saisie de texte");
		setSize(300,120);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		saisie = new JTextField(20);
		contenu.add(saisie);
		saisie.addActionListener(this);
		
		bouton = new JButton("COPIER");
		contenu.add(bouton);
		bouton.addActionListener(this);
		copie = new JTextField(20);
		copie.setEditable(false);
		contenu.add(copie);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bouton){
			String texte = saisie.getText();
			copie.setText(texte);
		}
		if(e.getSource()==saisie){
			String texte = saisie.getText();
			copie.setText(texte);
		}
	}
	private JTextField saisie, copie;
	private JButton bouton;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Exe4 fen = new Exe4();
			fen.setVisible(true);
	}

}
