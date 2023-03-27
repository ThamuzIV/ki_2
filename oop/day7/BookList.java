package day7;

public class BookList {
    Book[] array ;
    int quantity;

    public BookList() {
        this.quantity = 0;
        this.array = new Book[quantity];
    }

    public boolean addBook(Book book) {
        Book[] books = new Book[++this.quantity];

        for (int i = 0; i < books.length - 1; i++) {
                books[i] = this.array[i];
        }
        books[books.length - 1] = book;
        this.array = books;
        return true;
    }

    public void showBookList() {
        for (Book a : this.array) {
            System.out.println(a.getCodeBook());
        }
    }
}
