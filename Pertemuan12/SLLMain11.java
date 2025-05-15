package Pertemuan12;

public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();

        Mahasiswa11 mhs1 = new Mahasiswa11("21212203", "Dirga", "4D", 3.6);
        Mahasiswa11 mhs2 = new Mahasiswa11("22212202", "Cintia", "3C", 3.5);
        Mahasiswa11 mhs3 = new Mahasiswa11("23212201", "Bimon", "2B", 3.8);
        Mahasiswa11 mhs4 = new Mahasiswa11("24212200", "Alvaro", "1A", 4.0);

        sll.print(); 

        sll.addFirst(mhs1);
        sll.print();

        sll.addLast(mhs4);
        sll.print();

        sll.insertAt(2, mhs2); 
        sll.insertAfter("Cintia", mhs3); 
        sll.print();
    }
}