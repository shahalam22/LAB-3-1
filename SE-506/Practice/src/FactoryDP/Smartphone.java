public class Smartphone implements Device{
    private String brand;
    private String model;
    private Integer price;

    public Smartphone(String brand, String model, Integer price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public void powerOn(){
        System.out.println("Smartphone "+this.brand+" "+this.model+" power on");
    }

    @Override
    public void powerOff(){
        System.out.println("Smartphone "+this.brand+" "+this.model+" power off");
    }
}
