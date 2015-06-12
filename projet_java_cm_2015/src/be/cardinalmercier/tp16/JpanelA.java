package be.cardinalmercier.tp16;

import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JpanelA extends JPanel implements ActionListener {
	private JTextField textField;
	private JLabel jLabelDesigne;
	private JLabel jlabel2;
	private JButton btnValider;

	/**
	 * Create the panel.
	 */
	public JpanelA() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jLabelDesigne = new JLabel("Jebac biede");
		add(jLabelDesigne);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		jlabel2 = new JLabel("New label");
		add(jlabel2);
		
		btnValider = new JButton("Valider");
		btnValider.addActionListener(this);
		add(btnValider);

	}
	public void afficherExercice(Exercice exercice){
		//jLabelDesigne.setText(exercice.getDebutPhrase());
		textField.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// verifier la reponse
		System.out.println("yeaaaaaaaaaa");
		
	}

}
