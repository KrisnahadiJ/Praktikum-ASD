package Pertemuan12;

class SingleLinkedList11 {
    
    NodeMahasiswa11 head;
    NodeMahasiswa11 tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa11 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                if (tmp.data != null) {
                    tmp.data.tampilInformasi();
                }
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa11 input) {
        NodeMahasiswa11 ndInput = new NodeMahasiswa11(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa11 input) {
        NodeMahasiswa11 ndInput = new NodeMahasiswa11(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa11 input) {
        NodeMahasiswa11 ndInput = new NodeMahasiswa11(input, null); 
        NodeMahasiswa11 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break; 
            }
            temp = temp.next; 
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa11 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa11 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa11(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}