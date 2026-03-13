

package edu.teamrocket.golfstrokes;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class HoleTest {

    private Hole hole;

    @BeforeEach
    void setUp() {
        hole = new Hole((byte)1, (byte)4);
    }

    @Test
    void testConstructor() {
        Hole newHole = new Hole((byte)2, (byte)3);

        assertNotNull(newHole);
        assertEquals((byte)2, newHole.getNumber());
        assertEquals((byte)3, newHole.getPar());
    }

    @Test
    void testGetNumber() {
        assertEquals((byte)1, hole.getNumber());
    }

    @Test
    void testGetPar() {
        assertEquals((byte)4, hole.getPar());
    }
}