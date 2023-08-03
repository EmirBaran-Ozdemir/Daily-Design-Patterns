public class Circle extends Shape {

    Circle() {
        type = "Circle";
        color = "White";
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }

}
