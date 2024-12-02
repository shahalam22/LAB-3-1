public class LibraryItemFactory {
    public static LibraryItem createItem(String type, String... args) {
        switch (type.toLowerCase()) {
            case "book":
                return new Book(args[0], args[1], args[2], args[3]);
            case "magazine":
                return new Magazine(args[0], args[1], args[2]);
            default:
                throw new IllegalArgumentException("Unknown item type");
        }
    }
}
