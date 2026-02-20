package Constructor;

public class Employee {

	    int id;
	    String name;
	    double salary;

	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    void display() {
	        System.out.println("ID: " + id); 
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }

	    public static void main(String[] args) {

	        Employee emp1 = new Employee(101, "Rahul", 50000);
	        Employee emp2 = new Employee(102, "Priya", 60000);

	     
	        emp1.display();
	        emp2.display();
	    }
	}

	        
	        

