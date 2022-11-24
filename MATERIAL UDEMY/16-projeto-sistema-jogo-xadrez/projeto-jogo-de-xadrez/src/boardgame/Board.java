package boardgame;

import java.util.Arrays;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1)
			throw new BoardException("Erro criando tabuleiro: é necessário que haja pelo menos 1 linha e 1 coluna");

		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	@Override
	public String toString() {
		return "Board [rows=" + rows + ", columns=" + columns + ", pieces=" + Arrays.toString(pieces) + "]";
	}

	public Piece piece(int row, int column) {
		if (!this.positionExists(row, column))
			throw new BoardException("Essa posição não consta no tabuleiro");

		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!this.positionExists(position))
			throw new BoardException("Essa posição não consta no tabuleiro");

		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (this.thereIsAPiece(position))
			throw new BoardException("Já existe uma peça na posição " + position);

		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < this.rows && column >= 0 && column < this.columns;
	}

	public boolean positionExists(Position position) {
		return this.positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!this.positionExists(position))
			throw new BoardException("Essa posição não consta no tabuleiro");
		
		return this.piece(position) != null;
	}
}
