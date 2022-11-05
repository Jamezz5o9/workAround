package ChibuzoTurtle;

public class SketchPad {
    private int[][] floor = new int[20][20];

    public SketchPad(){
        for(int i = 0; i < floor.length; i++){
            System.out.print("| ");
            for(int j = 0; j < floor[0].length; j++){
                System.out.print(floor[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public int[][] getFloor() {
        return floor;
    }

}
