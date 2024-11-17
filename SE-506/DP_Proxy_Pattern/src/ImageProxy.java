public class ImageProxy implements Image {
    protected String filename;
    private HighResolutionImage highResImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (highResImage == null) {
            highResImage = new HighResolutionImage(filename);
        }
        highResImage.display();
    }
}