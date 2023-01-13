import java.util.Scanner;

public class ConditionalIf {
    public static void main(String[] args) {
        Scanner usrInput = new Scanner(System.in);

        System.out.print("Enter Current Time (1 - 24) : ");
        int time = usrInput.nextInt();

        String day = "Senin";
        //single if stateament ( 1 tingkat )
        if (time < 10 && (day.equals("Senin"))) {
            System.out.println("Good morning.");

        //Multiple if statements
        } else if (time < 18) {
            System.out.println("Good day.");
        } else if (time < 24){
            System.out.println("Good evening.");
        } else {
            System.out.println("Waktu tidak ditemukan!");
        }
    }
}

// TO DO
/*
Buatlah program untuk menentukan kelulusan siswa SMP Harapan Indah.
Requirements:
    - Jika nilai siswa kurang dari 45, maka Print "Mohon Maaf Anda Belum Lulus!"
    - Jika nilai siswa 45 - 59, Print "Anda lulus dengan nilai KKM!"
    - Jika nilai siswa 60 - 79, Print "Selamat, Anda lulus!"
    - Jika nilai siswa 80 - 100, Print "Selamat, anda lulus dengan nilai yang memuaskan!"
 */
