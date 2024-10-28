public class Clothing extends Product {
    public String color;
    public String size;

    public Clothing(String name, String category, double price, String color, String size) {
        super(name, category, price);
        this.color = color;
        this.size = size;
    }

    public Clothing(Clothing target){
        super(target);
        if(target != null){
            this.color = target.color;
            this.size = target.size;
        }
    }

    @Override
    public Product clone(){
        return new Clothing(this);
    }

    @Override
    public void printProduct(){
        System.out.println("Clothing [Name: " + name + ", Category: " + category + ", Price: " + price + ", Color: " + color + ", Size: " + size + "]");
    }

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Clothing) || !super.equals(object2)){
            return false;
        }
        Clothing cloth2 = (Clothing) object2;
        return cloth2.color.equals(this.color) && cloth2.size.equals(this.size);
    }
}
