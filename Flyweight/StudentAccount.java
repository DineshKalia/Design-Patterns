package Flyweight;

/*
 * Author: Dinesh Kalia
 * 
 * This class makes student account that has
 * name and number.
 */

public class StudentAccount implements AccountInterface {

	private int studentNumber;
	private String studentName;
	
	public StudentAccount(String studentName) {
		this.studentName = studentName;
	}
		
	public void setStudentNumber(int stuNumber){
		this.studentNumber=stuNumber;
	}
	
	public int getStudentNumber(){
		return this.studentNumber;
	}
	
	@Override
	public void makeAccount() {
		System.out.println("Made student account with name " + studentName + "  and student number " + studentNumber);
		
	}

}
