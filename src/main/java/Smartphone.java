public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String name, int cost, String manufacturer) {
        super(id, name, cost);
        this.manufacturer = manufacturer;
    }

    public boolean matches(String search) {
        if (this.getName().contains(search)) {
            return true;
        } else {
            if (manufacturer.contains(search)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
