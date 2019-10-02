package pathfinder.tommasocapecchi;

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

    void init_board(Board board){
        board.generate_nodes();
        System.out.println();
        board.print_board();
    }

}
