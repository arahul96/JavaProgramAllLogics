package logicspackage;

class EmpData{
	String empId, empName, empDesg;
	void empDt() {
		System.out.println("EmpId ="+ empId);
		System.out.println("EmpName =" +empName);
		System.out.println("EmpDesg =" +empDesg);
	}
}
class EmpAddress{
	String hno, city, state;
	int pincode;
	void empAd() {
		System.out.println("House No ="+ hno);
		System.out.println("City =" +city);
		System.out.println("State =" +state);
		System.out.println("Pincode =" +pincode);
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		EmpData ed = new EmpData();
		EmpAddress ea = new EmpAddress();
		
		ed.empId="001";
		ed.empName = "Raj";
		ed.empDesg = "Tester";

		ea.hno="90";
		ea.city="Hyd";
		ea.state="Telangana";
		ea.pincode=12345;

		ed.empDt();
		ea.empAd();

	}

}
