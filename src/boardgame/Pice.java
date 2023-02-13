package boardgame;

public class Pice {
	protected Position position;
	private Board board;
	
	public Pice(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

}
