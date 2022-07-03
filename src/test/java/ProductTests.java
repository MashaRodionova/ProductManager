import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTests {
    @Test
    public void test1(){
        Product product = new Product(365, "Mama myla ramu", 1000);
        Boolean expected = true;
        Boolean actual = product.matches("myla");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        Product product = new Product(365, "Mama myla ramu", 1000);
        Boolean expected = false;
        Boolean actual = product.matches("Sveta");
        Assertions.assertEquals(expected, actual);
    }
}
