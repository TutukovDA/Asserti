import org.junit.Assert;
import org.junit.Test;
public class AssertTest {
    @Test
    public void sumTest() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        Assert.assertEquals("Успешно", 15, sum);
    }
    @Test
    public void delTest() {
        int a = 5;
        int b = 10;
        int del = b - a;
        Assert.assertEquals("Не успешно", 13, del);
    }
    @Test
    public void stringTest() {
        String a = new String("Привет");
        Assert.assertEquals("Успешно", "Привет", a);
    }
    @Test
    public void stringTest2() {
        String b = new String("Привет 2");
        Assert.assertEquals("Не успешно", "Привет", b);
    }
    @Test
    public void notEqualsTest() {
        String b = new String("Привет 2");
        Assert.assertNotEquals("Привет 2", b);
    }
    @Test
    public void notNullTest() {
        String b = new String("Привет");
        Assert.assertNotNull("Не пусто", b);
    }
    @Test
    public void nullTest2() {
        String b = null;
        Assert.assertNull("Успешно",b);
    }
}