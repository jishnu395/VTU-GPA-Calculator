
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("THIS SGPA CALCULATOR IS EXCLUSIVE ONLY FOR IOT, CYBERSECURITY & BLOCKCHAIN TECHNOLOGY BRANCH");
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("USN: ");
        String USN = s.nextLine();
        System.out.println("\n---------------------");
        System.out.println("1. Calculate SGPA ");
        System.out.println("2. Calculate CGPA ");
        System.out.println("---------------------\n");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();
        Student student = new Student(name, USN);
        switch (choice) {
            case 1:
                System.out.print("Semester: ");
                int Sem = s.nextInt();
                Subject[] subjects = Sem_Subjects.getSubjects(Sem);
                if (subjects == null || subjects.length == 0) {
                    System.out.println("Invalid Semester!");
                    s.close();
                    return;
                }

                System.out.println("Enter the marks obtained in ");

                for(Subject sub : subjects) {
                    System.out.print(sub.getName() + ": ");
                    int marks = s.nextInt();
                    sub.setMarks(marks);
                }

                Result result = new Result(subjects);
                System.out.println("\n======================================================== SGPA ========================================================");
                System.out.println("Name: " + student.getName());
                System.out.println("USN: " + student.getUSN());
                result.displayResult();
                s.close();
                break;
            case 2:
                System.out.print("Enter total Semesters: ");
                int n = s.nextInt();
                double[] sgpa = new double[n];
                int[] credit = new int[n];
                System.out.println("Credits");
                System.out.println("---------");
                System.out.println("Sem-1: 20\nSem-2: 20\nSem-3: 21\nSem-4: 19\nSem-5: 22\nSem-6: 18\nSem-7: 24\nSem-8: 16\n");

                for(int i = 0; i < n; ++i) {
                    System.out.println("Semester " + (i + 1));
                    System.out.println("---------------");
                    System.out.print("SGPA: ");
                    sgpa[i] = s.nextDouble();
                    System.out.print("Total Credits: ");
                    credit[i] = s.nextInt();
                    System.out.println();
                }

                CGPA_Calculator cgpa = new CGPA_Calculator(sgpa, credit);
                double cgpas = cgpa.calculateCGPA();
                System.out.println("\n========================= CGPA =========================");
                System.out.println("Name: " + student.getName());
                System.out.println("USN: " + student.getUSN());
                System.out.println();
                System.out.printf("%-20s %-10s %-10s", "Semester", "SGPA", "CGPA");
                System.out.println("\n--------------------------------------------");

                for(int i = 0; i < n; ++i) {
                    System.out.printf("%-20s %-10.2f %-10d\n", "Semester-" + (i + 1), sgpa[i], credit[i]);
                }

                System.out.println("\n----------------------");
                System.out.printf("CGPA: %.2f\n", cgpas);
                System.out.println("----------------------");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        s.close();
    }
}
