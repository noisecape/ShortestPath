package pathfinder.tommasocapecchi;

import java.util.LinkedList;

public class Main {
    public static void main(String args[]){

        Main m = new Main();

        Board board = new Board(10,10,9);

        ObjectInBoard character = new Character(9,9, board.get_board());

        m.init_board(board,character);

        Distance_Finder distance_finder = new Distance_Finder(board.get_objects_in_board());

        m.find_nearest_neighbour(distance_finder);

        m.compute_shortest_path(character, board, distance_finder);


    }

    void init_board(Board board, ObjectInBoard character){
        if(character instanceof Character){
            Character new_character = (Character)character;
            board.get_objects_in_board().addFirst(new_character);
        }
        System.out.println();
        board.print_board();
    }

    void find_nearest_neighbour(Distance_Finder distance_finder){
        for(ObjectInBoard object : distance_finder.get_objects_in_board()){
            distance_finder.find_neighbor(object);
        }
    }

    void compute_shortest_path(ObjectInBoard character,Board board, Distance_Finder graphGenerator){

    }

}
