
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test1Test {

    @Test
    public void helloWorldTest() {
        Test1 test = new Test1();
      
        assertEquals("Hello_World", test.helloWorld()); 
    }
}
