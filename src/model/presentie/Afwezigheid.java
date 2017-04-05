package model.presentie;

import java.time.LocalDate;

public class Afwezigheid {
		private LocalDate beginDatum;
		private LocalDate eindDatum;
		private String type;
		
		public Afwezigheid(String type, LocalDate beginDatum, LocalDate eindDatum)	{
			this.type = type;
			this.beginDatum = beginDatum;
			this.eindDatum = eindDatum;
		}
		
		public LocalDate getBeginDatum(){
			return beginDatum;
		}
		
		public LocalDate getEindDatum(){
			return eindDatum;
		}
		
		private String getType(){
			return type;
		}
		
		public String getVolledigeAfwezigheid(){
			return null; //beginDatum + eindDatum;
		}
		
		public boolean isActieveZiektemelding(){
			return false; // hier moet met huidige datum gekeken worden of dat wel in de range van begin en eind datum zit. zoja returnt True, anders false.
		}
		
		public boolean isZiektemelding(){
			return false; // kijken of er begin en eind datum zijn ingesteld zoja dan returnt True anders false;
		}
		
		private void setBeginDatum(LocalDate beginDatum){
			this.beginDatum = beginDatum;
		}
		
		private void setType(String type){
			this.type = type;
		}
		
		
}
