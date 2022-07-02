public class ProductManager {
    ProductRepository repo = new ProductRepository();

    public ProductManager(ProductRepository repo) {
        this.repo = repo;
    }

    public void add(Product product){
        repo.save(product);
    }

    public void search(String text){
        Product[] result = new Product[0];
        for (Product product : repo.products) {
            if(matches(product, text)){
                repo.save(product);
            }
        }
    }
    public boolean matches(Product product, String search){
        return product.getName().contains(search);
    }
}
