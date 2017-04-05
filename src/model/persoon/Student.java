//checked
package model.persoon;

import model.presentie.Afwezigheid;

public class Student extends Persoon {

	private int studentNummer;
	private String groepId;
	private Afwezigheid afwezigheden;

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
