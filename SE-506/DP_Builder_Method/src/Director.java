public class Director {
    public void makeChickenSandwich(Builder builder){
        builder.setSandwichType(SandwichType.CHICKEN_SANDWICH);
        builder.setBreadType("Regular Bread");
        builder.setFillings("Grilled Chicken");
        builder.setSpreads("Cheese");
    }

    public void makeEggSandwich(Builder builder){
        builder.setSandwichType(SandwichType.EGG_SANDWICH);
        builder.setBreadType("Toasted Bread");
        builder.setFillings("Fried Egg");
        builder.setSpreads("Sauce");
    }
}
