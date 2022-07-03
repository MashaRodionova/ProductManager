public class Product {
   private int id;
    private String name;
    private int cost;

    public Product(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean matches(String search){
        if(name.contains(search)){
            return true;
        }else {
            return false;
        }
    }
}
