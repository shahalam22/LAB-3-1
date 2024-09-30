class Tablet extends Product {
    private String name;
    private String color;
    private String ram;
    private String storage;

    public Tablet(String name, String color, String ram, String storage) {
        this.name = name;
        this.color = color;
        this.ram = ram;
        this.storage = storage;
        System.out.println("Tablet created!");
    }

    @Override
    public void powerOn() {
        System.out.println("Tablet Power ON!");
    }

    @Override
    public void powerOff() {
        System.out.println("Tablet Power Off!");
    }

    @Override
    public void display() {
        System.out.println("Tablet's Specifications - ");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }
}
