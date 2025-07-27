
public class Student {
    private String USN;
    private String name;

    public Student(String name, String USN) {
        this.name = name;
        this.USN = USN;
    }

    public String getName() {
        return this.name;
    }

    public String getUSN() {
        return this.USN;
    }
}
