package Projeto.Xadres_Sistema.application;

import Projeto.Xadres_Sistema.boardgame.Board;
import Projeto.Xadres_Sistema.boardgame.Position;
import Projeto.Xadres_Sistema.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
