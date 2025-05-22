package Pertemuan13;

public class DoubleLinkedList11 {
    Node11 head;
    Node11 tail;

    public DoubleLinkedList11() {
        head = tail;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa11 data) {
        Node11 newNode = new Node11(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa11 data) {
        Node11 newNode = new Node11(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa11 data) {
    Node11 current = head;
    // Cari node dengan nim = keyNim
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    }

    Node11 newNode = new Node11(data);

    // Jika current adalah tail, cukup tambahkan di akhir
    if (current == tail) {
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
    } else {
        // Sisipkan di tengah
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
    if (head == null) {
        System.out.println("Linked list kosong.");
        return;
    }
    Node11 current = head;
    System.out.println("Isi Linked List:");
    while (current != null) {
        current.data.tampil();
        current = current.next;
    }
    }

    public Mahasiswa11 removeFirst() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return null;
    }
    Mahasiswa11 data = head.data;
    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    return data;
    }

    public Mahasiswa11 removeLast() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa dihapus.");
        return null;
    }
    Mahasiswa11 data = tail.data;
    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
    return data;
    }

    public Node11 search(String nim) {
    Node11 current = head;
    while (current != null) {
        if (current.data.nim.equals(nim)) {
            return current;
        }
        current = current.next;
    }
    return null;
    }
}