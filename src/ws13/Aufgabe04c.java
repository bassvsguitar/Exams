package ws13;

public class Aufgabe04c {
	

	public static void main(String[] args){
		
		Aufgabe04a[] kneipe_ref = new Aufgabe04a[50];
		kneipe_ref[0] 			= new Aufgabe04a("Cola", 0.5, 2.4);
		kneipe_ref[1] 			= new Aufgabe04a("Wasser", 0.7, 2.0);
		kneipe_ref[2] 			= new Aufgabe04b("Apfelsaft", 0.5, 2.8, 75.0);
		kneipe_ref[3] 			= new Aufgabe04b("Orangensaft", 0.5, 2.8, 120.0);

		for (int i = 0; i < kneipe_ref.length; i++){
			
			if (kneipe_ref[i] != null){
			
				System.out.println(kneipe_ref[i].toString());
			}
			else{
				
				System.out.println("Feldkomponente mit Index: " + i + " ist nicht belegt!");
			}
		}
	}

}
