package Pertemuan12;

public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();

        Mahasiswa11 mhs1 = new Mahasiswa11("21212203", "Dirga", "4D", 3.6);
        Mahasiswa11 mhs2 = new Mahasiswa11("22212202", "Cintia", "3C", 3.5);
        Mahasiswa11 mhs3 = new Mahasiswa11("23212201", "Bimon", "2B", 3.8);
        Mahasiswa11 mhs4 = new Mahasiswa11("24212200", "Alvaro", "1A", 4.0);

        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("Data pada indeks 1:");
        sll.getData11(1);

        System.out.println("Data mahasiswa bernama Bimon berada pada indeks: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}