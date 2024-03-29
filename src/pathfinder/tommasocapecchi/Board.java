package pathfinder.tommasocapecchi;

import java.util.Arrays;
import java.util.LinkedList;
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
    private int number_of_nodes;
    private String board[][];
    private LinkedList<Node> nodes_in_board;

    Board(int number_of_rows, int number_of_columns, int number_of_coins){
        this.number_of_columns = number_of_columns;
        this.number_of_rows = number_of_rows;
        this.number_of_nodes = number_of_coins;
        this.nodes_in_board = new LinkedList<>();
        init_board();
    }

    private void init_board(){
        board = new String[number_of_rows][number_of_columns];
        for(int i = 0; i<number_of_rows; i++){
            for(int j = 0; j<number_of_columns; j++){
                board[i][j] = " ";
            }
        }
    }
    
    private boolean check_valid_position(int row, int column){
        if (board[row][column].equals("C"))
            return false;
        return true;
    }
    
    void generate_nodes(){
        Random randomizer = new Random();
        int indices = 0;
        while(number_of_nodes > 0){
            int randomRow = randomizer.nextInt(number_of_rows);
            int randomColumn = randomizer.nextInt(number_of_columns);
            if(check_valid_position(randomRow,randomColumn)) {
            	if (number_of_nodes == 1) {
            		Node root = new Node(indices,randomRow, randomColumn);
            		root.set_letters(Letters.O);
            		nodes_in_board.addFirst(root);
                    board[randomRow][randomColumn] = root.get_letters().toString();
                    indices++;
            	}else {
            		Node coin = new Node(indices,randomRow, randomColumn);
                    coin.set_letters(Letters.C);
                    nodes_in_board.add(coin);
                    board[randomRow][randomColumn] = coin.get_letters().toString();
                    indices++;
            	}
            	number_of_nodes--;
            }
        }
    }

    public String[][] get_board(){
        return this.board;
    }

    public void set_board(String[][] board) {
        this.board = board;
    }

    public LinkedList<Node> get_nodes_in_board() {
        return nodes_in_board;
    }

    public void print_board(){
       for(int i = 0; i<board.length; i++){
           System.out.println(Arrays.toString(board[i]));
       }
    }

    enum Letters {
        X,C,O;
    }
}
