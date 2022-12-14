package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) this.getBoard().piece(position);
		return p == null || p.getColor() != this.getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[this.getBoard().getRows()][this.getBoard().getColumns()];

		Position p = new Position(0, 0);

		// testando a casa acima
		p.setValues(position.getRow() - 1, position.getColumn());
		if (this.getBoard().positionExists(p) && canMove(p))
			mat[p.getRow()][p.getColumn()] = true;

		// testando a casa abaixo
		p.setValues(position.getRow() + 1, position.getColumn());
		if (this.getBoard().positionExists(p) && canMove(p))
			mat[p.getRow()][p.getColumn()] = true;

		// testando a casa a esquerda
		p.setValues(position.getRow(), position.getColumn() - 1);
		if (this.getBoard().positionExists(p) && canMove(p))
			mat[p.getRow()][p.getColumn()] = true;

		// testando a casa a direita
		p.setValues(position.getRow(), position.getColumn() + 1);
		if (this.getBoard().positionExists(p) && canMove(p))
			mat[p.getRow()][p.getColumn()] = true;

		// testando a diagonal acima e esquerda
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if (this.getBoard().positionExists(p) && canMove(p))
			mat[p.getRow()][p.getColumn()] = true;

		// testando a diagonal acima e direita
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if (this.getBoard().positionExists(p) && canMove(p))
			mat[p.getRow()][p.getColumn()] = true;

		// testando a diagonal abaixo e esquerda
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if (this.getBoard().positionExists(p) && canMove(p))
			mat[p.getRow()][p.getColumn()] = true;

		// testando a diagonal abaixo e direita
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if (this.getBoard().positionExists(p) && canMove(p))
			mat[p.getRow()][p.getColumn()] = true;

		return mat;
	}

}
