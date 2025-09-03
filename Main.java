package Latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jenis karyawan (1: Tetap, 2: Kontrak):");
        int jenisKaryawan = scanner.nextInt();

        System.out.println("Masukkan NPP:");
        int npp = scanner.nextInt();

        System.out.println("Masukkan nama:");
        String nama = scanner.next();

        System.out.println("Masukkan jumlah anak:");
        int jumlahAnak = scanner.nextInt();

        if (jenisKaryawan == 1) {
            System.out.println("Masukkan gaji pokok:");
            double gajiPokok = scanner.nextDouble();

            KaryawanTetap karyawanTetap = new KaryawanTetap(npp, nama, jumlahAnak, gajiPokok);
            System.out.println("Gaji total: " + karyawanTetap.hitungGajiTotal());
        } else if (jenisKaryawan == 2) {
            System.out.println("Masukkan upah harian:");
            double upahHarian = scanner.nextDouble();

            System.out.println("Masukkan jumlah hari masuk:");
            int jumlahHariMasuk = scanner.nextInt();

            KaryawanKontrak karyawanKontrak = new KaryawanKontrak(npp, nama, jumlahAnak, upahHarian, jumlahHariMasuk);
            System.out.println("Upah total: " + karyawanKontrak.hitungUpahTotal());
        } else {
            System.out.println("Jenis karyawan tidak valid.");
        }

    }
}
