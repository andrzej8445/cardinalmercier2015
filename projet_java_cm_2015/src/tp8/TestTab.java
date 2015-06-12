package tp8;

import tp4.Etudiant;

public class TestTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab[] = new int[5];
		try{
			System.out.println(tab[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		Etudiant tabEtu[] = new Etudiant[5];
		for(int i=0;i<5;i++){
			tabEtu[i]= new Etudiant("a","i",i,i,i);
		}
	}

}
