package be.cardinalmercier.tp16;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Exe2 extends JFrame implements ActionListener{
	public Exe2(){
		setTitle("Exemple de butons radio");
		setSize(400,100);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		ButtonGroup groupe = new ButtonGroup();
		
		radio1 = new JRadioButton("Radio 1", true);
		radio1.addActionListener(this);
		groupe.add(radio1);
		contenu.add(radio1);
        radio2 = new JRadioButton("Radio 2");
		groupe.add(radio2);
		contenu.add(radio2);
		radio2.addActionListener(this);
		radio3 = new JRadioButton("Radio 3");
		groupe.add(radio3);
		contenu.add(radio3);
		radio3.addActionListener(this);
		Etat = new JButton("Etat");
		contenu.add(Etat);
		Etat.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ev){
		Object source = ev.getSource();
		if(source == radio1) System.out.println("action radio 1");
		if(source == radio2) System.out.println("action radio 2");
		if(source == radio3) System.out.println("action radio 3");
		if(source == Etat)
				System.out.println("Etat Radios : "+radio1.isSelected()+ " " +radio2.isSelected()+ " " +radio3.isSelected());
		
		
	}
	private JRadioButton radio1,radio2,radio3;
	private JButton Etat;
	
	

	
		public static void main(String args[]){
			Exe2 fen = new Exe2();
			fen.setVisible(true);
		}
	
}
