package pathfinder.tommasocapecchi;

import java.util.LinkedList;

public class GraphGenerator {

    private final int MAX_DISTANCE = 10000;

    double compute_Euclid_distance(ObjectInBoard first_obj, ObjectInBoard second_obj){
        double result;
        result = Math.sqrt(Math.pow(second_obj.getX_pos()-first_obj.getX_pos(),2)+(Math.pow(second_obj.getY_pos()-first_obj.getY_pos(),2)));
        return result;
    }

    void compute_distance_between_nodes(LinkedList<Coin> coin_list){
        for(int i = 0; i<coin_list.size()-1; i++){
            Coin c1 = coin_list.get(i);
            Coin c2 = coin_list.get(i+1);
            c1.set_distance_from_neighbour(compute_Euclid_distance(c1,c2));
            c1.set_neighbour(c2);
        }
        Coin last = coin_list.getLast();
        last.set_distance_from_neighbour(this.compute_Euclid_distance(last,coin_list.getFirst()));
        last.set_neighbour(coin_list.getFirst());
    }

}
