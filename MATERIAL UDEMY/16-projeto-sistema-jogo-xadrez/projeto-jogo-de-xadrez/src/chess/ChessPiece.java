package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return super.toString()+"ChessPiece [color=" + color + "]";
	}
	
}
