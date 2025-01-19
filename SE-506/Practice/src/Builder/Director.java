public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void build() {
        this.builder.buildStepA();
        this.builder.buildStepB();
        this.builder.buildStepC();
    }
}
