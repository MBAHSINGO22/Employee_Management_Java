package Latihan;

public class KaryawanKontrak extends Karyawan {
    private double upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(int npp, String nama, int jumlahAnak, double upahHarian, int jumlahHariMasuk) {
        super(npp, nama, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public double hitungUpahTotal() {
        return (upahHarian * jumlahHariMasuk) + hitungTunjanganAnak();
    }
}

