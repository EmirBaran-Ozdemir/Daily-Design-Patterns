package Day02_AbstractFactory;

public class Nike extends AbstractFactory {
    @Override
    public Cloth getCloth(String clothType) {
        if (clothType == "tshirt")
            return new NikeT_Shirt();
        else if (clothType == "shoe")
            return new NikeShoe();
        return null; // NOTE: You should throw error here
    }
}
