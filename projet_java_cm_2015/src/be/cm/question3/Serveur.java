package be.cm.question3;

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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur extends JFrame implements Runnable, ActionListener{

	private JPanel contentPane;
	private JLabel jLabaleNumPort;
	ServerSocket serveur;
	Socket client;
	private JButton btnNewButton;


	public JLabel getjLabaleNumPort() {
		return jLabaleNumPort;
	}




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Serveur frame = new Serveur();
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
	public void run() {
		try {



			//MonServeurTCP ms = new MonServeurTCP(Param.numPort);
			serveur = new ServerSocket(2015);
			client = serveur.accept();
			jLabaleNumPort.setText("Un client vient de se connecter");
			new ObjectOutputStream(client.getOutputStream()).writeObject("Bienvenue");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public Serveur() {
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

		btnNewButton = new JButton("D\u00E9marer le serveur");
		btnNewButton.addActionListener(this);
		jPanelBas.add(btnNewButton);

		JPanel jPanelCentre = new JPanel();
		contentPane.add(jPanelCentre, BorderLayout.CENTER);

		jLabaleNumPort = new JLabel("Lancer le serveur");
		jPanelCentre.add(jLabaleNumPort);


	}




	@Override
	public void actionPerformed(ActionEvent arg0) {
		btnNewButton.setVisible(false);
		jLabaleNumPort.setText("Attente d'un client");
		Thread t = new Thread(this);
		t.start();


	}

}


