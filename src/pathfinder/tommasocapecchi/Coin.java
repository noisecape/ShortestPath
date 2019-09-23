package pathfinder.tommasocapecchi;

import java.util.UUID;

public class Coin extends ObjectInBoard {

    private int x_pos;
    private int y_pos;
    private boolean taken;
    private double distance_from_character;
    private double distance_from_neighbour;
    private ObjectInBoard next_object;
    private ObjectInBoard previous_object;
    private Board.Letters letters;
    private String id;

    Coin(int x_pos, int y_pos){
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.taken = false;
        this.distance_from_character = 0.0;
        this.distance_from_neighbour = 0.0;
        this.id = UUID.randomUUID().toString();
        this.letters = null;
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

    public ObjectInBoard getNext_Coin() {
        return next_object;
    }

    public void set_next_object(Coin next_Coin) {
        this.next_object = next_Coin;
    }

    public ObjectInBoard get_previous_object() {
        return previous_object;
    }

    public void set_previous_object(ObjectInBoard previous_object) {
        this.previous_object = previous_object;
    }

    public String getId() {
        return id;
    }

    public double get_distance_from_neighbour() {
        return distance_from_neighbour;
    }

    public void set_distance_from_neighbour(double distance_from_neighbour) {
        this.distance_from_neighbour = distance_from_neighbour;
    }

    public Board.Letters get_letters() {
        return letters;
    }

    public void set_letters(Board.Letters letters) {
        this.letters = letters;
    }
}
