public class Product {
    private String stepA;
    private String stepB;
    private String stepC;

    public Product(String stepA, String stepB, String stepC) {
        this.stepA = stepA;
        this.stepB = stepB;
        this.stepC = stepC;
    }

    public void setStepC(String stepC) {
        this.stepC = stepC;
    }

    public void setStepB(String stepB) {
        this.stepB = stepB;
    }

    public void setStepA(String stepA) {
        this.stepA = stepA;
    }

    public String getStepA() {
        return stepA;
    }

    public String getStepB() {
        return stepB;
    }

    public String getStepC() {
        return stepC;
    }
}
