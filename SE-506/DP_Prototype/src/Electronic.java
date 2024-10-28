public class Electronic extends Product{
    public String storage;
    public Integer batteryLife;

    public Electronic(String name, String category, double price, String storage, Integer batteryLife) {
        super(name, category, price);
        this.storage = storage;
        this.batteryLife = batteryLife;
    }

    public Electronic(Electronic target){
        super(target);
        if(target != null){
            this.storage = target.storage;
            this.batteryLife = target.batteryLife;
        }
    }

    @Override
    public Product clone(){
        return new Electronic(this);
    }

    @Override
    public void printProduct(){
        System.out.println("Clothing [Name: " + name + ", Category: " + category + ", Price: " + price + ", Storage: " + storage + ", Battery: " + batteryLife + "]");
    }


    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Electronic) || !super.equals(object2)){
            return false;
        }
        Electronic electronic2 = (Electronic) object2;
        return electronic2.storage.equals(storage) && electronic2.batteryLife.equals(batteryLife);
    }
}
