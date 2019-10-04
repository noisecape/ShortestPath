package pathfinder.tommasocapecchi;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
    	int rows = 10;
    	int columns = 10;
    	Main main = new Main();

        //number_of_nodes = 10 means that there are 9 coins and 1 root
        Board board = new Board(rows,columns,10);

        main.init_board(board);

        Graph graph = new Graph(rows, columns, board.get_nodes_in_board());
    }
    
    public void print_adiacency_matrix(double[][] adiacency_matrix){
    	System.out.println();
        for(int i = 0; i<adiacency_matrix.length; i++){
            System.out.println(Arrays.toString(adiacency_matrix[i]));
        }
     }

    void init_board(Board board){
        board.generate_nodes();
        System.out.println();
        board.print_board();
    }

}
