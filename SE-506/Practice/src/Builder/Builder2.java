public class Builder2 implements Builder{
    private Product product;

    public Builder2() {
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
        product.setStepA("AbyB2");
    }

    @Override
    public void buildStepB(){
        product.setStepB("BbyB2");
    }

    @Override
    public void buildStepC(){
        product.setStepC("CbyB2");
    }

    public Product getProduct(){
        return product;
    }
}
