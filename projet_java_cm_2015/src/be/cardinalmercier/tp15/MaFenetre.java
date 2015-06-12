package be.cardinalmercier.tp15;

import javax.swing.* ;

import java.awt.FlowLayout;
import java.awt.event.* ;
import java.awt.* ;

public class MaFenetre extends JFrame implements MouseListener, ActionListener  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton monBouton ;
	public MaFenetre (){ // constructeur
	 setTitle ("Ma fenetre ") ;
	 setSize (300, 150) ;
	 setBounds (10, 20, 300, 200) ;
	 addMouseListener (new MouseAdapter() {
		 public void mouseClicked(MouseEvent ev){
			 int x = ev.getX() ;
			 int y = ev.getY() ;
			 System.out.println ("clic au point de coordonnees " + x + ", " + y ) ;
		 }
		 
	} ) ;
	 
	 						
	 //setTitle ("Premier bouton") ; 
	 setSize (300, 200) ;
	 monBouton = new JButton ("ESSAI") ;
	 getContentPane().setLayout(new FlowLayout()) ;
	 getContentPane().add(monBouton) ;
	 monBouton.addActionListener(this);
	
	/*public void mouseClicked(MouseEvent ev){ // methode gerant un clic souris
		int x = ev.getX() ;
		int y = ev.getY() ;
		System.out.println ("clic au point de coordonnees " + x + ", " + y ) ;
	}
	
	public void mousePressed (MouseEvent ev) {}
	public void mouseReleased(MouseEvent ev) {}
	public void mouseEntered (MouseEvent ev) {}
	public void mouseExited (MouseEvent ev) {}
	*/ 
	}

	@Override
	public void mouseClicked(MouseEvent ev) {
		// TODO Auto-generated method stub
		/* int x = ev.getX() ;
		 int y = ev.getY() ;
		 System.out.println ("clic au point de coordonnees " + x + ", " + y ) ;*/
	}

	@Override
	public void mouseEntered(MouseEvent ev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent ev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent ev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent ev) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		System.out.println ("action sur bouton ESSAI") ;
	}
}
