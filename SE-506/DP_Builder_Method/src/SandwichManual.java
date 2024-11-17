public class SandwichManual {
    private SandwichType type;
    private String breadType;
    private String fillings;
    private String spreads;

    public SandwichManual(SandwichType type, String breadType, String fillings, String spreads){
        this.type = type;
        this.breadType = breadType;
        this.fillings = fillings;
        this.spreads = spreads;
    }

    public void print(){
        String info = "";
        info += "Sandwich Type: " + type + "\n";
        info += "Bread Type: " + breadType + "\n";
        info += "Fillings: " + fillings + "\n";
        info += "Spreads: " + spreads + "\n";

        System.out.println(info);
    }
}
