package Pertemuan14.Praktikum1;

public class BinaryTreeMain11 {
    public static void main(String[] args) {
        BinaryTree11 bst = new BinaryTree11();

        bst.add(new Mahasiswa11("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa11("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa11("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa11("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDAFTAR SEMUA MAHASISWA (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPENCARIAN DATA MAHASISWA:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        boolean hasilCari = bst.find(3.54);
        System.out.println(hasilCari ? "Ditemukan" : "Tidak ditemukan");

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        boolean hasilCari2 = bst.find(3.22);
        System.out.println(hasilCari2 ? "Ditemukan" : "Tidak ditemukan");

        bst.add(new Mahasiswa11("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa11("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa11("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDAFTAR SEMUA MAHASISWA SETELAH PENAMBAHAN 3 MAHASISWA:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPENGHAPUSAN DATA MAHASISWA:");
        bst.delete(3.57);
        System.out.println("\nDAFTAR SEMUA MAHASISWA SETELAH PENGHAPUSAN 1 MAHASISWA (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}