public class Sandwich {
    private final SandwichType type;
    private final String breadType;
    private final String fillings;
    private final String spread;

    public Sandwich(SandwichType type, String breadType, String fillings, String spread) {
        this.type = type;
        this.breadType = breadType;
        this.fillings = fillings;
        this.spread = spread;
    }

    public SandwichType getType() {
        return type;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getFillings() {
        return fillings;
    }

    public String getSpread() {
        return spread;
    }
}
