package Day02_AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == "Nike")
            return new Nike();
        else if (factoryType == "Adidas")
            return new Adidas();
        return null; // NOTE: You should throw error here
    }
}
