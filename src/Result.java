
public class Result {
    private Subject[] subjects;

    public Result(Subject[] subjects) {
        this.subjects = subjects;
    }

    public double calculate_SGPA() {
        int totalCredits = 0;
        int totalWeightedGrade = 0;

        for(Subject subject : this.subjects) {
            totalCredits += subject.getCredits();
            totalWeightedGrade += subject.getWeightedGrade();
        }

        return totalCredits == 0 ? (double)0.0F : (double)totalWeightedGrade / (double)totalCredits;
    }

    public void displayResult() {
        System.out.printf("\n%-5s %-60s %-20s %-7s %-14s %-8s\n", "S.no", "Subject", "Subject Code", "Marks", "Grade Points", "Credits");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        int i = 1;

        for(Subject s : this.subjects) {
            System.out.printf("%-5d %-60s %-20s %-7d %-14d %-8d\n", i++, s.getName(), s.getCode(), s.getMarks(), s.getGradePoint(), s.getCredits());
        }

        System.out.println("\n-----------------------------------");
        System.out.printf("SGPA: %.2f", this.calculate_SGPA());
        System.out.println("\n-----------------------------------");
    }
}