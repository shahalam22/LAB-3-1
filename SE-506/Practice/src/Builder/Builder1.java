public class Builder1 implements Builder{
    private Product product;

    public Builder1() {
        this.product = new Product("","","");
    }

    @Override
    public void reset(){
        product.setStepA("");
        product.setStepB("");
        product.setStepC("");
    }

    @Override
    public void buildStepA(){
        product.setStepA("AbyB1");
    }

    @Override
    public void buildStepB(){
        product.setStepB("BbyB1");
    }

    @Override
    public void buildStepC(){
        product.setStepC("CbyB1");
    }

    public Product getProduct(){
        return product;
    }
}
