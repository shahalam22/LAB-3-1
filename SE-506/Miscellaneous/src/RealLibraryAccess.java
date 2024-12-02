import java.util.HashMap;
import java.util.Map;

public class RealLibraryAccess implements LibraryAccess {
    @Override
    public void accessItem(String itemId, User user) {
        System.out.println("User " +user.getId() + " Accessing item: " + itemId);
    }
}
