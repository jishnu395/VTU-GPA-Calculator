
public class Subject {
    private String name;
    private String code;
    private int credits;
    private int gradepoint;
    private int marks;

    public Subject(String name, String code, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        this.gradepoint = this.calculateGradePoint(marks);
    }

    private int calculateGradePoint(int marks) {
        if (marks >= 90) {
            return 10;
        } else if (marks >= 80) {
            return 9;
        } else if (marks >= 70) {
            return 8;
        } else if (marks >= 60) {
            return 7;
        } else if (marks >= 50) {
            return 6;
        } else {
            return marks >= 38 ? 5 : 0;
        }
    }

    public int getMarks() {
        return this.marks;
    }

    public String getName() {
        return this.name;
    }

    public int getGradePoint() {
        return this.gradepoint;
    }

    public int getCredits() {
        return this.credits;
    }

    public int getWeightedGrade() {
        return this.gradepoint * this.credits;
    }

    public String getCode() {
        return this.code;
    }
}
