
public class CGPA_Calculator {
    private double[] sgpas;
    private int[] credits;

    public CGPA_Calculator(double[] sgpas, int[] credits) {
        if (sgpas.length != credits.length) {
            System.out.println("Sgpa and Credits should be of the same length");
        }

        this.credits = credits;
        this.sgpas = sgpas;
    }

    public double calculateCGPA() {
        double totalSGPA = (double)0.0F;
        int totalCredits = 0;

        for(int i = 0; i < this.sgpas.length; ++i) {
            totalSGPA += this.sgpas[i] * (double)this.credits[i];
            totalCredits += this.credits[i];
        }

        return totalCredits == 0 ? (double)0.0F : totalSGPA / (double)totalCredits;
    }
}
