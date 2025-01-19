public class Laptop implements Device{
    private String model;
    private String brand;
    private Integer price;

    public Laptop(String model, String brand, Integer price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void powerOn(){
        System.out.println("Laptop is powered on");
    }

    @Override
    public void powerOff(){
        System.out.println("Laptop is powered off");
    }
}
