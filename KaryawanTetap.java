package Latihan;

public class KaryawanTetap extends Karyawan {
    public double gajiPokok;

    public KaryawanTetap(int npp, String nama, int jumlahAnak, double gajiPokok) {
        super(npp, nama, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    public double hitungGajiTotal() {
        return gajiPokok + hitungTunjanganAnak();
    }
}


