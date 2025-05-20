package TugasJobsheet11;

public class MahasiswaQueue11 {
    String nim, nama, keperluan;
    MahasiswaQueue11 next;

    public MahasiswaQueue11(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
        this.next = null;
    }
}