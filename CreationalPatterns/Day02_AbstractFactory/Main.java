package src;

public class Main {
    public static void main(String[] args) {
        AbstractFactory nikeFactory = FactoryProducer.getFactory("Nike");
        AbstractFactory adidasFactory = FactoryProducer.getFactory("Adidas");
        Cloth myShoe = nikeFactory.getCloth("shoe");
        myShoe.wear();

        Cloth myBrothersShoe = adidasFactory.getCloth("tshirt");
        myBrothersShoe.wear();
        Cloth myBrothersTShirt = nikeFactory.getCloth("shoe");
        myBrothersTShirt.wear();

    }
}
