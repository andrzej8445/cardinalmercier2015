package tp12;
import javax.swing.*;
class MaFenetre extends JFrame{
	public MaFenetre(){
		setTitle("Ma premiere fenetre");
		setSize(300,150);
		setBounds(300,300,300,200);
	}
}
public class Premfen1 {

	public static void main(String[] args) {
		JFrame fen = new MaFenetre();
		fen.setVisible(true);

	}

}
