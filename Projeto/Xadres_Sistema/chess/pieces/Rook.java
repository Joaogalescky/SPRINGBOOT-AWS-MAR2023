package Projeto.Xadres_Sistema.chess.pieces;

import Projeto.Xadres_Sistema.boardgame.Board;
import Projeto.Xadres_Sistema.chess.ChessPiece;
import Projeto.Xadres_Sistema.chess.Color;

// Torre
public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
