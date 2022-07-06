import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTests {
    Product product1 = new Book(365, "Master and Margarita", 1000, "Bulgakov");
    Product product2 = new Book(367, "Masha", 1000, "Masha");
    Product product3 = new Book(364, "Lena and Masha", 1000, "Sveta");
    Product product4 = new Book(3666, "The second life of Uwe", 1000, "Frederik Buckman");
    Product product5 = new Smartphone(364, "Iphone", 1000, "Apple");
    Product product6 = new Smartphone(378, "Masha and Android", 1000, "Masha");


    @Test
    public void test1() {
        ProductRepository tmp = new ProductRepository();
        tmp.save(product5);
        tmp.save(product1);
        tmp.save(product3);
        tmp.save(product6);
        tmp.save(product5);
        tmp.save(product5);
        tmp.deleteById(364);
        Product[] expected = {product1, product6};
        Product[] actual = tmp.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void test2() {
        ProductRepository repo = new ProductRepository();
        repo.save(product5);
        repo.save(product1);
        repo.save(product3);
        repo.save(product2);
        repo.save(product6);
        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.deleteById(777);
        });


    }


}


