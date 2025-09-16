package PBO.week3.nilai;

public class ceknilai {
    public String dapatkanHasil(int skor) {
        if (skor > 100 || skor < 0) {
            return "Error: Skor yang dimasukkan tidak valid.";
        }
        String statusKelulusan;
        String grade;

        if (skor >= 85) {
            statusKelulusan = "Lulus";
            grade = "A";
        } else if (skor >= 70) {
            statusKelulusan = "Lulus";
            grade = "B";
        } else if (skor >= 60) {
            statusKelulusan = "Lulus";
            grade = "C";
        } else if (skor >= 50) {
            statusKelulusan = "Tidak Lulus";
            grade = "D";
        } else {
            statusKelulusan = "Tidak Lulus";
            grade = "E";
        }
        
        return "Status Kelulusan: " + statusKelulusan + "\nGrade Nilai: " + grade;
    }
}
