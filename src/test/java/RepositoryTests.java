import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTests {
    Product product1 = new Book(365, "Master and Margarita", 1000, "Bulgakov");
    Product product2 = new Book(367, "Masha", 1000, "Masha");
    Product product3 = new Book(364, "Lena", 1000, "Sveta");
    Product product4 = new Book(3666, "The second life of Uwe", 1000, "Frederik Buckman");
    Product product5 = new Smartphone(364, "Iphone", 1000, "Apple");
    Product product6 = new Smartphone(364, "Masha", 1000, "Masha");

    @Test
    public void test1(){
        ProductRepository tmp = new ProductRepository();
        tmp.save(product5);
        tmp.save(product2);
        tmp.save(product4);
        Product[] expected = {product5, product2, product4};
        Product[] actual = tmp.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

}
