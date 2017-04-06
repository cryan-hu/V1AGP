package model.presentie;

import java.time.Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Afwezigheid {
	private Calendar beginDatum;
	private Calendar eindDatum;
	private String type;

	public Afwezigheid(String type, Calendar beginDatum, Calendar eindDatum) {
		this.type = type;
		this.beginDatum = beginDatum;
		this.eindDatum = eindDatum;
	}

	public Calendar getBeginDatum() {
		return beginDatum;
	}

	public Calendar getEindDatum() {
		return eindDatum;
	}

	private String getType() {
		return type;
	}

	public String getVolledigeAfwezigheid() {
		String s= "de Volledige afwezigheid is van: "+beginDatum+" tot "+eindDatum+"."; 
		return s; // beginDatum + eindDatum;
	}

	public boolean isActieveZiektemelding() {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now(); 
		if (localDate.isAfter(beginDatum) && localDate.isBefore(eindDatum)) { // begin<datum<eind
			return true;
		} else {
			return false; // hier moet met huidige datum gekeken worden of dat wel in
										// de range van begin en eind datum zit. zoja returnt True,
										// anders false.
		}
	}

	public boolean isZiektemelding(){
			if (beginDatum!=null && eindDatum!=null){
				return true;
			} else{
			return false; // kijken of er begin en eind datum zijn ingesteld zoja dan returnt True anders false;
			}
		}

	private void setBeginDatum(Calendar beginDatum) {
		this.beginDatum = beginDatum;
	}

	private void setType(String type) {
		this.type = type;
	}

}
