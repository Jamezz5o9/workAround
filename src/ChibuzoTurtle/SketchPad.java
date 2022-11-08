package ChibuzoTurtle;

public class SketchPad {
    private int[][] floor;
    private int col;
    private int row;


    public SketchPad(int row, int col){
        floor = new int[row][col];
        this.row = row;
        this.col = col;
    }

    public void display(){
        for(int i = 0; i < row; i++){
            System.out.print("| ");
            for(int j = 0; j < col; j++){
                System.out.print(floor[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public int[][] getFloor() {
        return floor;
    }

}
