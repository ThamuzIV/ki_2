package day7;

public class Book {
    public String codeBook;
    public String nameBook ;
    public String nameAuthor ;
    public int year ;

    public Book() {
        this.codeBook  = "MS0000";
        this.nameBook = "Sách mawck định";
        this.nameAuthor = "CodeGym";
        this.year = 2023;
    }

    public Book(String codeBook) {
        this();
        this.codeBook = codeBook;
    }

    public Book(String codeBook, String nameBook) {
        this(codeBook);
        this.nameBook = nameBook;
    }

    public Book(String codeBook, String nameBook, String nameAuthor) {
        this(codeBook,nameBook);
        this.nameAuthor = nameAuthor;
    }

    public Book(String codeBook, String nameBook, String nameAuthor, int year) {
        this(codeBook, nameBook, nameAuthor);
        this.year = year;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public int getYear() {
        return year;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showBook() {
        System.out.println(
                this.getCodeBook() + "\n" +
                this.getNameBook() + "\n" +
                this.getNameAuthor() + "\n" +
                this.getYear()
        );
    }


}
