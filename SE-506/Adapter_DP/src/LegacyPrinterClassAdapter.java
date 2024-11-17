public class LegacyPrinterClassAdapter extends LegacyPrinter implements Printer {
    @Override
    public void print(String content) {
        oldPrint("through Class adapter: " + content);
    }
}