package Turtle;

public class Sketchpad {
    private int[][] floor;
    private int row;
    private int col;

    public Sketchpad(int row, int col){
        floor = new int[row][col];
        this.row = row;
        this.col = col;
    }

    public void display(){
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
