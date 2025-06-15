//Create a class Book with a parameterized constructor (title, author, pages). Print the details of 2 books.
class Book {
    String title;
    String author;
    int pages;

    Book(String req_title, String req_author, int req_pages) {
        title = req_title;
        author = req_author;
        pages = req_pages;
    }

    void show() {
        System.out.println("Book title is:" + title + "and author is:" + author + "total pages is:" + pages);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Book b1 = new Book("Two men", "James", 12);
        Book b2 = new Book("Three men", "James katen", 13);
        b1.show();
        b2.show();
    }
}
