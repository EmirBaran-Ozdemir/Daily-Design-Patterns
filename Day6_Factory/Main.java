public class Main {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger myBurger = burgerFactory.getBurger("Cheese");
        myBurger.eat();
    }
}
