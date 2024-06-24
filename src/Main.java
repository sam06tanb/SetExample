

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students for course A?");
        int numStudentsA = scanner.nextInt();
        scanner.nextLine();
        String studentsA = readStudents(numStudentsA, scanner);

        System.out.println("How many students for course B?");
        int numStudentsB = scanner.nextInt();
        scanner.nextLine();
        String studentsB = readStudents(numStudentsB, scanner);

        System.out.println("How many students for course C?");
        int numStudentsC = scanner.nextInt();
        scanner.nextLine();
        String studentsC = readStudents(numStudentsC, scanner);

        Set<Integer> alexStudents = new HashSet<>();

        addStudents(studentsA, alexStudents);
        addStudents(studentsB, alexStudents);
        addStudents(studentsC, alexStudents);

        int totalStudents = alexStudents.size();

        System.out.println("Total students: " + totalStudents);
    }

    private static String readStudents(int numStudents, Scanner scanner) {
        StringBuilder students = new StringBuilder();
        System.out.println();
        for (int i = 0; i < numStudents; i++) {
            int student = scanner.nextInt();
            students.append(student).append("\n");
        }
        return students.toString();
    }

    private static void addStudents(String students, Set<Integer> studentSet) {
        String[] studentsArray = students.split("\n");
        for (String student : studentsArray) {
            int studentCode = Integer.parseInt(student.trim());
            studentSet.add(studentCode);
        }
    }
}
