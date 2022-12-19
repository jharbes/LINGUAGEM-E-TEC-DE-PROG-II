package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		ChessMatch chessMatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();

		while (!chessMatch.getCheckMate()) {
			try {
				UI.clearScreen();
				UI.printMatch(chessMatch,captured);
				System.out.println();
				System.out.print("Origem: ");
				ChessPosition source = UI.readChessPosition(teclado);

				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				System.out.println();
				System.out.print("Destino: ");
				ChessPosition target = UI.readChessPosition(teclado);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				
				if (capturedPiece != null)
					captured.add(capturedPiece);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				teclado.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				teclado.nextLine();
			}
		}
		UI.clearScreen();
		UI.printMatch(chessMatch, captured);
	}

}
