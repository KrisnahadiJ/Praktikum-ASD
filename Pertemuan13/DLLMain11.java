package Pertemuan13;

import java.util.Scanner;

public class DLLMain11 {
    static Mahasiswa11 inputMahasiswa(Scanner sc) {
    System.out.print("Masukkan NIM: ");
    String nim = sc.nextLine(); // Baca NIM sebagai String
    System.out.print("Masukkan Nama: ");
    String nama = sc.nextLine();
    System.out.print("Masukkan Kelas: ");
    String kelas = sc.nextLine();

    double ipk = 0;
    boolean valid = false;
    while (!valid) {
        System.out.print("Masukkan IPK: ");
        String ipkInput = sc.nextLine(); // Baca IPK sebagai String terlebih dahulu
        try {
            ipk = Double.parseDouble(ipkInput); // Coba parsing ke double
            valid = true; // Jika berhasil, keluar dari loop
        } catch (NumberFormatException e) {
            System.out.println("Input IPK harus berupa angka desimal. Silakan coba lagi.");
        }
    }

    return new Mahasiswa11(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedList11 list = new DoubleLinkedList11();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Sisipkan setelah node tertentu");
            System.out.println("7. Cari Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa11 mhs = inputMahasiswa(sc);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa11 mhs = inputMahasiswa(sc);
                    list.addLast(mhs);
                }
                case 3 -> {
                    Mahasiswa11 mhs = list.removeFirst();
                    if (mhs != null) {
                        System.out.println("Data dihapus dari awal:");
                        mhs.tampil();
                    } else {
                        System.out.println("List kosong.");
                    }
                }
                case 4 -> {
                    Mahasiswa11 mhs = list.removeLast();
                    if (mhs != null) {
                        System.out.println("Data dihapus dari akhir:");
                        mhs.tampil();
                    } else {
                        System.out.println("List kosong.");
                    }
                }
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM node yang akan disisipkan setelahnya: ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data untuk node baru:");
                    Mahasiswa11 mhs = inputMahasiswa(sc);
                    list.insertAfter(keyNim, mhs);
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimCari = sc.nextLine();
                    Node11 found = list.search(nimCari);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}