package projet_java_cm_2015;
import projet_java_cm_2015.Etudiant;
public class Test {

	public static void main(String[] args) {
		Etudiant et = new Etudiant();
		et.setNbExercicesTotal(10);
		et.setNbExcericReussis(3);
		System.out.println(et.moyenne());
	}
	
}
