import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void testBox() {
        Box<String, Integer, Float> box1 = new Box<>("String", 2, 3.5f);
        Box<String, Integer, Float> box2 = new Box<>("String", 3, 6.5f);
        float actual = box1.getValueInt() + box1.getValueFloat() + box2.getValueInt() + box2.getValueFloat();
        float expected = 15f;
        assertEquals(expected, actual);
    }

}