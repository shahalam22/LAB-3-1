class HR extends Department {
    String name;
    Integer id;
    String head;
    Printer hr_printer;

    public HR(String name, Integer id, String head) {
        this.name = name;
        this.id = id;
        this.head = head;
    }

    @Override
    public void print(String text){
        if(hr_printer==null){
            hr_printer = HRPrinter.getInstance();
        }
        hr_printer.print(text + " in HR Printer");
    }
}
