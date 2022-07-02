public class ProductRepository {
    Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product; //почему за индекс tmp нельзя взять (products.lengh + 1)? тест падает при этом условии
        products = tmp;
    }

    public Product[] getProducts() {
        return products;
    }

    public void deleteById(int id) {
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[copyToIndex] = product;
            }
            copyToIndex++;

        }
    }


}