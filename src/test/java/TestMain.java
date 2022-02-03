import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testPowerOf(){
        Main main = new Main();
        assertEquals(2 ,main.powerOf2(2));
    }
}
