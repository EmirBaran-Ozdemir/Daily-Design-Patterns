package Day02_AbstractFactory;

public class AdidasShoe implements Shoe {
    @Override
    public void wear() {
        System.out.println("Adidas Shoe weared");
    }

    @Override
    public void tie() {
        System.out.println("Adidas Shoe tied");
    }
}
