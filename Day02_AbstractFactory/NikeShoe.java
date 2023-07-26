package Day02_AbstractFactory;

public class NikeShoe implements Shoe {
    @Override
    public void wear() {
        System.out.println("Nike Shoe weared");
    }

    @Override
    public void tie() {
        System.out.println("Nike Shoe tied");
    }
}
