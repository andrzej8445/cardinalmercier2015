package be.cardinalmercier.tp16;






import javax.swing.JFrame;
import javax.swing.event.*;
import javax.swing.JPanel;
import javax.swing.JTextField;



import java.awt.*;


public class Exe5 extends JFrame implements DocumentListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panneau ;
	private JTextField saisie, copie ;
	
	public Exe5(){
	
		setTitle ("Miroir d'un texte") ;
		setSize (300, 150) ;
		setBounds (10, 20, 300, 200) ;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Pour fermer directement le programme en quittant
		
		panneau = new JPanel ();
		getContentPane().add(panneau);
		getContentPane().setLayout(new FlowLayout()) ;
		setSize (300, 200) ;
		
		saisie = new JTextField (20) ;
		getContentPane().add(saisie) ;
		saisie.getDocument().addDocumentListener (this);
		
		copie = new JTextField (20) ;
		

		copie.setEditable(false);
		getContentPane().add(copie) ;
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		System.out.println ("validation saisie") ;
		String texte = saisie.getText() ;
		copie.setText(texte) ;	
	}
	public void removeUpdate(DocumentEvent e) {
		System.out.println ("validation saisie") ;
		String texte = saisie.getText() ;
		copie.setText(texte) ;	
	}


	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}