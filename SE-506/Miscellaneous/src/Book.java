public class Book implements LibraryItem{
    private String id;
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable = true;

    public Book(String id, String title, String author, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getDetails() {
        return String.format("Book: %s by %s (ISBN: %s)", title, author, isbn);
    }

    @Override
    public void borrowItem() {
        isAvailable = false;
    }
}
