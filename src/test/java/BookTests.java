import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTests {


    @Test
    public void test1(){
        Product book = new Book(365, "Mama myla ramu", 1000, "Begbeder");
        Boolean expected = true;
        Boolean actual = book.matches("gbed");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        Product book = new Book(365, "Masha", 1000, "Masha");
        Boolean expected = true;
        Boolean actual = book.matches("Masha");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        Product book = new Book(365, "Masha", 1000, "Masha");
        Boolean expected = false;
        Boolean actual = book.matches("Sveta");
        Assertions.assertEquals(expected, actual);
    }

}
