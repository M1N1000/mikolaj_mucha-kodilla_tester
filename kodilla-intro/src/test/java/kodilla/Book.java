package kodilla;

public class Book {

    private String author;
    private String title;

    public Book(String author,String title){
        this.title = title;
        this.author = author;
    }
    private static String of(String author,String title){
        Book book = new Book(author, title);
        return book;
    }

    public static void main(String[] args) {
        Book book = new Book("Matas","dsada");

    }
}
