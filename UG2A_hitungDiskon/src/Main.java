import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBarang;
        double hargaSatuan, totalBelanja, diskon, totalAkhir;

        System.out.print("Banyak Belanjaan: ");
        jumlahBarang = scanner.nextInt();

        totalBelanja = 0;

        for (int i = 1; i <= jumlahBarang; i++){
            System.out.print("Harga barang ke-"+ i +": ");
            hargaSatuan = scanner.nextDouble();
            totalBelanja += hargaSatuan;
        }

        System.out.println("Total harga: "+totalBelanja);

        if (totalBelanja >= 101000 && totalBelanja <= 200000){
            diskon = 0.05;
        } else if (totalBelanja >= 201000 && totalBelanja <= 400000) {
            diskon = 0.1;
        } else if (totalBelanja > 400000) {
            diskon = 0.2;
        }else {
            diskon = 0;
        }
        totalAkhir = totalBelanja * (1 - diskon);

        System.out.println("Diskon : "+ (int)(diskon * 100)+"%");
        System.out.println("Total bayar setelah diskon: "+ totalAkhir);
    }
}
