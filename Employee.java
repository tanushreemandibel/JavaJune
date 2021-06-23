package FirstCode;

public class Employee {
	
		String name;
		int yearOfJoining;
		String address;
		int salary;
		
		public void setSalary(int a) {
			
			System.out.println(a);
			
		}
		
		public static void main(String[] args) {
			
			Employee employee1 = new Employee();
			employee1.name = "Robert";
			employee1.yearOfJoining = 1994;
			employee1.salary = 40000;
			employee1.address = "64C Wallstreet";
			
			Employee employee2 = new Employee();
			employee2.name = "Sam";
			employee2.yearOfJoining = 1993;
			employee2.salary = 60000;
			employee2.address = "64C Wallstreet";
			
			Employee employee3 = new Employee();
			employee3.name = "John";
			employee3.yearOfJoining = 1991;
			employee3.salary = 80000;
			employee1.address = "26B Wallstreet";
			
			System.out.println(employee1.name + " " + employee1.yearOfJoining + " " + employee1.salary + " " + employee1.address
					+ " " + employee2.name + " " + employee2.yearOfJoining + " " + employee2.salary + " " + employee2.address
					+ " " + employee3.name + " " + employee3.yearOfJoining + " " + employee1.salary + " " + employee1.address);
			
		}

	}

