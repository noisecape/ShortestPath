package pathfinder.tommasocapecchi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*

The board can contains:
" " -> blank spaces
O  -> represents my position
X  -> represents the path made by the character
C  -> represents coins into the board

 */


public class Board {

    private int number_of_rows;
    private int number_of_columns;
    private int number_of_coins;
    private String board[][];
    private List<Coin> coin_list;

    Board(int number_of_rows, int number_of_columns, int number_of_coins){
        this.number_of_columns = number_of_columns;
        this.number_of_rows = number_of_rows;
        this.number_of_coins = number_of_coins;
        this.coin_list = new LinkedList<>();
        init_board();
        generate_coins();
    }

    private void init_board(){
        board = new String[number_of_rows][number_of_columns];
        for(int i = 0; i<number_of_rows; i++){
            for(int j = 0; j<number_of_columns; j++){
                board[i][j] = " ";
            }
        }
    }

    private void generate_coins(){
        Random randomizer = new Random();
        while(number_of_coins > 0){
            int randomRow = randomizer.nextInt(number_of_rows);
            int randomColumn = randomizer.nextInt(number_of_columns);
            if(check_valid_position(randomRow,randomColumn)) {
                Coin coin = new Coin(randomRow, randomColumn);
                coin_list.add(coin);
                board[randomRow][randomColumn] = "C";
                number_of_coins--;
            }
        }
    }

    private boolean check_valid_position(int row, int column){
        if (board[row][column].equals("C"))
            return false;
        return true;
    }

    public String[][] get_board(){
        return this.board;
    }

    public void set_board(String[][] board) {
        this.board = board;
    }

    public List<Coin> get_coin_list() {
        return coin_list;
    }

    public void print_board(){
       for(int i = 0; i<board.length; i++){
           System.out.println(Arrays.toString(board[i]));
       }
    }
}
