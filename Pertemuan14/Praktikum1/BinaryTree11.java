package Pertemuan14.Praktikum1;

public class BinaryTree11 {
    Node11 root;

    public BinaryTree11() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa11 mahasiswa) {
        Node11 newNode = new Node11(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node11 current = root;
            Node11 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    } 

    boolean find(double ipk) {
        boolean result = false;
        Node11 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node11 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node11 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node11 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node11 getSuccessor(Node11 del) {
        Node11 successor = del.right;
        Node11 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node11 parent = root;
        Node11 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            }
            //jika hanya punya 1 anak (kanan)
            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }
            //jika hanya punya 1 anak (kiri)
            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }
            //jika punya 2 anak
            else {
                Node11 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    //Tugas praktikum nomor 1
    public void addRekursif(Node11 current, Mahasiswa11 mahasiswa) {
        if (current == null) {
            root = new Node11(mahasiswa); // Jika tree kosong, tambahkan sebagai root
        } else {
            if (mahasiswa.ipk < current.mahasiswa.ipk) {
                if (current.left == null) {
                    current.left = new Node11(mahasiswa); // Tambahkan ke anak kiri
                } else {
                    addRekursif(current.left, mahasiswa); // Rekursi ke subtree kiri
                }
            } else {
                if (current.right == null) {
                    current.right = new Node11(mahasiswa); // Tambahkan ke anak kanan
                } else {
                    addRekursif(current.right, mahasiswa); // Rekursi ke subtree kanan
                }
            }
        }
    }

    //Tugas praktikum nomor 2
    public Mahasiswa11 cariMinIPK(Node11 current) {
    if (current == null) {
        return null; // Tree kosong
    }
    while (current.left != null) {
        current = current.left; // Terus ke anak kiri
    }
    return current.mahasiswa; // Node paling kiri memiliki IPK terkecil
    }

    public Mahasiswa11 cariMaxIPK(Node11 current) {
    if (current == null) {
        return null; // Tree kosong
    }
    while (current.right != null) {
        current = current.right; // Terus ke anak kanan
    }
    return current.mahasiswa; // Node paling kanan memiliki IPK terbesar
    }

    //Tugas praktikum nomor 3
    public void tampilMahasiswaIPKdiAtas(Node11 current, double ipkBatas) {
    if (current != null) {
        tampilMahasiswaIPKdiAtas(current.left, ipkBatas); // Rekursi ke subtree kiri
        if (current.mahasiswa.ipk > ipkBatas) {
            current.mahasiswa.tampilInformasi(); // Tampilkan jika IPK di atas batas
        }
        tampilMahasiswaIPKdiAtas(current.right, ipkBatas); // Rekursi ke subtree kanan
    }
}
}