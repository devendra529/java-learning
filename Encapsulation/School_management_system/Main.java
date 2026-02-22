import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View All Students");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    Student s = new Student(id, name, age, marks);
                    manager.addStudent(s);
                    break;
                case 2:
                    System.out.print("Enter ID of student to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();
                    manager.updateStudent(updateId, newName, newAge, newMarks);
                    break;
                case 3:
                    System.out.print("Enter ID of student to delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteStudent(deleteId);
                    break;
                case 4:
                    manager.viewAllStudents();
                    break;
                case 5:
                    System.out.print("Enter ID of student to search: ");
                    int searchId = sc.nextInt();
                    manager.searchStudent(searchId);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting Student Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
