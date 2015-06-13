package be.cm.question1;

/**
 * @author Andrzej
 *
 */
public class ExerciceATrou extends Exercice{
	private String laBonneReponse;
	private String laFinEnoce;
	
	public ExerciceATrou(){
		super();
		super.setType(TypeExercice.TYPE_EXERCICE_A_TROU);
	}
	public ExerciceATrou(int niveau,String enonce,String laBonneReponse,String laFinEnoce){
		super(niveau,enonce,TypeExercice.TYPE_EXERCICE_A_TROU);
		this.laBonneReponse = laBonneReponse;
		this.laFinEnoce = laFinEnoce;
	}
	public String getLaBonneReponse() {
		return laBonneReponse;
	}
	public void setLaBonneReponse(String laBonneReponse) {
		this.laBonneReponse = laBonneReponse;
	}
	public String getLaFinEnoce() {
		return laFinEnoce;
	}
	public void setLaFinEnoce(String laFinEnoce) {
		this.laFinEnoce = laFinEnoce;
	}
	public String toString() {
		return "Enoncé :"+super.getEnoncé()+"\n La bonne reponse: "+laBonneReponse;
	}
	
	/**Cette méthode recoit en parametre une chaine de caracters 
	 * et elle renvoie vrai si cette chaine de caracteres est la meme 
	 * que la bonne reponse en ignorant les majuscules et les miniscules
	 * @param reponse
	 * @return boolean
	 */
	public boolean verivication(String reponse){
		if(reponse.equalsIgnoreCase(laBonneReponse)){
			return true;
			
		}
		return false;
		
	}
}
