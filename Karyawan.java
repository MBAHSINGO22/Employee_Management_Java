package Latihan;

public class Karyawan {
    public int npp;
    public String nama;
    public int jumlahAnak;
    public static final double subsidiPerAnak = 100000.0;

    public Karyawan(int npp, String nama, int jumlahAnak) {
        this.npp = npp;
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
    }

    public double hitungTunjanganAnak() {
        return jumlahAnak * subsidiPerAnak;
    }
}






