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
		
		if(Math.abs(a) < 10 && Math.abs(a) > 99){
			
			return false;
		}
		else{
		
			return true;
		}

	}

}
