public abstract class Pizza implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
