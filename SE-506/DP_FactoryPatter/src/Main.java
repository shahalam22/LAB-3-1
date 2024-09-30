public class Main {
    public static void main(String[] args) {
        Creator phoneCreator = new SmartphoneCreator();
        Product phone = phoneCreator.createProduct("Snapdragon 8 Gen 1","8GB","256GB","16MP");
//        phone.powerOn();
//        phone.powerOff();
        phone.display();

//        Creator laptopCreator = new LaptopCreator();
//        Product laptop = laptopCreator.createProduct("Dell Inspiron","8GB","256GB SSD");
//        laptop.powerOn();
//        laptop.powerOff();
//        laptop.display();

//        Creator tabletCreator = new TabletCreator();
//        Product tablet = tabletCreator.createProduct("Samsung pad","Silver","16GB","512GB");
//        tablet.powerOn();
//        tablet.powerOff();
//        tablet.display();
    }
}