package Projeto.Xadres_Sistema.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Projeto.Xadres_Sistema.chess.ChessException;
import Projeto.Xadres_Sistema.chess.ChessMatch;
import Projeto.Xadres_Sistema.chess.ChessPiece;
import Projeto.Xadres_Sistema.chess.ChessPosition;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
