package be.cm.question1;

/**
 * @author Andrzej
 *
 */
public class Exercice {
	private int niveau;
	private String enonc�;
	private int type;
	
	public Exercice(){
		
	}
	public Exercice(int niveau,String enonc�,int type){
		this.niveau = niveau;
		this.enonc� = enonc�;
		this.type = type;
		
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public String getEnonc�() {
		return enonc�;
	}
	public void setEnonc�(String enonc�) {
		this.enonc� = enonc�;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String toString() {
		return enonc�+"";
	}
	
}
