package InterfaceExamples.Turtle;

public class Turtle {
    private final Position currentPosition = new Position(0, 0);
    private Direction currentDirection = Direction.X_AXIS;
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
      if(turtlePen.getPosition() != PenPosition.UP) writeOn(sketchpad, noOfSteps);
      moveForward(noOfSteps);
    }

    private void writeOn(Sketchpad sketchpad, int noOfSteps) {
        int[][] floor = sketchpad.getFloor();
        int curRow = currentPosition.getRow();
        int curCol = currentPosition.getCol();

    if(currentDirection == Direction.X_AXIS){
        for(int i = 0; i <= noOfSteps; i++){
            floor[curRow][curCol++] = 1;
        }
    }

    if(currentDirection == Direction.Y_AXIS){

    }
    }

    public void turnRight(){
        if(currentDirection == Direction.X_AXIS) currentDirection = Direction.Y_AXIS;
        else if(currentDirection == Direction.Y_AXIS) currentDirection = Direction.N_X_AXIS;
        else if(currentDirection == Direction.N_X_AXIS) currentDirection = Direction.N_Y_AXIS;
        else currentDirection = Direction.X_AXIS;
    }
    public void turnLeft(){
        if(currentDirection == Direction.X_AXIS) currentDirection = Direction.N_Y_AXIS;
        else if(currentDirection == Direction.N_Y_AXIS) currentDirection = Direction.N_X_AXIS;
        else if(currentDirection == Direction.N_X_AXIS) currentDirection = Direction.Y_AXIS;
        else currentDirection = Direction.X_AXIS;
    }
    private void moveForward(int noOfSteps) {
        if(currentDirection == Direction.X_AXIS) moveInXDirection(noOfSteps);
        if(currentDirection == Direction.Y_AXIS) moveInYDirection(noOfSteps);
        if(currentDirection == Direction.N_X_AXIS) moveInNXDirection(noOfSteps);
        if(currentDirection == Direction.N_Y_AXIS) moveInNYDirection(noOfSteps);
    }

    private void moveInNYDirection(int noOfSteps) {
        yCoordinate = getyCoordinate() - noOfSteps;
        currentPosition.setRow(yCoordinate);
    }

    private void moveInNXDirection(int noOfSteps) {
        xCoordinate = getxCoordinate() - noOfSteps;
        currentPosition.setCol(xCoordinate);
    }

    private void moveInYDirection(int noOfSteps) {
        yCoordinate = getyCoordinate() + noOfSteps;
        currentPosition.setRow(yCoordinate);
    }
    private void moveInXDirection(int noOfStep){
        xCoordinate = getxCoordinate() + noOfStep;
        currentPosition.setCol(xCoordinate);    }
}
