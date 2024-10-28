class ABCPrinter extends Printer {
    private static ABCPrinter instance;

    private ABCPrinter() {}

    public static ABCPrinter getInstance() {
        if (instance == null) {
            instance = new ABCPrinter();
        }
        return instance;
    }

    @Override
    public void print(String file) {
        System.out.println(file + " hashcode: " + this.hashCode());
    }
}
