package Day1_Singleton;

class Window {
    private static Window instance;

    private Window(Integer width, Integer height) {
        m_Width = width;
        m_Height = height;
    }

    public static synchronized Window getInstance() {

        if (instance == null)
            instance = new Window(1920, 1080);

        return instance;
    }

    public void useWindow() {
        System.out.println("Using window instance size (" + m_Width + ", " + m_Height
                + ") \nHashCode of instance = " + instance.hashCode());
    }

    Integer m_Width;
    Integer m_Height;
}