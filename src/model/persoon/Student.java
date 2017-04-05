//checked
package model.persoon;

import java.util.ArrayList;

import model.presentie.Afwezigheid;

public class Student extends Persoon {

	private int studentNummer;
	private String groepId;
	private ArrayList<Afwezigheid> afwezigheden;

	public Student(
		String pVoornaam, 
		String pTussenvoegsel, 
		String pAchternaam, 
		String pWachtwoord, 
		String pGebruikersnaam,
		int pStudentNummer) {
		super(
			pVoornaam, 
			pTussenvoegsel, 
			pAchternaam, 
			pWachtwoord, 
			pGebruikersnaam);
		this.setStudentNummer(pStudentNummer);
		this.setGroepId("");
	}

	public Afwezigheid getActieveZiektemelding(){
		return null; // returnt actieve melding die open staat.
	}
	
	public ArrayList<Afwezigheid> getAfwezigheden(){
		return afwezigheden;
	}
	

	public String getGroepId() {
    return this.groepId;	
  }
 
  public void setGroepId(String pGroepId) {
    this.groepId= pGroepId;	
  }
 
	public int getStudentNummer() {
		return this.studentNummer;
	}

	private void setStudentNummer(int pStudentNummer) {
		this.studentNummer = pStudentNummer;
	}
	
}
