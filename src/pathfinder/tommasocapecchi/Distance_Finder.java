package pathfinder.tommasocapecchi;

import java.util.Iterator;
import java.util.LinkedList;

public class Distance_Finder {

    private final int MAX_DISTANCE = 10000;
    private LinkedList<ObjectInBoard> objects_in_board;

    Distance_Finder(LinkedList<ObjectInBoard> objects_in_board){
        this.objects_in_board = objects_in_board;
    }

    double compute_Euclid_distance(ObjectInBoard first_obj, ObjectInBoard second_obj){
        double result;
        result = Math.sqrt(Math.pow(second_obj.getX_pos()-first_obj.getX_pos(),2)+(Math.pow(second_obj.getY_pos()-first_obj.getY_pos(),2)));
        return result;
    }

    public ObjectInBoard find_neighbor(ObjectInBoard object) {
        double min_distance = MAX_DISTANCE, current_distance = 0;
        return null;
    }

    private Character compute_next_element_for_character(Character character){
        return character;
    }

    private void compute_next_element_for_coin(){

    }

    public LinkedList<ObjectInBoard> get_objects_in_board() {
        return objects_in_board;
    }

    public void set_objects_in_board(LinkedList<ObjectInBoard> objects_in_board) {
        this.objects_in_board = objects_in_board;
    }
}
