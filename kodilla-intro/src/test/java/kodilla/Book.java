package kodilla;

public class Book {
    private String author = "Isaac Asimov";
    private String title = "The Galaxy";

    public static String of(){
        String book = Book.of();
        System.out.println(book);
        return book;
    }





}
