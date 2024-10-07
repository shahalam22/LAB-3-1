public class VictorianFactory implements FurnitureFactory{

    private static VictorianFactory victorianFactory = null;

    private VictorianFactory(){}

    public static synchronized VictorianFactory getInstanceofVF() {
        if (victorianFactory == null) {
            victorianFactory = new VictorianFactory();
        }
        return victorianFactory;
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
