package model.klas;

import java.util.ArrayList;
import model.persoon.Student;

public class Klas {

	private String klasCode;
	private String naam;
	private String soort;
	private int jaar;
	private ArrayList<Student> deStudenten = new ArrayList<Student>();

	public Klas(String klasCode, String naam, String soort, int jaar) {
		this.klasCode = klasCode;
		this.naam = naam;
		this.soort = soort;
		this.jaar = jaar;
	}
	
	public String getKlasCode() {
		return klasCode;
	}
	
	public void setKlasCode(String klasCode){
		this.klasCode = klasCode;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam){
		this.naam = naam;
	}
	
	public String getSoort(){
		return soort;
	}
	
	public void setSoort(String soort){
		this.soort = soort;
	}
	
	public int getJaar(){
		return jaar;
	}
	
	public void setJaar(int jaar){
		this.jaar = jaar;
	}

	public ArrayList<Student> getStudenten() {
		return this.deStudenten;
	}
	
	public void setStudenten(ArrayList<Student> deStudenten){
		this.deStudenten = deStudenten;
	}
	
	public boolean bevatStudent(Student pStudent) {
		for (Student lStudent : this.getStudenten()) {
			if (lStudent==pStudent) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(Object obj){	
		if (obj instanceof Klas){
			Klas andereKlas = (Klas) obj;
			if (this.klasCode.equals(andereKlas.klasCode)&&(this.naam.equals(andereKlas.naam))&&(this.soort.equals(andereKlas.soort))&&(this.jaar == andereKlas.jaar)){
				return true;
			}
			}
		return false;
		}
	
	
	
	
	public int aantalStudenten(){
		return deStudenten.size();
	}

	public void voegStudentToe(Student pStudent) {
		if (!this.getStudenten().contains(pStudent)) {
			this.getStudenten().add(pStudent);
		}
	}
	
	public void verwijderStudent(Student pStudent){
		if(this.getStudenten().contains(pStudent)){
			this.getStudenten().remove(pStudent);
		}
	}

}
