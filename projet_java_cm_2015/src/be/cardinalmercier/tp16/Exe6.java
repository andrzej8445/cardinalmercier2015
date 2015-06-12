package be.cardinalmercier.tp16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exe6 extends JFrame implements ActionListener, FocusListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panneau ;
	private JTextField saisie, copie ;
	
	public Exe6(){
	
		setTitle ("Ma fenetre ") ;
		setSize (300, 150) ;
		setBounds (10, 20, 300, 200) ;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Pour fermer directement le programme en quittant
		
		panneau = new JPanel ();
		getContentPane().add(panneau);
		getContentPane().setLayout(new FlowLayout()) ;
		setSize (300, 200) ;
		
		saisie = new JTextField (20) ;
		getContentPane().add(saisie) ;
		saisie.addActionListener(this) ;
		saisie.addFocusListener(this);
		copie = new JTextField (20) ;
		
		copie.addActionListener(this) ;
		copie.setEditable(false);
		getContentPane().add(copie) ;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println ("validation saisie") ;
		String texte = saisie.getText() ;
		copie.setText(texte) ;	
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println ("focus sur saisie") ;	
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println ("perte focus saisie") ;
		String texte = saisie.getText() ;
		copie.setText(texte) ;	

	}
	
}
