class SmartphoneCreator extends Creator {
    @Override
    public Product createProduct(Object... args) {
        System.out.println("Creating Smartphone...");
        return new Smartphone((String)args[0], (String)args[1], (String)args[2], (String)args[3]);
    }
}
