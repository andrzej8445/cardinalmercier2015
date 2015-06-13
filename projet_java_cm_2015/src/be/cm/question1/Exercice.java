package be.cm.question1;

/**
 * @author Andrzej
 *
 */
public class Exercice {
	private int niveau;
	private String enoncé;
	private int type;
	
	public Exercice(){
		
	}
	public Exercice(int niveau,String enoncé,int type){
		this.niveau = niveau;
		this.enoncé = enoncé;
		this.type = type;
		
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public String getEnoncé() {
		return enoncé;
	}
	public void setEnoncé(String enoncé) {
		this.enoncé = enoncé;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String toString() {
		return enoncé+"";
	}
	
}
