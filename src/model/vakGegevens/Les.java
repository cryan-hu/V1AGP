package model.vakGegevens;

import java.time.LocalDate;

import model.klas.Klas;
import model.persoon.Docent;

public class Les {
	private String id; 
	private LocalDate startDate;
	private LocalDate eindDate;
	private String locatie;
	private Vak hetVak;
	private Klas deKlas; 
	private Docent deDocent;
	
	public Les(String id,LocalDate startDate, LocalDate eindDate, String locatie, Vak hetVak, Klas deKlas, Docent deDocent){
		this.id = id;
		this.startDate = startDate;
		this.eindDate = eindDate; 
		this.locatie = locatie;
		this.hetVak = hetVak;
		this.deKlas = deKlas;
		this.deDocent = deDocent;
	}
	
	public String getId(){
		return id;
	}

	public Docent getDocent(){
		return deDocent;
	}
	
	public void setDocent(Docent deDocent){
		this.deDocent = deDocent;
	}
	
	public Vak getVak(){
		return hetVak;
	}
	
	public void setVak(Vak hetVak){
		this.hetVak = hetVak;
	}
	
	public Klas getKlas(){
		return deKlas;
	}
	
	public void setKlas(Klas deKlas){
		this.deKlas = deKlas;
	}
	
	public LocalDate getStartDateTime(){
		return startDate;
	}
	
	public void setStartDateTime(LocalDate startDate){
		this.startDate = startDate;
	}
	
	public LocalDate getEindDateTime(){
		return eindDate;
	}
	
	public void setEindDateTime(LocalDate eindDate){
		this.eindDate = eindDate;
	}
	
	public String getLocatie(){
		return locatie;
	}
	
	public void setLocatie(String locatie){
		this.locatie = locatie;
	}
	
}
