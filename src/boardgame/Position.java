package boardgame;

public class Position {
	
	private int rows;
	private int columns;
	
	public Position(int rows, int colmuns) {
		this.rows =rows;
		this.columns = colmuns;
	}

	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	@Override
	public String toString() {
		return rows + ", " + columns; 
	}

}
