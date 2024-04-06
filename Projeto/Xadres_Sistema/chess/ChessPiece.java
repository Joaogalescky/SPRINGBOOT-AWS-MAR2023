package Projeto.Xadres_Sistema.chess;

import Projeto.Xadres_Sistema.boardgame.Board;
import Projeto.Xadres_Sistema.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
