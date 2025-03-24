import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the student's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Read the student's roll number
        System.out.print("Enter your roll number: ");
        int rollNo = scanner.nextInt();

        // Display the entered information
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);

        // Close the scanner object
        scanner.close();
    }
}

