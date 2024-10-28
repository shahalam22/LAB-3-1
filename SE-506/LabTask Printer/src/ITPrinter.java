class ITPrinter extends Printer {
    private static ITPrinter instance;

    private ITPrinter() {}

    public static ITPrinter getInstance() {
        if (instance == null) {
            instance = new ITPrinter();
        }
        return instance;
    }

    @Override
    public void print(String file) {
        System.out.println(file + " hashcode: " + this.hashCode());
    }
}
