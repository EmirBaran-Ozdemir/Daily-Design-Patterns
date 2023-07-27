import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape shape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + shape1.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

        try (Scanner sc = new Scanner(System.in)) {
            String userColor = sc.nextLine();
            Shape userShape = (Shape) ShapeCache.getShape("3");
            userShape.setColor(userColor);
            System.out.println("UserShape: " + userShape.type + ", " + userShape.color);
        }

    }
}