package Turtle;

import Turtle.Direction.*;

import static Turtle.Direction.*;

public class Turtle {
    private final Position currentPosition = new Position(0, 0);
    private Direction currentDirection = X_AXIS;
    private Pen turtlePen;
    private int xCoordinate;
    private int yCoordinate;

    public Turtle(){
        turtlePen = new Pen();
    }
    public Turtle(Pen position){
        turtlePen = position;
    }

    public void setTurtlePen(Pen turtlePen) {
        this.turtlePen = turtlePen;
    }

    public Pen getTurtlePen() {
        return turtlePen;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void moveForward(int noOfSteps, Sketchpad sketchpad) {
      noOfSteps = noOfSteps - 1;
      moveForward(noOfSteps);
    }
    public void turn(){
        if(currentDirection == X_AXIS) currentDirection = Y_AXIS;
        else currentDirection = X_AXIS;
    }
    private void moveForward(int noOfSteps) {
        if(currentDirection == X_AXIS) moveInXDirection(noOfSteps);
        if(currentDirection == Y_AXIS) moveInYDirection(noOfSteps);
    }

    private void moveInYDirection(int noOfSteps) {
        yCoordinate = getyCoordinate() + noOfSteps;
        currentPosition.setRow(yCoordinate);
    }

    private void moveInXDirection(int noOfStep){
        xCoordinate = getxCoordinate() + noOfStep;
        currentPosition.setCol(xCoordinate);    }
}
