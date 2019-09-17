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
    private int number_of_coins;
    private String board[][];
    private LinkedList<Coin> coin_list;

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
        int counter_for_printing = 0;
        while(number_of_coins > 0){
            int randomRow = randomizer.nextInt(number_of_rows);
            int randomColumn = randomizer.nextInt(number_of_columns);
            if(check_valid_position(randomRow,randomColumn)) {
                Coin coin = new Coin(randomRow, randomColumn);
                coin.set_letters(assign_letter(counter_for_printing));
                coin_list.add(coin);
                board[randomRow][randomColumn] = coin.get_letters().toString();
                counter_for_printing += 1;
                number_of_coins--;
            }
        }
    }

    private Letters assign_letter(int count){
        switch (count){
            case 0:
                return Letters.A;
            case 1:
                return Letters.B;
            case 2:
                return Letters.C;
            case 3:
                return Letters.D;
            case 4:
                return Letters.E;
            case 5:
                return Letters.F;
            case 6:
                return Letters.G;
            case 7:
                return Letters.H;
            case 8:
                return Letters.I;
            case 9:
                return Letters.J;
            case 10:
                return Letters.K;
            case 11:
                return Letters.L;
            case 12:
                return Letters.M;
            case 13:
                return Letters.N;
            case 14:
                return Letters.O;
            case 15:
                return Letters.P;
            case 16:
                return Letters.Q;
            case 17:
                return Letters.R;
            case 18:
                return Letters.S;
            case 19:
                return Letters.T;
            case 20:
                return Letters.U;
            case 21:
                return Letters.V;
            case 22:
                return Letters.W;
            case 23:
                return Letters.X;
            case 24:
                return Letters.Y;
            case 25:
                return Letters.Z;
                default:
                    return null;
        }
    }


    private boolean check_valid_position(int row, int column){
        if (board[row][column].equals("0"))
            return false;
        return true;
    }

    public String[][] get_board(){
        return this.board;
    }

    public void set_board(String[][] board) {
        this.board = board;
    }

    public LinkedList<Coin> get_coin_list() {
        return coin_list;
    }

    public void print_board(){
       for(int i = 0; i<board.length; i++){
           System.out.println(Arrays.toString(board[i]));
       }
    }

    enum Letters {
        A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
    }
}
