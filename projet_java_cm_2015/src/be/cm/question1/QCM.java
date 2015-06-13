package be.cm.question1;

/**
 * @author Andrzej
 *
 */
public class QCM extends Exercice{
	
	private int nombreDeProposition;
	private String[] tableauDeProposition;
	private int indiceDeLaBonneReponse;
	
	public static final int TYPE_VRAI_FAUX = 1;
	public static final int TYPE_FAUX_VRAI = 2;
	public static final int TYPE_OUI_NON = 3;
	public static final int TYPE_NON_OUI = 4;
	
	public QCM(){
		super();
		super.setType(TypeExercice.TYPE_EXERCICE_QCM);
	}
	public QCM(int niveau,String enonce,int nombreDeProposition,String[] tableauDeProposition,int indiceDeLaBonneReponse){
		super(niveau,enonce,TypeExercice.TYPE_EXERCICE_QCM);
		this.nombreDeProposition = nombreDeProposition;
		this.tableauDeProposition = tableauDeProposition;
	}
	public QCM(int nivea,String enonce,int indiceDeLaBonneReponse,int type_vrai_ou_faux){
		super(nivea,enonce,TypeExercice.TYPE_EXERCICE_VRAI_OU_FAUX);
		nombreDeProposition = 2;
		this.indiceDeLaBonneReponse=indiceDeLaBonneReponse;
		if(type_vrai_ou_faux==TYPE_VRAI_FAUX){
			tableauDeProposition = new String[2];
			tableauDeProposition[0] =("Vrai");
			tableauDeProposition[1] =("Faux");
		}
		if(type_vrai_ou_faux==TYPE_FAUX_VRAI){
			tableauDeProposition = new String[2];
			tableauDeProposition[0] =("Faux");
			tableauDeProposition[1] =("Vrai");
		}
		if(type_vrai_ou_faux==TYPE_FAUX_VRAI){
			tableauDeProposition = new String[2];
			tableauDeProposition[0] =("Faux");
			tableauDeProposition[1] =("Vrai");
		}
		if(type_vrai_ou_faux==TYPE_OUI_NON){
			tableauDeProposition = new String[2];
			tableauDeProposition[0] =("Oui");
			tableauDeProposition[1] =("Non");
		}
		if(type_vrai_ou_faux==TYPE_NON_OUI){
			tableauDeProposition = new String[2];
			tableauDeProposition[0] =("Non");
			tableauDeProposition[1] =("Oui");
		}
	}
	public int getNombreDeProposition() {
		return nombreDeProposition;
	}
	public void setNombreDeProposition(int nombreDeProposition) {
		this.nombreDeProposition = nombreDeProposition;
	}
	public String[] getTableauDeProposition() {
		return tableauDeProposition;
	}
	public void setTableauDeProposition(String[] tableauDeProposition) {
		this.tableauDeProposition = tableauDeProposition;
	}
	public int getIndiceDeLaBonneReponse() {
		return indiceDeLaBonneReponse;
	}
	public void setIndiceDeLaBonneReponse(int indiceDeLaBonneReponse) {
		this.indiceDeLaBonneReponse = indiceDeLaBonneReponse;
	}
	public String toString() {
		String buff = "";
		for(String exe : tableauDeProposition){
			buff = buff+exe+"\n";
		}
		
		return "Enoncé :"+super.getEnoncé()+" \nProposition de réponse\n"+buff+"La bonne reponse "+tableauDeProposition[indiceDeLaBonneReponse];
	}
	
}
