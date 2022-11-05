package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Turtle.PenPosition.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle tortoise;


    @BeforeEach
    void setUp(){
        tortoise = new Turtle();
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
}