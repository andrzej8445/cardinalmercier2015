package tp8;

public class Div0 {

	public static void main(String[] args) {
		int i,j;
		i = 5;
		j = 0;
		
		try{
			System.out.println(i/j);
		}
		catch(java.lang.ArithmeticException e){
			e.printStackTrace();
		}
	}

}
