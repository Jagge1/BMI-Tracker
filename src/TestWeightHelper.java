import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestWeightHelper {

    WeightHelper helper = new WeightHelper();

    @Test
    void testUnderweight() {
        assertEquals("Underweight", helper.getBMICategory(170, 50));
    }
    @Test
    void testNormalWeight() {
        assertEquals("Normal weight", helper.getBMICategory(170, 65));
    }
    @Test
    void testOverweight() {
        assertEquals("Overweight", helper.getBMICategory(170, 80));
    }
    @Test
    void testObese() {
        assertEquals("Obese", helper.getBMICategory(170, 100));
    }
    // Boundary tests
    @Test
    void testBoundaryUnderweightToNormal() {
        assertEquals("Normal weight", helper.getBMICategory(170, 54));
    }
    @Test
    void testBoundaryNormalToOverweight() {
        assertEquals("Overweight", helper.getBMICategory(170, 73));
    }
    @Test
    void testBoundaryOverweightToObese() {
        assertEquals("Obese", helper.getBMICategory(170, 90));
    }
}