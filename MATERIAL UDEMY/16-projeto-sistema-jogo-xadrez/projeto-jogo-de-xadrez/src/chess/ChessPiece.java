package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.moveCount = 0;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	protected void increaseMoveCount() {
		this.moveCount++;
	}

	protected void decreaseMoveCount() {
		this.moveCount--;
	}

	public int getMoveCount() {
		return this.moveCount;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

	@Override
	public String toString() {
		return super.toString() + "ChessPiece [color=" + color + "]";
	}

}
