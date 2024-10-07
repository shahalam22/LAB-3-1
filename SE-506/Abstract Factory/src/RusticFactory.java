public class RusticFactory implements FurnitureFactory{

    private static RusticFactory rusticFactory = null;

    private RusticFactory(){}

    public static synchronized RusticFactory getInstanceofRF() {
        if (rusticFactory == null) {
            rusticFactory = new RusticFactory();
        }
        return rusticFactory;
    }

    @Override
    public Sofa createSofa() {
        return new RusticSofa();
    }

    @Override
    public Chair createChair() {
        return new RusticChair();
    }

    @Override
    public Table createTable() {
        return new RusticTable();
    }
}
