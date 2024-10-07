public class Main {
    public static void main(String[] args) {
        // For Modern Factory
        FurnitureFactory mFactory = ModernFactory.getInstanceofMF();

        Sofa mSofa = mFactory.createSofa();
        mSofa.display();

        Chair mChair = mFactory.createChair();
        mChair.display();

        Table mTable = mFactory.createTable();
        mTable.display();

//        // Checking weather there is one instance of ModernFactory or not
//        FurnitureFactory mFactory2 = ModernFactory.getInstanceofMF();
//        Sofa mSofa2 = mFactory2.createSofa();
//        mSofa2.display();
//
//        System.out.println(mFactory == mFactory2);

//        // For Victorian Factory
//        FurnitureFactory vFactory = new VictorianFactory();
//
//        Sofa vSofa = vFactory.createSofa();
//        vSofa.display();
//
//        Chair vChair = vFactory.createChair();
//        vChair.display();
//
//        Table vTable = vFactory.createTable();
//        vTable.display();
//
//        // For Rustic Factory
//        FurnitureFactory rFactory = new RusticFactory();
//
//        Sofa rSofa = rFactory.createSofa();
//        rSofa.display();
//
//        Chair rChair = rFactory.createChair();
//        rChair.display();
//
//        Table rTable = rFactory.createTable();
//        rTable.display();
    }
}