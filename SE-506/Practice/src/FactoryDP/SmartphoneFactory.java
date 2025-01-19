public class SmartphoneFactory {
    public Smartphone createSmartphone(String brand, String model, Integer price) {
        return new Smartphone(brand, model, price);
    }
}
