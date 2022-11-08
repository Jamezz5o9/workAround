package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Turtle.PenPosition.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle tortoise;
    private Sketchpad pad;


    @BeforeEach
    void setUp(){
        tortoise = new Turtle();
        pad = new Sketchpad(20, 20);
    }

    @Test
    public void turtleHasPen(){
        assertNotNull(tortoise);
        assertEquals(0, tortoise.getxCoordinate());
        assertEquals(0, tortoise.getyCoordinate());
        assertNotNull(tortoise.getTurtlePen());
    }
    @Test
    public void turtlePenIsUp(){
        turtleHasPen();
        assertNotNull(tortoise.getTurtlePen().getPosition());
        assertEquals(UP, tortoise.getTurtlePen().getPosition());
    }
    @Test
    public void turtlePenIsDown(){
        turtlePenIsUp();
        tortoise.getTurtlePen().setPosition(DOWN);
        assertEquals(DOWN, tortoise.getTurtlePen().getPosition());
    }

    @Test
    public void turtleCanMoveForward(){
        turtlePenIsUp();
        assertEquals(new Position(0, 0), tortoise.getCurrentPosition());
        tortoise.moveForward(6, pad);
        assertEquals(new Position(0, 5), tortoise.getCurrentPosition());
        tortoise.moveForward(3, pad);
        assertEquals(new Position(0, 7), tortoise.getCurrentPosition());
        tortoise.turn();
        tortoise.moveForward(5,pad);
        assertEquals(new Position(4, 7), tortoise.getCurrentPosition());



    }
}