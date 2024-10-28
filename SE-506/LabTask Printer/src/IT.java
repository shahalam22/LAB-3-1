class IT extends Department{
    String name;
    Integer id;
    String head;
    Printer it_printer;

    public IT(String name, Integer id, String head) {
        this.name = name;
        this.id = id;
        this.head = head;
    }

    @Override
    public void print(String text){
        if(it_printer==null){
            it_printer = ITPrinter.getInstance();
        }
        it_printer.print(text + " in IT Printer");
    }
}
