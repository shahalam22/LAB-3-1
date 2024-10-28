class ABC extends Department {
    String name;
    Integer id;
    String head;
    Printer abc_printer;

    public ABC(String name, Integer id, String head) {
        this.name = name;
        this.id = id;
        this.head = head;
    }

    @Override
    public void print(String text) {
        if (abc_printer == null) {
            abc_printer = ABCPrinter.getInstance();
        }
        abc_printer.print(text + " in ABC Printer");
    }
}