package kodilla;

public class Book {
    private String author;
    private String title;



    public static void of(String author, String title){
        this.author = author;
        this.title = title;
    }
    public static void main(String[] args){
        Book book = new Book.of("dsa", "pol");
    }



    }


