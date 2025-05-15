package Pertemuan12;

import java.util.Scanner;

public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data yang ingin ditambahkan:");
        int jumlahData = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan data ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            sll.addLast(mhs); 
        }

        System.out.println("\nData dalam Linked List:");
        sll.print();

        sc.close();
    }
}