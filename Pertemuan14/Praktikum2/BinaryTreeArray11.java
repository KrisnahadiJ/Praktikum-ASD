package Pertemuan14.Praktikum2;

public class BinaryTreeArray11 { 
    Mahasiswa11[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray11() {
        this.dataMahasiswa = new Mahasiswa11[10];
    }

    void populateData(Mahasiswa11 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    //Tugas praktikum nomor 4
    void add(Mahasiswa11 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++; // Tambahkan indeks terakhir
            dataMahasiswa[idxLast] = data; // Masukkan data ke array
        } else {
            System.out.println("Tree penuh, tidak bisa menambahkan data.");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi(); // Node saat ini
                traversePreOrder(2 * idxStart + 1); // Anak kiri
                traversePreOrder(2 * idxStart + 2); // Anak kanan
            }
        }
    }
}