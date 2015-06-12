package tp5;

public class Livre extends Document {
	private String auteur;
	private int page;
	public Livre(){
		
	}
	public Livre(int numR,String tit,String auteur,int page){
		super(numR,tit);
		this.auteur = auteur;
		this.page = page;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return super.toString() + "Livre [auteur=" + auteur + ", page=" + page + "]";
	}
	
	
}
