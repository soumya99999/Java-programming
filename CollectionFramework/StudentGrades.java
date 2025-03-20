///Stident grade - Create a HashMap where the key is a student's name and the value is their grade. Write method to:
///-add a new student
/// - remove a student
/// -update a students grade
/// -display all students with grades 




import java.util.*;

public class StudentGrades {
    HashMap<String, String> grades;

    public StudentGrades() {
        grades = new HashMap<>();
    }

    public void add(String name, String grade) {
        grades.put(name, grade);
        System.out.println(name + " added with grade " + grade);
    }

    public void remove(String name) {
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println(name + " removed.");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void update(String name, String grade) {
        if (grades.containsKey(name)) {
            grades.put(name, grade);
            System.out.println(name + "'s grade updated to " + grade);
        } else {
            System.out.println("Student not found!");
        }
    }

    public void display() {
        if (grades.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("Student Grades:");
            for (String name : grades.keySet()) {
                System.out.println(name + " - " + grades.get(name));
            }
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Grade");
            System.out.println("4. Display All");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();
                    sg.add(name, grade);
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    name = sc.nextLine();
                    sg.remove(name);
                    break;
                case 3:
                    System.out.print("Enter name to update: ");
                    name = sc.nextLine();
                    System.out.print("Enter new grade: ");
                    grade = sc.nextLine();
                    sg.update(name, grade);
                    break;
                case 4:
                    sg.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}