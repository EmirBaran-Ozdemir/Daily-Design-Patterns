public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal myMeal1 = mealBuilder.HalalMeal();
        System.out.println("Halal Meal");
        myMeal1.ShowItems();
        System.out.println("Total Cost: " + myMeal1.getTotalCost());

        Meal myMeal2 = mealBuilder.HaramMeal();
        System.out.println("Haram Meal");
        myMeal2.ShowItems();
        System.out.println("Total Cost: " + myMeal2.getTotalCost());
    }
}
