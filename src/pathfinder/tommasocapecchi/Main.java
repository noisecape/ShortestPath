package pathfinder.tommasocapecchi;

public class Main {
    public static void main(String args[]){
        Board board = new Board(10,10,9);
        Character character = new Character(9,9, board.get_board());
        board.setBoard(character.getBoard());
        System.out.println();
        board.print_board();
    }
}
