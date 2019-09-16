package pathfinder.tommasocapecchi;

public class GraphGenerator {

    double compute_Euclid_distance(ObjectInBoard first_obj, ObjectInBoard second_obj){
        double result;
        result = Math.sqrt(Math.pow(second_obj.getX_pos()-first_obj.getX_pos(),2)+(Math.pow(second_obj.getY_pos()-first_obj.getY_pos(),2)));
        return result;
    }


}
