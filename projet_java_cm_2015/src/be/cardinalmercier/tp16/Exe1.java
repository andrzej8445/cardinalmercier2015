package be.cardinalmercier.tp16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exe1 extends JFrame implements ActionListener{
	public Exe1(){
	setTitle ("Exemple de cases a cocher");
	setSize(400,100);
	Container contenu = getContentPane();
	contenu.setLayout(new FlowLayout());
	
	coche1 = new JCheckBox("case 1");
	contenu.add(coche1);
	coche1.addActionListener(this);
	coche2 = new JCheckBox("case 2");
	contenu.add(coche2);
	coche2.addActionListener(this);
	
	Etat = new JButton("Etat");
	contenu.add(Etat);
	Etat.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ev){
		Object source = ev.getSource();
		if(source == coche1) System.out.println("action case 1");
		if(source == coche2) System.out.println("action case 2");
		if(source == Etat)
			System.out.println("Etat CASES : " + coche1.isSelected()+" " +coche2.isSelected());
	
	}
	private JCheckBox coche1,coche2;
	private JButton Etat;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Exe1 fen = new Exe1();
		fen.setVisible(true);

	}

}
