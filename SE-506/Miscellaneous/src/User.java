public class User {
    private String id;
    private boolean hasAccess;

    public User(String id, boolean hasAccess) {
        this.id = id;
        this.hasAccess = hasAccess;
    }

    public String getId() {
        return id;
    }

    public boolean hasAccess() {
        return hasAccess;
    }

    public void updateAccess(boolean access) {
        this.hasAccess = access;
    }
}
