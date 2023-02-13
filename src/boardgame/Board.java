package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Pice[][] pices;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pices = new Pice[rows][columns];
	}
	
}
