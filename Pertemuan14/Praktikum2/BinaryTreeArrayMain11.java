package Pertemuan14.Praktikum2;

public class BinaryTreeArrayMain11 {
    public static void main(String[] args) {
        BinaryTreeArray11 bta = new BinaryTreeArray11(); // Instansiasi objek BinaryTreeArray11

        Mahasiswa11 mhs1 = new Mahasiswa11("244160121", "Ali", "A", 3.57);
        Mahasiswa11 mhs2 = new Mahasiswa11("244160185", "Candra", "C", 3.41);
        Mahasiswa11 mhs3 = new Mahasiswa11("244160220", "Badar", "B", 3.75);
        Mahasiswa11 mhs4 = new Mahasiswa11("244160221", "Dewi", "B", 3.35);
        Mahasiswa11 mhs5 = new Mahasiswa11("244160131", "Devi", "A", 3.48);
        Mahasiswa11 mhs6 = new Mahasiswa11("244160205", "Ehsan", "D", 3.62);
        Mahasiswa11 mhs7 = new Mahasiswa11("244160170", "Fizi", "B", 3.86);

        Mahasiswa11[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null}; // Tetap 10 elemen, karena array di BinaryTreeArray11[10]
        int idxLast = 6; // Karena ada 7 elemen yang diisi (indeks 0-6)

        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0); // Mulai traversal dari indeks 0 (root)
    }
}