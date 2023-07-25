package Day01_Singleton;

public class Main {
    public static void main(String[] args) {
        Window instance = Window.getInstance();
        instance.useWindow();
        Window second_instance = Window.getInstance();
        second_instance.useWindow(); // First and second instances are same.
    }
}
