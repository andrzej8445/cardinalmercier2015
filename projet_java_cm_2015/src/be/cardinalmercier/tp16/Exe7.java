package be.cardinalmercier.tp16;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
class Exe7 extends JFrame implements ActionListener, ItemListener
{ /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public Exe7()
 { setTitle ("Essais boite combinee") ;
 setSize (300, 200) ;
 Container contenu = getContentPane() ;
 contenu.setLayout (new FlowLayout() ) ;
 combo = new JComboBox(couleurs) ;
 combo.setEditable (true) ;
 contenu.add(combo) ;
 combo.addActionListener (this) ;
 combo.addItemListener (this) ;
 }
 public void actionPerformed (ActionEvent e)
 { System.out.print ("action combo : ") ;
 Object valeur = combo.getSelectedItem() ;
 System.out.println ((String) valeur) ;
 }
 public void itemStateChanged (ItemEvent e)
 { System.out.print ("item combo : ") ;
 Object valeur = combo.getSelectedItem() ;
 System.out.println ((String) valeur) ;
 }
 private String[] couleurs = {"rouge", "bleu", "gris", "vert",
 "jaune", "noir" } ;
 private JComboBox combo ;
}

