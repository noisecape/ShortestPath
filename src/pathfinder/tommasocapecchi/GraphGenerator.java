package pathfinder.tommasocapecchi;

import java.util.Iterator;
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
        Iterator<Coin> iterator = coin_list.iterator();
        while(iterator.hasNext()){
            Coin coin = iterator.next();
            coin.set_neighbour(this.find_neighbour(coin,coin_list));
            coin.setHas_neighbour(true);
        }
    }

    Coin find_neighbour(Coin coin, List<Coin> coin_list){
        double optimal_distance = MAX_DISTANCE;
        Coin neighbour = null;
        for (Coin coin_selected: coin_list) {
            if (!coin_selected.isHas_neighbour() && !(coin.getId().equals(coin_selected.getId()))) {
                double distance = this.compute_Euclid_distance(coin, coin_selected);
                if (distance < optimal_distance) {
                    optimal_distance = distance;
                    neighbour = coin_selected;
                }
            }
        }
        return neighbour;
    }
}
