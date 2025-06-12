public class Book11 {
    public String isbn;
    public String title;

    public Book11() {
        
    }

    public Book11(String isbn, String title) { 
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + ", Title: " + this.title;
    }
}