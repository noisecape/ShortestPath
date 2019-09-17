package pathfinder.tommasocapecchi;

public class Main {
    public static void main(String args[]){

        Main m = new Main();
        Board board = m.create_board();
        ObjectInBoard character = m.create_character(board);
        GraphGenerator graphGenerator = m.create_graph_generator();

        m.init_board(board,character);
        m.compute_Euclid_distance_from_character(board,character,graphGenerator);
        m.create_edges_for_all_nodes(board,graphGenerator);
    }

    Board create_board(){
        return new Board(10,10,9);
    }

    Character create_character(Board board){
        return new Character(9,9, board.get_board());
    }

    GraphGenerator create_graph_generator(){
        return new GraphGenerator();
    }

    void init_board(Board board, ObjectInBoard character){
        if(character instanceof Character){
            Character new_character = (Character)character;
            board.set_board(new_character.getBoard());
        }
        System.out.println();
        board.print_board();
    }
    
    void compute_Euclid_distance_from_character(Board board, ObjectInBoard character, GraphGenerator graphGenerator){
        for (Coin coin :board.get_coin_list()) {
            coin.set_distace_from_character(graphGenerator.compute_Euclid_distance(character,coin));
        }
    }

    void create_edges_for_all_nodes(Board board, GraphGenerator graphGenerator){
        graphGenerator.create_nearest_edge_between_nodes(board.get_coin_list());
    }

}
