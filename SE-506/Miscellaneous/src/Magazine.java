public class Magazine implements LibraryItem{
    private String id;
    private String title;
    private String issue;
    private boolean isAvailable = true;

    public Magazine(String id, String title, String issue) {
        this.id = id;
        this.title = title;
        this.issue = issue;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getDetails() {
        return String.format("Magazine: %s - Issue: %s", title, issue);
    }

    @Override
    public void borrowItem() {
        isAvailable = false;
    }
}
