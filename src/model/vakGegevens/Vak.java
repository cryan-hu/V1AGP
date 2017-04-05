package model.vakGegevens;

public class Vak {
	private String vakCode; 
	private String naam;
	
	public Vak(String vakCode, String naam){
		this.vakCode = vakCode;
		this.naam = naam;
	}
	
	public String getVak(){
		return vakCode;
	}
	
	public void setVak(String vakCode){
		this.vakCode = vakCode;
	}
	
	public String getNaam(){
		return naam;
	}
	
	public void setNaam(String naam){
		this.naam = naam;
	}

}
