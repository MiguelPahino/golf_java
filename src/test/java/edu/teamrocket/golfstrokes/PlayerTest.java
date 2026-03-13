package edu.teamrocket.golfstrokes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class PlayerTest {

    private Player playerMJ;

    @BeforeEach
    void setUp(){
        playerMJ = new Player("MJ", (byte) 0);
    }

    @Test
    void constructorCreatePlayerBoject(){
        assertNotNull(playerMJ);
    }

    @Test
    void constructoGetNameAndHandicap(){
        assertEquals("MJ", playerMJ.getInitials());
        assertEquals((byte) 0, playerMJ.getHandicap());
    }

    @Test
    void getPPointsReturnsZeroByDefault(){
        assertEquals((short) 0 , playerMJ.getPoints());
    }
}