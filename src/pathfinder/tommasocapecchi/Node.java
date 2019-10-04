package pathfinder.tommasocapecchi;

import java.util.UUID;

import pathfinder.tommasocapecchi.Board.Letters;

public class Node {
	
    private int x_pos, y_pos;
    private int index;
    private final String ID;
    private Board.Letters letters;
    
    Node(int index, int x_position, int y_position){
    	this.ID = UUID.randomUUID().toString();
    	this.set_x(x_position);
    	this.set_y(y_position);
    	this.set_index(index);
    }

    public String get_id() {
    	return this.ID;
    }
    
    public int get_x() {
    	return this.x_pos;
    }
    
    public int get_y() {
    	return this.y_pos;
    }
    
    public void set_x(int x) {
    	this.x_pos = x;
    }
    
    public void set_y(int y) {
    	this.y_pos = y;
    }
    
    public void set_index(int index) {
    	this.index = index;
    }
    
    public int get_index() {
    	return this.index;
    }
    
    public Board.Letters get_letters() {
        return letters;
    }

    public void set_letters(Board.Letters letters) {
        this.letters = letters;
    }
}
