package block1.day7;

public class AppBookList {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("book1");
        Book book3 = new Book("book2");
        Book book4 = new Book("book3");
        Book book5 = new Book("book4");
        Book book6 = new Book("'book5","book6");
        Book book7= new Book("MS007","book7");
        Book book8= new Book("MS008","book8");
        Book book9= new Book("MS009","book9");
        Book book10= new Book("MS010","book10");

        BookList bookList = new BookList();
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        bookList.addBook(book4);
        bookList.addBook(book5);
        bookList.addBook(book6);
        bookList.addBook(book7);
        bookList.addBook(book8);
        bookList.addBook(book9);
        bookList.addBook(book10);

        bookList.showBookList();
    }
}
