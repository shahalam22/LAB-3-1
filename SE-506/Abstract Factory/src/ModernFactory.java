public class ModernFactory implements FurnitureFactory{

    private static ModernFactory modernFactory = null;

    private ModernFactory(){}

    public static synchronized ModernFactory getInstanceofMF() {
        if (modernFactory == null) {
            modernFactory = new ModernFactory();
        }
        return modernFactory;
    }

    @Override
    public Sofa createSofa() {

        return new ModernSofa();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
