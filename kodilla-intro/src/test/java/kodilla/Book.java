package kodilla;


    public class Book {
        private String author = "Isaac Asimov";
        private String title = "Isaac Asimov";
        public Book(String author,String title){
            this.author = author;
            this.title = title;

            Book book = new Book("Isaac Asimov", "Isaac Asimov");
        }
        public static Book of(String author, String title){
            return new Book(author, title);
            Book book = Book.of("Isaac Asimov", "Isaac Asimov");
            System.out.println(book);

        }
    }









