package day7;

public class AppBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setNameBook("Lập trình hướng đối tượng cơ bản");
        book1.showBook();
        book1.setYear(2024);
        System.out.println(
                book1.getCodeBook() + "\n" +
                book1.getNameBook() + "\n" +
                book1.getYear()
        );

        Book book2 = new Book("MS0001","Sách hay");
        book2.setNameAuthor("Minh");
        book2.setYear(2024);
        book2.showBook();
    }
}
