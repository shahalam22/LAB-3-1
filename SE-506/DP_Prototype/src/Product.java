public abstract class Product {
    public String name;
    public String category;
    public double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Product(Product target){
        if(target != null){
            this.name = target.name;
            this.category = target.category;
            this.price = target.price;
        }
    }

    public abstract Product clone();

    public abstract void printProduct();

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Product)) return false;
        Product product2 = (Product)object2;
        return product2.name.equals(name) && product2.category.equals(category) && product2.price == price;
    }
}
