package ChibuzoTurtle;

import ChibuzoTurtle.SketchPad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ChibuzoTurtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class ChibuzoTurtleTest {
    private ChibuzoTurtle ijapa;
    private SketchPad pad;

    @BeforeEach
    void setUp() {
        ijapa = new ChibuzoTurtle();
        pad = new SketchPad(20, 20);
    }

    @Test
    void testThatChibuzorTurtleIsNotNull(){
        assertNotNull(ijapa);
    }

    @Test
    void testThatTurtlePenIsUp(){
        ijapa.penUp();
        assertTrue(ijapa.penIsUp());
    }
    @Test
    void testThatTurtlePenIsDown(){
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());
    }
    @Test
    void testThatIjapaCanTurnRightFromEastToSouthToWestToNorth(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    void testThatIjapaCanTurnLeftFromNorthToWestToSouthToEast(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void sketchPadDisplay(){
        System.out.println("Turtle about to move on the great sketchpad");
        System.out.println();
        pad.display();
    }

    @Test
    void thatTurtleCanMoveWhenThePenIsUp(){
        assertEquals(new Position(0, 0), ijapa.getPosition());
        ijapa.move(pad, 5);
        assertEquals(new Position(0, 4), ijapa.getPosition());
    }
}