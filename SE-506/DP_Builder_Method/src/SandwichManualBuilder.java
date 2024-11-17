public class SandwichManualBuilder implements Builder{
    private SandwichType type;
    private String breadType;
    private String fillings;
    private String spreads;

    @Override
    public void setSandwichType(SandwichType type) {
        this.type = type;
    }

    @Override
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    @Override
    public void setFillings(String fillings){
        this.fillings = fillings;
    }

    @Override
    public void setSpreads(String spreads) {
        this.spreads = spreads;
    }

    public SandwichManual getSandwichManual(){
        return new SandwichManual(type, breadType, fillings, spreads);
    }
}
