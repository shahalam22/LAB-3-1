public class HighResolutionImage implements Image {
    private String filename;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading high-resolution image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying high-resolution image: " + filename);
    }
}
