package logicspackage;

class StuData{
	String rollNum, stuName, stuBranch;
	void sData() {
		System.out.println("RollNumber  ="+ rollNum);
		System.out.println("Name =" +stuName);
		System.out.println("Branch =" +stuBranch);
	}
}
class StuAddress{
	String hno, city, state;
	int pincode;
	void sAdd() {
		System.out.println("House No ="+ hno);
		System.out.println("City =" +city);
		System.out.println("State =" +state);
		System.out.println("Pincode =" +pincode);
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		StuData sd = new StuData();
		StuAddress sa = new StuAddress();
		
		sd.rollNum="A01";
		sd.stuName = "Raj";
		sd.stuBranch = "CSC";

		sa.hno="90";
		sa.city="Hyd";
		sa.state="Telangana";
		sa.pincode=12345;

		sd.sData();
		sa.sAdd();

	}

}
