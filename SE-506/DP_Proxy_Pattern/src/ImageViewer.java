import java.util.ArrayList;
import java.util.List;

public class ImageViewer {
    private List<Image> imageList = new ArrayList<>();

    public void addImage(String filename) {
        Image image = new ImageProxy(filename);
        imageList.add(image);
        System.out.println("Added image: " + filename);
    }

    public void displayImage(int index) {
        if (index >= 0 && index < imageList.size()) {
            imageList.get(index).display();
        } else {
            System.out.println("Invalid image index");
        }
    }

    public void displayImageList() {
        System.out.println("\nImage list:");
        for (int i = 0; i < imageList.size(); i++) {
            System.out.println((i + 1) + ". " + ((ImageProxy) imageList.get(i)).filename);
        }
    }
}
