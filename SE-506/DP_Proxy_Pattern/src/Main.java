public class Main {
    public static void main(String[] args) {
        ImageViewer viewer = new ImageViewer();

        viewer.addImage("photo1.jpg");
        viewer.addImage("photo2.jpg");
        viewer.addImage("photo3.jpg");

        viewer.displayImageList();

        System.out.println("\nImage 2:");
        viewer.displayImage(1);

        System.out.println("\nImage 1:");
        viewer.displayImage(0);

        System.out.println();
        viewer.displayImage(0);
    }
}
