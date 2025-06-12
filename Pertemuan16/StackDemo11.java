import java.util.Stack;

public class StackDemo11 {
    public static void main(String[] args) {
        Book11 book1 = new Book11("1234", "Dasar Pemrograman");
        Book11 book2 = new Book11("7145", "Hafalah Shalat Delisa");
        Book11 book3 = new Book11("3562", "Muhammad Al-Fatih");

        Stack<Book11> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book11 temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book11 temp2 = books.peek();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book11 book : books) {
            System.out.println(book.toString());
        }
    }
}