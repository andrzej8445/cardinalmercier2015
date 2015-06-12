package be.cardinalmercier.tp13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class MaJFrameServeur extends JFrame {

	private JPanel contentPane;
	private JTextField jtextFieldNumPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaJFrameServeur frame = new MaJFrameServeur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MaJFrameServeur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel jPanelHaut = new JPanel();
		contentPane.add(jPanelHaut, BorderLayout.NORTH);
		
		JPanel jPanelBas = new JPanel();
		contentPane.add(jPanelBas, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("D\u00E9marer le serveur");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					MonServeurTCP ms = new MonServeurTCP(Integer.parseInt(jtextFieldNumPort.getText()));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jPanelBas.add(btnNewButton);
		
		JPanel jPanelCentre = new JPanel();
		contentPane.add(jPanelCentre, BorderLayout.CENTER);
		
		JLabel jLabaleNumPort = new JLabel("Num\u00E9ro du port");
		jPanelCentre.add(jLabaleNumPort);
		
		jtextFieldNumPort = new JTextField();
		jtextFieldNumPort.setText(Param.numPort+"");
		jPanelCentre.add(jtextFieldNumPort);
		jtextFieldNumPort.setColumns(10);
	}

}
