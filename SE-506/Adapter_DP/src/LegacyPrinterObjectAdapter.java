public class LegacyPrinterObjectAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    public LegacyPrinterObjectAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String content) {
        legacyPrinter.oldPrint("through object adapter: " + content);
    }
}