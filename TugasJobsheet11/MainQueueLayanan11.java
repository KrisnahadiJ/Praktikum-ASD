package TugasJobsheet11;

import java.util.Scanner;

public class MainQueueLayanan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas maksimal antrian: ");
        int max = sc.nextInt();
        sc.nextLine();

        QueueLayanan11 queue = new QueueLayanan11(max);

        int pilih;
        do {
            System.out.println("\n=== Menu Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String keperluan = sc.nextLine();
                    queue.enqueue(nim, nama, keperluan);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printFront();
                    break;
                case 4:
                    queue.printRear();
                    break;
                case 5:
                    queue.printQueue();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa yang masih mengantri: " + queue.getSize());
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}