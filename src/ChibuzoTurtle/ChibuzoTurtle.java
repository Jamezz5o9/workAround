package ChibuzoTurtle;

import static ChibuzoTurtle.Direction.*;

public class ChibuzoTurtle {
    private Direction currentDirection = EAST;
    private boolean penIsUp;
    private Position currentPosition = new Position(0, 0);

    public void penUp(){
        penIsUp = true;
    }

    public void penDown(){
        penIsUp = false;
    }

    public boolean penIsUp() {
        return penIsUp;
    }
    public void turnRight(){
        if(currentDirection == EAST) turn(SOUTH);
        else if (currentDirection == SOUTH) turn(WEST);
        else if(currentDirection == WEST) turn(NORTH);
        else turn(EAST);
    }
    public void turnLeft(){
        if(currentDirection == EAST) turn(NORTH);
        else if(currentDirection == NORTH) turn(WEST);
        else if(currentDirection == WEST) turn(SOUTH);
        else turn(EAST);
    }
    public Direction getCurrentDirection() {
        return currentDirection;
    }
    private void turn(Direction direction) {
        currentDirection = direction;
    }

    public void move(int noOfSteps, SketchPad pad){

        noOfSteps = noOfSteps - 1 ;
        if(currentDirection == EAST) moveEastWard(noOfSteps);
        else if(currentDirection == SOUTH) moveSouthWard(noOfSteps);
        else if(currentDirection == WEST) moveWestWard(noOfSteps);
        else moveNorthWard(noOfSteps);

    }

    private void moveNorthWard(int noOfSteps) {
        int newRow = noOfSteps + currentPosition.getRow();
        currentPosition.setRow(newRow);
    }

    private void moveWestWard(int noOfSteps) {
        int newCol = noOfSteps + currentPosition.getCol();
        currentPosition.setRow(newCol);
    }

    private void moveSouthWard(int noOfSteps) {
        int newRow = noOfSteps + currentPosition.getRow();
        currentPosition.setRow(newRow);
    }

    private void moveEastWard(int noOfSteps) {
        int newCol = noOfSteps + currentPosition.getCol();
        currentPosition.setCol(newCol);
    }

    public Position getPosition() {
        return currentPosition;
    }

    public void setPosition(Position position) {
        this.currentPosition = position;
    }
}
