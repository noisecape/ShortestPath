package pathfinder.tommasocapecchi;

import java.util.UUID;

public class Coin extends ObjectInBoard {

    private int x_pos;
    private int y_pos;
    private boolean taken;
    private boolean has_neighbour;
    private double distance_from_character;
    private Coin neighbour;
    private String id;

    Coin(int x_pos, int y_pos){
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.taken = false;
        this.distance_from_character = 0.0;
        this.has_neighbour = false;
        this.id = UUID.randomUUID().toString();
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

    public Coin getNext_Coin() {
        return neighbour;
    }

    public void set_neighbour(Coin next_Coin) {
        this.neighbour = next_Coin;
    }

    public String getId() {
        return id;
    }

    public boolean isHas_neighbour() {
        return has_neighbour;
    }

    public void setHas_neighbour(boolean has_neighbour) {
        this.has_neighbour = has_neighbour;
    }
}
