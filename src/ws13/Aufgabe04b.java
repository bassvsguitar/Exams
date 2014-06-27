package ws13;

public class Aufgabe04b extends Aufgabe04a{
	
	double fruchtgehalt;

	public Aufgabe04b(String name, double menge, double preis, double fruchtgehalt){
		
		super(name, menge, preis);
		if((fruchtgehalt >= 20) && (fruchtgehalt <= 100)){
			
			this.fruchtgehalt = fruchtgehalt;
		}
		else{
			
			this.fruchtgehalt = DEFAULTWERT;
		}
	}

	public double getFruchtgehalt(){
		
		return fruchtgehalt;
	}

	public void setFruchtgehalt(double fruchtgehalt){
		
		if ((fruchtgehalt >= 20) && (fruchtgehalt <= 100)){
			
			this.fruchtgehalt = fruchtgehalt;
		}
	}

	public String toString()
	{
		return super.toString() + "\t\tFruchtgehalt: " + fruchtgehalt;
	}

}
