public class Book extends Product {
    private String author;

    public Book(int id, String name, int cost, String author) {
        super(id, name, cost);
        this.author = author;
    }

    @Override

    public boolean matches(String search) {
        if (this.getName().contains(search)) {
            return true;
        } else {
            if(author.contains(search)){
                return true;
            }else {
                return false;
            }
        }
    }
}
