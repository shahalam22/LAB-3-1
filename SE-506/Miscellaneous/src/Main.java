public class Main {
    public static void main(String[] args) {
        LibraryAccess accessProxy = new LibraryAccessProxy();

        LibraryItem book = LibraryItemFactory.createItem("book", "R-001", "1984", "George Orwell", "978-0451524935");
        LibraryItem magazine = LibraryItemFactory.createItem("magazine", "R-002", "National Geographic", "June 2023");

        User user1 = new User("U001", false);
        User user2 = new User("U002", true);


        accessProxy.accessItem("R-001", user1);
        accessProxy.accessItem("R-001", user2);

//        user1.updateAccess(true);
//        accessProxy.accessItem("R-001", user1);

        LibraryConfigManager config = LibraryConfigManager.getInstance();
//        config.setLateFee(1.00);
//        System.out.println("Updated late fee: $" + config.getLateFee());
    }
}