package TugasJobsheet11;

public class QueueLayanan11 {
    MahasiswaQueue11 front, rear;
    int size, maxSize;

    public QueueLayanan11(int maxSize) {
        this.front = this.rear = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void enqueue(String nim, String nama, String keperluan) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        MahasiswaQueue11 baru = new MahasiswaQueue11(nim, nama, keperluan);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Mahasiswa dengan NIM " + front.nim + " dipanggil dan keluar dari antrian.");
        front = front.next;
        size--;
        if (front == null) rear = null;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Antrian:");
        MahasiswaQueue11 temp = front;
        int no = 1;
        while (temp != null) {
            System.out.println(no++ + ". " + temp.nim + " - " + temp.nama + " (" + temp.keperluan + ")");
            temp = temp.next;
        }
    }

    public void printFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian terdepan: " + front.nim + " - " + front.nama + " (" + front.keperluan + ")");
        }
    }

    public void printRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling akhir: " + rear.nim + " - " + rear.nama + " (" + rear.keperluan + ")");
        }
    }

    public int getSize() {
        return size;
    }
}