package ws13;

public class Aufgabe04a {//Aufgabe04a = Getränk

	String name;
	double menge;
	double preis;

	public final double DEFAULTWERT = -1.0;

	public Aufgabe04a(String name, double menge, double preis){
		

		if ((menge > 0.0) && (menge <= 1.0)){
			
			this.menge = menge;
		} 
		else{
			
			this.menge = DEFAULTWERT;
		}
		if ((preis >= 1.0) && (preis <= 8.0)){
			
			this.preis = preis;
		} 
		else{
			
			this.preis = DEFAULTWERT;
		}
	}

	public String getName(){
		
		return name;
	}

	public void setName(String name){
		
		this.name = name;
	}
	public double getMenge(){
		
		return menge;
	}
	public void setMenge(double menge){
		
		if ((menge > 0.0) && (menge <= 1.0)){
			
			this.menge = menge;
		} 
	}
	public double getPreis(){
		
		return preis;
	}
	public void setPreis(double preis){
		
		if ((preis >= 1.0) && (preis <= 8.0)){
			
			this.preis = preis;
		}
	}
	@Override
	public String toString(){
		
		return "Name: "+name+"\t\tMenge: "+menge+"\t\tPreis: "+preis;
	}
}
