package Day02_Factory;

public class Adidas extends AbstractFactory {
    @Override
    public Cloth getCloth(String clothType) {
        if (clothType == "tshirt")
            return new AdidasT_Shirt();
        else if (clothType == "shoe")
            return new AdidasShoe();
        return null; // NOTE: You should throw error here
    }
}
