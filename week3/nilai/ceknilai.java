package PBO.week3.nilai;

public class ceknilai {
    public String dapatkanHasil(int skor) {
        if (skor > 100 || skor < 0) {
            return "error: skor yang dimasukkan tidak valid.";
        }
        String statusKelulusan;
        String grade;

        if (skor >= 85) {
            statusKelulusan = "lulus";
            grade = "A";
        } else if (skor >= 70) {
            statusKelulusan = "lulus";
            grade = "B";
        } else if (skor >= 60) {
            statusKelulusan = "lulus";
            grade = "C";
        } else if (skor >= 50) {
            statusKelulusan = "tidak lulus";
            grade = "D";
        } else {
            statusKelulusan = "tidak lulus";
            grade = "E";
        }
        
        return "status kelulusan: " + statusKelulusan + "\nGrade Nilai: " + grade;
    }
}
