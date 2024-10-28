class Marketing extends Department {
    String name;
    Integer id;
    String head;
    Printer mark_printer;

    public Marketing(String name, Integer id, String head) {
        this.name = name;
        this.id = id;
        this.head = head;
    }

    @Override
    public void print(String text){
        if(mark_printer==null){
            mark_printer = MarketingPrinter.getInstance();
        }
        mark_printer.print(text + " in Marketing Printer");
    }
}
