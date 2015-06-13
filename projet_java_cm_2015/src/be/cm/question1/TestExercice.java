package be.cm.question1;


/**
 * @author Andrzej
 *
 */
public class TestExercice {

	public static void main(String[] args) {
		int i = 0;
		Exercice tab[] = new Exercice[3];
		tab[0] = new Exercice(1,"(x+6)2 est egal a",1);
		tab[1] = new Exercice(1,"Complete cette phrase avec verbe entre parantheses conjugué au <simple present>\n Jane _____ (buy) beutiful clothes.",2);
		tab[2] = new Exercice(1,"Java est un langage orienté objet",3);
		for(Exercice exe : tab){
			i=i+1;

			switch(i){
			case 1:

				System.out.println("Le premier exercice est un QCM");
				String tab2[] = new String[3];
				tab2[0] = "x2 + 36";
				tab2[1] = "x2 + 12x + 36";
				tab2[2] = "x2 + 6x + 36";

				QCM exe2 = new QCM(exe.getNiveau(),exe.getEnoncé(),3,tab2,1);
				System.out.println(exe2+"\n");

				break;
			case 2: 
				System.out.println("Le second exercice est un exercice a trou");
				ExerciceATrou exe3 = new ExerciceATrou(exe.getNiveau(),exe.getEnoncé(),"buys","(buy) beutiful clothes");
				System.out.println(exe3+"\n"+exe3.getLaFinEnoce()+"\n");



				break;
			case 3: 
				System.out.println("Le dernier exercice est un exercice vrai ou faux");

				QCM exe4 = new QCM(exe.getNiveau(),exe.getEnoncé(),0,1);
				System.out.println(exe4+"\n");



				break;
			}









		}
	}

}
