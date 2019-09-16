package pathfinder.tommasocapecchi;

public class Coin extends ObjectInBoard {

    private int x_pos;
    private int y_pos;
    private boolean taken;
    private double distance_from_character;

    Coin(int x_pos, int y_pos){
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.taken = false;
        this.distance_from_character = 0.0;
    }

    public int getX_pos() {
        return x_pos;
    }

    public int getY_pos() {
        return y_pos;
    }

    public double get_distance_from_character() {
        return distance_from_character;
    }

    public void set_distace_from_character(double distance_from_character){
        this.distance_from_character = distance_from_character;
    }

    public boolean is_taken() {
        return taken;
    }

    public void set_taken(boolean taken) {
        this.taken = taken;
    }
}
