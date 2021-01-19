package PartB;

/*
 * Develop a small java application, which accepts employee id from the command
prompt and displays the details using arrays
Emp No
Emp Name Department
Designation
and Salary
Your may assume that the array is initialized with the following details

Basically that huge program
 */

public class Prog1 {
	int empNo, basic, hra, it;
	String empName, joinDate, dept;
	char desigCode;
	
	Prog1(int index) {
		int empNos[] = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
		String empNames[] = {"Abc", "Opqr", "Ghi", "Wxyz", "Jklmn", "Stuv", "Def"};
		String joinDates[] = {
			"01/04/2009", "23/08/2012", "12/1112008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"
		};
		char desigCodes[] = {'E', 'C', 'K', 'R', 'M', 'E', 'C'};
		String depts[] = {"R&D", "PM", "Acct", "Front desk", "Engg", "Manufacturing", "PM"};
		int basics[] = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
		int HRAs[] = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
		int ITs[] = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
				
		empNo = empNos[index];
		basic = basics[index];
		hra = HRAs[index];
		it = ITs[index];
		empName = empNames[index];
		joinDate = joinDates[index];
		dept = depts[index];
		desigCode = desigCodes[index];
	}
	
	void show() {
		System.out.println("EmpNo = " + empNo);
		System.out.println("EmpName = " + empName);
		System.out.println("Join date = " + joinDate);
		System.out.println("Desig code = " + desigCode);
		System.out.println("Dept = " + dept);
		System.out.println("Basic = " + basic);
		System.out.println("HRA = " + hra);
		System.out.println("IT = " + it);
	}
	
	
	public static void main(String args[]) {
		Prog1 obj[] = new Prog1[10];
		
		int i;
		
		for (i = 0; i < 7; i++) {
			obj[i] = new Prog1(i);
		}
		
		int key = 0;
		
		try {
			key =  Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("No cmd line args were given. Exiting...");
			System.exit(0);
		}
		
		int pos = -1;
		
		for (i = 0; i < 7; i++) {
			if (obj[i].empNo == key) {
				pos = i;
				break;
			}
		}
		
		if (pos == -1) {
			System.out.println("The employee with that number wasn't found");
			System.exit(0);
		} else {
			obj[pos].show();		
		}
		
		int da = 0;
		
		switch(obj[pos].desigCode) {
			case 'E': 
				da = 20000;
				System.out.println("Designation = Engineer");
				break;
			case 'C': 
				da = 32000;
				System.out.println("Designation = Consultant");
				break;
			case 'K': 
				da = 12000;
				System.out.println("Designation = Clerk");
				break;
			case 'R': 
				da = 15000;
				System.out.println("Designation = Receptionist");
				break;
			case 'M': 
				da = 40000;
				System.out.println("Designation = Manager");
				break;
		}
		
		int sal = obj[pos].basic + obj[pos].hra + da - obj[pos].it;
		
		System.out.println("Salary = " + sal);
	}
}
