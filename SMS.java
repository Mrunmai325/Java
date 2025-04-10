class Student{
	private String name;
	private String dob;
	private String gender;
	
	Student(String name, String gender, String dob){
		this.name=name;
		this.dob=dob;
		this.gender=gender;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDOB(){
		return dob;
	}
	
	public String getGender(){
		return gender;
	}	
	
	public String toString(){
		return "Student Name: " + name + "\nGender: " + gender + "\nDOB:" + dob;
	}
	
}
	
class DSYStudent extends Student{
	
	private float diplomaScore;
	private String branch;
	private String regNo;
	
	DSYStudent(String name, String gender, String dob, float diplomaScore){
		super(name, gender, dob);
		this.diplomaScore=diplomaScore;
		this.branch=generateBranch(diplomaScore);
		this.regNo=generateRegNo(branch);
	}
	private String generateBranch(float diplomaScore){
		float score= 100-diplomaScore;
		if(score<=7){
			return "CS";
		}
		else if(score<=11){
			return "IT";
		}
		else if(score<=15){
			return "EN";
		}
		else if(score<=18){
			return "EL";
		}
		else if(score<=21){
			return "ME";
		}
		else if(score<=25){
			return "IN";
		}
		else if(score<=28){
			return "CE";
		}
		else if(score<=31){
			return "TE";
		}
		else if(score<=36){
			return "PR";
		}
		else{
			return "no branch allocated";
		}
	}
	private String generateRegNo(String branch){
		if(branch.equals("no branch allocated")){
			return "thus no branch";
		}
		else if(branch.equals("CS") || branch.equals("EN")){
			return "2023B" + branch + "5"+(String.format("%2s",System.nanoTime()%12 +1)).replace(' ', '0');
		}
		else if(branch.equals("CE") || branch.equals("EL") || branch.equals("TE")){
			return "2023B" + branch + "50" +(System.nanoTime()%3 +1);
		}
		else if(branch.equals("IN")){
			return "2023B" + branch + "50" + (System.nanoTime()%4 +1);
		}
		return "2023B" + branch + "50" + (System.nanoTime()%6 +1);
	}
	
	public float getDiplomaScore(){
		return diplomaScore;
	}
	
	public String getBranch(){
		return branch;
	}
	
	public String getRegNo(){
		return regNo;
	}
	
	public String toString(){
		return "DSY Student \n" + super.toString() + "\nDiploma Score: " + diplomaScore + "\nBranch: " + branch + "\nRegistration Number: " + regNo;
	}
}
	
		

class RegularStudent extends Student{

	private float percentile;
	private String branch;
	private String regNo;
	
	RegularStudent(String name, String gender, String dob, float percentile){
		super(name, gender, dob);
		this.percentile=percentile;
		this.branch=generateBranch(percentile);
		this.regNo=generateRegNo(branch);
	}
	private String generateBranch(float percentile){
		float score= 100-percentile;
		if(score<=4){
			return "CS";
		}
		else if(score<=8){
			return "IT";
		}
		else if(score<=11){
			return "EN";
		}
		else if(score<=15){
			return "EL";
		}
		else if(score<=18){
			return "ME";
		}
		else if(score<=21){
			return "IN";
		}
		else if(score<=26){
			return "CE";
		}
		else if(score<=30){
			return "TE";
		}
		else if(score<=35){
			return "PR";
		}
		else{
			return "no branch allocated";
		}
	}
	private String generateRegNo(String branch){
		if(branch.equals("no branch allocated")){
			return "thus no branch";
		}
		else if(branch.equals("CS") || branch.equals("EN")){
			return "2023B" + branch + (String.format("%3s",System.nanoTime()%120 +1)).replace(' ', '0');
		}
		else if(branch.equals("CE") || branch.equals("EL") || branch.equals("TE")){
			return "2023B" + branch + "0" +(String.format("%2s", System.nanoTime()%30 +1)).replace(' ', '0');
		}
		else if(branch.equals("IN")){
			return "2023B" + branch + "0" + (String.format("%2s", System.nanoTime()%40 +1)).replace(' ', '0');
		}
		return "2023B" + branch + "0" + (String.format("%2s", System.nanoTime()%60 +1)).replace(' ', '0');
	}
	
	public float getPercentile(){
		return percentile;
	}
	
	public String getBranch(){
		return branch;
	}
	
	public String getRegNo(){
		return regNo;
	}
	
	public String toString(){
		return "Regular Student \n" +super.toString() + "\nPercentile: " + percentile + "\nBranch: " + branch + "\nRegistration Number: " + regNo;
	}
}
	
class SMS{
	public static void main(String[] args){
		RegularStudent s1=new RegularStudent("mrunmai", "female", "03-02-2005", 95.4f);
		System.out.println(s1+"\n");
		DSYStudent s2=new DSYStudent("name", "male", "29-02-2005", 97.8f);
		System.out.println(s2+"\n");
		System.out.println(s1.getName());
		System.out.println(s1.getDOB());
		System.out.println(s1.getGender());
		System.out.println(s1.getPercentile());
		System.out.println(s1.getBranch());
		System.out.println(s1.getRegNo());
		System.out.println(s2.getDiplomaScore());
	}
}
