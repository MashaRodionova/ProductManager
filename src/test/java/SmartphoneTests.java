import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTests {
    @Test
    public void test1() {
        Product smartphone = new Smartphone(365, "Mama myla ramu", 1000, "Begbeder");
        Boolean expected = true;
        Boolean actual = smartphone.matches("gbed");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Product smartphone = new Smartphone(365, "Masha", 1000, "Masha");
        Boolean expected = true;
        Boolean actual = smartphone.matches("Masha");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Product smartphone = new Smartphone(365, "Masha", 1000, "Masha");
        Boolean expected = false;
        Boolean actual = smartphone.matches("Sveta");
        Assertions.assertEquals(expected, actual);
    }
}
