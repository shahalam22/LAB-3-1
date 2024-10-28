class MarketingPrinter extends Printer {
    private static MarketingPrinter instance;

    private MarketingPrinter() {}

    public static MarketingPrinter getInstance() {
        if (instance == null) {
            instance = new MarketingPrinter();
        }
        return instance;
    }

    @Override
    public void print(String file) {
        System.out.println(file + " hashcode: " + this.hashCode());
    }
}
