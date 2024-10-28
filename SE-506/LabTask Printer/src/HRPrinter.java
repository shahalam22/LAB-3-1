class HRPrinter extends Printer {
    private static HRPrinter instance;

    private HRPrinter() {}

    public static HRPrinter getInstance() {
        if (instance == null) {
            instance = new HRPrinter();
        }
        return instance;
    }

    @Override
    public void print(String file) {
        System.out.println(file + " hashcode: " + this.hashCode());
    }
}
