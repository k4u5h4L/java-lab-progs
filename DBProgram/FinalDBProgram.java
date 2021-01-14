package DBProgram;

import java.util.Scanner;

public class FinalDBProgram {
	public static void main(String[] args) {
		for (;;) {
			Scanner in = new Scanner(System.in);
			System.out.println(
					"\n 1. Insert Emp \n 2. Delete Emp \n 3.Display Acc to Name \n 4. Display All \n 5. Exit \n");
			System.out.println("Enter your choice");
			int n = in.nextInt();
			Employee e = new Employee();
			DAO d = new DAO();
			switch (n) {
			case 1:
				System.out.println("Enter the Employee Name : ");
				e.setName(in.next());
				System.out.println("Enter the Age : ");
				e.setAge(in.nextInt());
				System.out.println("Enter the Dept : ");
				e.setDept(in.next());
				System.out.println("Enter the Salary : ");
				e.setSal(in.nextDouble());
				d.insertemp(e);
				System.out.println("Employee added successfully");
				break;
			case 2:

				System.out.println("Enter the employee name : ");
				String Newname = in.next();
				d.deleteemp(Newname);
				System.out.println("Employee deleted successfully\n");
				break;
			case 3:
				System.out.println("Enter the Employee name to display its attributes : ");
				String ename = in.next();
				System.out.println("Employee details...");
				d.displayname(ename);
				break;
			case 4:
				System.out.println("Employee deatils are as follows...");
				d.displayall();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Please Choose Valid option \n");
				break;
			}
		}
	}
}