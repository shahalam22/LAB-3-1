public class Main {
    public static void main(String[] args) {
        Clothing redClothing = new Clothing("Red T-Shirt", "Clothing", 20.99, "Red", "M");
//        Electronic electronic1 = new Electronic("Smartphone", "Electronics", 699.99, "128GB", 24);

        ProductRegistry registry = new ProductRegistry();
        registry.addPrototype("Red T-Shirt", redClothing);
//        registry.addPrototype("Smartphone 128", electronic1);

        Product clonedredClothing = registry.getPrototype("Red T-Shirt");
//        Product clonedElectronic1 = registry.getPrototype("Smartphone 128");

        System.out.println("Cloned Products:");
        clonedredClothing.printProduct();
//        clonedElectronic1.printProduct();

        // Create another customized variant of the clothing
        Clothing blueClothing = (Clothing) registry.getPrototype("Red T-Shirt");
        blueClothing.name = "Blue T-Shirt";
        blueClothing.printProduct();
        redClothing.printProduct();

//        // Create another customized variant of the clothing
//        Electronic smartphone64 = (Electronic) registry.getPrototype("Smartphone 128");
//        smartphone64.name = "Smartphone 22";
//        smartphone64.printProduct();
//        electronic1.printProduct();
    }
}