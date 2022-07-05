import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTests {
    Product product1 = new Book(365, "Master and Margarita", 1000, "Bulgakov");
    Product product2 = new Book(367, "Masha", 1000, "Masha");
    Product product3 = new Book(364, "Lena", 1000, "Masha");
    Product product4 = new Book(3666, "The second life of Uwe", 1000, "Frederik Buckman");
    Product product5 = new Smartphone(364, "Iphone", 1000, "Apple");
    Product product6 = new Smartphone(378, "Masha and Android", 1000, "Lena");
    Product product7 = new Book(3679, "ivan", 1000, "Lena");

    ProductManager tmp = new ProductManager();

    @Test
    public void test1() {

        tmp.add(product5);
        tmp.add(product2);
        tmp.add(product4);
        Product[] expected = {product5, product2, product4};
        Product[] actual = tmp.repo.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        tmp.add(product1);
        tmp.add(product2);
        tmp.add(product3);
        tmp.add(product4);
        tmp.add(product5);
        tmp.add(product6);
        tmp.add(product7);
        Product[] expected = {product3, product6, product7};
        Product[] actual = tmp.search("Lena");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        tmp.add(product1);
        tmp.add(product2);
        tmp.add(product3);
        tmp.add(product4);
        tmp.add(product5);
        tmp.add(product6);
        tmp.add(product7);
        Product[] expected = new Product[0];
        Product[] actual = tmp.search("Wow");
        Assertions.assertArrayEquals(expected, actual);

    }
}
