public class Main {
    public static void main(String[] args) {
        ModernPrinter modernPrinter = new ModernPrinter();
        LegacyPrinter legacyPrinter = new LegacyPrinter();

        LegacyPrinterClassAdapter legacyPrinterClassAdapter = new LegacyPrinterClassAdapter();
        LegacyPrinterObjectAdapter legacyPrinterObjectAdapter = new LegacyPrinterObjectAdapter(legacyPrinter);

        modernPrinter.print("Hello from modern printer");
        legacyPrinterClassAdapter.print("Hello from legacy printer");
        legacyPrinterObjectAdapter.print("Hello from legacy printer");
    }
}