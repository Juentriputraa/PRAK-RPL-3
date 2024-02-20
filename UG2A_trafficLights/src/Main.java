import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mobil M_71210774 = new Mobil();
        M_71210774.jalan();
        M_71210774.kurangiKecepatan();
        M_71210774.berhenti();

        PejalanKaki P_71210774 = new PejalanKaki();
        P_71210774.menyebrang();
        P_71210774.bersiap();
        P_71210774.menunggu();

        System.out.print("Masukkan kode lampu lalu lintas: ");
        int kodeLampu = scanner.nextInt();

        if (kodeLampu == 1) {
            M_71210774.jalan();
            P_71210774.menunggu();
        } else if (kodeLampu == 2) {
            M_71210774.kurangiKecepatan();
            P_71210774.bersiap();
        } else if (kodeLampu == 3) {
            M_71210774.berhenti();
            P_71210774.menyebrang();
        } else {
            System.out.println("Kode lampu lalu lintas tidak valid.");
        }
    }
}