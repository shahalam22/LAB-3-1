class TabletCreator extends Creator {
    @Override
    public Product createProduct(Object... args) {
        System.out.println("Creating Tablet...");
        return new Tablet((String) args[0], (String) args[1], (String) args[2], (String) args[3]);
    }
}