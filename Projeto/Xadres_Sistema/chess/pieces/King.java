package Projeto.Xadres_Sistema.chess.pieces;

import Projeto.Xadres_Sistema.boardgame.Board;
import Projeto.Xadres_Sistema.chess.ChessPiece;
import Projeto.Xadres_Sistema.chess.Color;

// Rei
public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
