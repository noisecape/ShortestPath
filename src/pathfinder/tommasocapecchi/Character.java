package pathfinder.tommasocapecchi;

import java.util.List;

public class Character extends ObjectInBoard{

    private int x_position;
    private int y_position;
    private List <Integer [][]> path;
    private String [][] board;

    Character(int x_position, int y_position, String [][] board){
        this.setX_position(x_position);
        this.setY_position(y_position);
        this.board = board;
        set_position_in_board();
    }

    private void set_position_in_board(){
        if (board[x_position][y_position].equals(" "))
            board[x_position][y_position] = "0";

    }

    public int getX_pos() {
        return x_position;
    }

    public void setX_position(int x_position) {
        this.x_position = x_position;
    }

    public int getY_pos() {
        return y_position;
    }

    public void setY_position(int y_position) {
        this.y_position = y_position;
    }

    public List<Integer[][]> getPath() {
        return path;
    }

    public void setPath(List<Integer[][]> path) {
        this.path = path;
    }

    public String[][] getBoard() {
        return board;
    }
}
