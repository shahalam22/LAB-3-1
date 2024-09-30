class LaptopCreator extends Creator {
    @Override
    public Product createProduct(Object... args) {
        System.out.println("Creating Laptop...");
        return new Laptop((String) args[0], (String) args[1], (String) args[2]);
    }
}
