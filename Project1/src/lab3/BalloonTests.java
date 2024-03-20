package lab3;

import balloon4.Balloon;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BalloonTests {

    Balloon ba;

    @Before
    public void before() {
        ba = new Balloon(10);
    }

    @Test
    public void testInitial() {
        String msg = "A newly constructed balloon should have a radius of 0.";
        assertEquals(msg, 0, ba.getRadius());
    }

    @Test
    public void testPopped() {
        String msg = "A newly constructed Balloon should not be popped.";
        assertFalse(msg, ba.isPopped());
    }

    @Test
    public void testBlow() {
        String msg = "After calling blow(5) on a Balloon with maximum radius 10, the radius should be 5.";
        ba.blow(5);
        assertEquals(msg, 5, ba.getRadius());
    }

    @Test
    public void testDeflate() {
        String msg = "After calling deflate(), on a Balloon with a set radius, the new radius should be 0.";
        String msg2 = "Deflate() should not pop the balloon.";
        ba.blow(5);
        ba.deflate();
        assertEquals(msg, 0, ba.getRadius());
        assertFalse(msg2, ba.isPopped());
    }

    @Test
    public void testPop() {
        String msg = "After calling pop(), a Balloon with a set radius should have no radius and be popped";
        ba.blow(5);
        ba.pop();
        assertEquals(msg, 0, ba.getRadius());
        assertTrue(msg, ba.isPopped());
    }

    @Test
    public void testMaxRadius() {
        String msg = "After calling blow(15), if the max radius is set to 10, the balloon should pop.";
        ba.blow(15);
        assertEquals(msg, 0, ba.getRadius());
        assertTrue(msg, ba.isPopped());
    }

    @Test
    public void testPopRadius() {
        String msg = "A popped balloon should have a radius of zero.";
        ba.blow(5);
        ba.pop();
        assertEquals(msg, 0, ba.getRadius());
    }

    @Test
    public void testBlowPop() {
        String msg = "A balloon should not be able to gain radius after being popped";
        ba.pop();
        ba.blow(5);
        assertEquals(msg, 0, ba.getRadius());
    }

    @Test
    public void testAddAir() {
        String msg = "The blow() method should add air, not set air. After calling blow(3) and blow(5), radius should be 8";
        ba.blow(3);
        ba.blow(5);
        assertEquals(msg, 8, ba.getRadius());
    }

}
