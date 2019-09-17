package pathfinder.tommasocapecchi;

import java.util.LinkedList;
import java.util.List;

public class GraphGenerator {

    private final int MAX_DISTANCE = 10000;

    double compute_Euclid_distance(ObjectInBoard first_obj, ObjectInBoard second_obj){
        double result;
        result = Math.sqrt(Math.pow(second_obj.getX_pos()-first_obj.getX_pos(),2)+(Math.pow(second_obj.getY_pos()-first_obj.getY_pos(),2)));
        return result;
    }

    void create_nearest_edge_between_nodes(List<Coin> coin_list){
        List<Coin> graph = new LinkedList<>(coin_list);

    }
}
