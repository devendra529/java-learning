class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void getDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;
     // making a constructor
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override   // override because the get details two times with different 
    public void getDetails() {
        System.out.println("Name: " + getName() +
                           ", Salary: " + getSalary() +
                           ", Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Rahul", 4000); // making Employee object
        emp.getDetails(); // calling method

        Manager mgr = new Manager("Dev", 5000, "CSE");  // Making Manger onject
        mgr.getDetails();
    }
}
