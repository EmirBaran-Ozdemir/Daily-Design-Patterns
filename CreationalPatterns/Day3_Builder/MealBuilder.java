
public class MealBuilder {

    public Meal HaramMeal() {
        Meal meal = new Meal();
        meal.addItem(new PepperoniPizza());
        meal.addItem(new Coke());
        meal.addItem(new BigMac());

        return meal;
    }

    public Meal HalalMeal() {
        Meal meal = new Meal();
        meal.addItem(new MargheritaPizza());
        meal.addItem(new Sprite());
        meal.addItem(new CheeseBurger());

        return meal;
    }
}
