package ws13;

public class Aufgabe01 {

	public static void main(String[] args) {
		
		int x = Integer.valueOf(args[0]);
		System.out.println("Überprüfung des Parameters...");
		System.out.println(istZweistellig(x));
		
		if(istZweistellig(x) == false){
			
			System.out.println("Parameter ist nicht zweistellig.");
		}
		else{
			
			System.out.println("Parameter ist zweistellig");
		}
		
	}
	public static boolean istZweistellig(int a){
		
		if(a <= 10 && a >= 99){
	
			return true;
		}
		else if(a <= -10 && a >= -99){
		
			return true;
		}
		else{
			
			return false;
		}

	}

}
