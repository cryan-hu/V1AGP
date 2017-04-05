package model.presentie;

import model.persoon.Student;

public class Presentie {
	private boolean isAanwezig;
	private Student student; 
	private Les les;
	private boolean opnameDoorDocent;
	
	public Presentie(boolean isAanwezig, Student student, Les les, boolean opnameDoorDocent){
		this.isAanwezig = isAanwezig;
		this.student = student; 
		this.les = les;
		this.opnameDoorDocent = opnameDoorDocent;
	}
	
	public boolean isOpnameDoorDocent(){
		boolean status = false;
		return status;
	}
	
	public void setOpnameDoorDocent(boolean){
		boolean status = false;
		return status;
	}
	
	public Les getLes(){
		return les;
	}
	
	public void setLes(Les){
		
	}
	
	public getStudent(){
		return student;
	}
	
	public void setStudent(Student){
		
	}
	
	public boolean isAanwezig(){
		boolean status = false;
		return status;
	}
	
	public setAanwezig(boolean){
		
	}

}
