package tp7;

public class Date implements Comparable{
	private int jour;
	private int mois;
	private int annee;
	public Date(int jour,int mois,int annee){
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
		
	}
	public String toString(){
		return jour + "/" + mois + "/" + annee;
		
	}
	public int compareTo(Object o){
		Date autreDate = (Date) o;
		return (this.annee*10000+this.mois*100+this.jour)-(autreDate.annee*10000+autreDate.mois*100+autreDate.jour); 
		
	}
}
