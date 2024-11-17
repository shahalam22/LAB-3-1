import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer sandwichType;

        Director director = new Director();
        SandwichBuilder sandwichBuilder = new SandwichBuilder();
        SandwichManualBuilder sandwichManualBuilder = new SandwichManualBuilder();

        System.out.println("Welcome to IIT FoodCourt");
        System.out.println("Here is the list of Sandwiches:");
        System.out.println("1. Chicken Sandwich");
        System.out.println("2. Egg Sandwich");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the type of Sandwich: ");
        sandwichType = scanner.nextInt();

        if (sandwichType == 1) {
            director.makeChickenSandwich(sandwichBuilder);
            director.makeChickenSandwich(sandwichManualBuilder);
        }else if (sandwichType == 2) {
            director.makeEggSandwich(sandwichBuilder);
            director.makeEggSandwich(sandwichManualBuilder);
        }

        Sandwich sandwich = sandwichBuilder.getSandwich();
        System.out.println(sandwich.getType()+" is ready\n");

        SandwichManual sandwichManual = sandwichManualBuilder.getSandwichManual();
        sandwichManual.print();
    }
}