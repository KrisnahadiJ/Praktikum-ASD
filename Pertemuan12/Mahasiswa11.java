package Pertemuan12;

public class Mahasiswa11 {
    public String nim;
    public String nama;
    public String kelas;
    public double ipk;

    public Mahasiswa11(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.2f\n", nama, nim, kelas, ipk);
    }
}