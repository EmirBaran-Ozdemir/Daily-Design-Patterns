public class BurgerFactory {
    public Burger getBurger(String ingredient) {
        if (ingredient == "Cheese")
            return new CheeseBurger();
        else if (ingredient == "Beef")
            return new WhooperBurger();
        return null;
    }
}