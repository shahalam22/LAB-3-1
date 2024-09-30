class Laptop extends Product {
    private String name;
    private String processor;
    private String ram;

    public Laptop(String name, String processor, String ram) {
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        System.out.println("Laptop created!");
    }

    @Override
    public void powerOn() {
        System.out.println("Laptop Power ON!");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop Power Off!");
    }

    @Override
    public void display() {
        System.out.println("Laptop's Specification -");
        System.out.println("Name: " + name);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
    }
}
