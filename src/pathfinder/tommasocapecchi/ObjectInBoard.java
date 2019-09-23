package pathfinder.tommasocapecchi;

public abstract class ObjectInBoard {
    int x_pos, y_pos;
    ObjectInBoard previous;
    ObjectInBoard next;
    abstract int getX_pos();
    abstract int getY_pos();

}
