package ObjectJava;

class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    // Static block
    static {
        totalNoOfBooks = 0;
    }

    // Instance initialization block
    {
        totalNoOfBooks++;
    }

    // Constructor 1
    Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // Constructor 2
    Book(String isbn) {
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    // Static method
    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    // Borrow a book
    void BorrowedBook() {
        if (isBorrowed) {
            System.out.println("This book is already borrowed from the library.");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book name = " +this.title);
        }
    }

    // Return a book
    void ReturnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book. Please leave a review...");
        } else {
            System.out.println(this.title +" book is already in the library ");
        }
    }

    // Display book info
    void displayInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Object book;
        Book bookDesign = new Book("Author","Design", "1");
        Book bookDesign2 = new Book("Author2","Design", "2");
        Book myBook = new Book("2");
        System.out.println(getTotalNoOfBooks());
        bookDesign.BorrowedBook();
        myBook.BorrowedBook();
        myBook.ReturnBook();
        bookDesign.BorrowedBook();
        bookDesign.ReturnBook();
        bookDesign.ReturnBook();
        myBook.ReturnBook();
        bookDesign.displayInfo();

    }
}
