public class Triangle extends Shape {

    Triangle() {
        type = "Triangle";
        color = "Blue";
    }

    @Override
    public void draw() {
        System.out.println("Triangle drawn");
    }
}
