package lab.assignment.afterrefactoring;

public class AmericanoCoffee extends CoffeeMaker{

    @Override
    protected void addIngredients() {
        System.out.println("Adding more hot water");
    }
    
    @Override
    protected void finalTouch() {
        System.out.println("Adding sugar and cream");
    }

}
