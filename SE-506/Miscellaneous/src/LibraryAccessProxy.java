public class LibraryAccessProxy implements LibraryAccess {
    private RealLibraryAccess realAccess;

    public LibraryAccessProxy() {
        this.realAccess = new RealLibraryAccess();
    }

    @Override
    public void accessItem(String itemId, User user) {
        if (checkAccess(itemId, user)) {
            realAccess.accessItem(itemId, user);
        } else {
            System.out.println("Access denied for User " +user.getId()+ " to item: " + itemId);
        }
    }

    private boolean checkAccess(String itemId, User user) {
        // Check if item is restricted and if user has special access
        boolean isRestricted = itemId.startsWith("R-");
        return !isRestricted || user.hasAccess();
    }
}
