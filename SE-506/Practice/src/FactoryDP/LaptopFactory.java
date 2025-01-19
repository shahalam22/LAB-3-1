public class LaptopFactory {
    public Laptop createLaptop(String brand, String model, Integer price){
        return new Laptop(brand, model, price);
    }
}
