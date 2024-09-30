class Smartphone extends Product {
    private String Processor;
    private String Ram;
    private String Battery;
    private String Camera;

    public Smartphone(String Processor, String Ram, String Battery, String Camera) {
        this.Processor = Processor;
        this.Ram = Ram;
        this.Battery = Battery;
        this.Camera = Camera;
        System.out.println("Smartphone created!");
    }

    @Override
    public void powerOn() {
        System.out.println("SmartPhone Power ON!");
    }

    @Override
    public void powerOff() {
        System.out.println("SmartPhone Power Off!");
    }

    public void display() {
        System.out.println("Phone's Specifications -");
        System.out.println("Processor: " + Processor);
        System.out.println("Ram: " + Ram);
        System.out.println("Battery: " + Battery);
        System.out.println("Camera: " + Camera);
    }
}
