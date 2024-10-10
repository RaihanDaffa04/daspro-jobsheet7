import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaTiket = 50000, jumlah = 0, jumlahPelanggan, i = 1, totalTiket = 0;
        double diskon = 0, totalDiskon, totalHarga = 0, Harga;
        System.out.print("Masukkan jumlah pelanggan: ");
        jumlahPelanggan = input.nextInt();
        while (i <= jumlahPelanggan) {
            System.out.print("Masukkan jumlah tiket pelanggan ke-" + i + ": ");
            jumlah = input.nextInt();
            totalTiket += jumlah;
            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkkan lagi jumlah yang valid!");
                continue;
            }if (jumlah > 10) {
                    diskon = 0.15;
                } else if (jumlah > 4 && jumlah <= 10) {
                    diskon = 0.1;
                } else diskon = 0;
                totalDiskon = jumlah * hargaTiket * diskon;
                Harga =  jumlah * hargaTiket - totalDiskon;
                totalHarga += Harga;
                i++;
            }
            System.out.println("Total tiket yang terjual: " + totalTiket);
            System.out.println("Total harga tiket: " + totalHarga);
        }
    }


